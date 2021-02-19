/*
 * Class Name: AbstractClient
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.common;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Joiner;
import com.zkteco.open.common.exception.ZKSDKException;
import com.zkteco.open.constant.UrlConstants;
import com.zkteco.open.constant.ZKMessageConstants;
import com.zkteco.open.constant.ZKMessageErrorCodes;
import com.zkteco.open.model.base.EncryptionMessage;
import com.zkteco.open.model.base.Message;
import com.zkteco.open.model.oauth.OAuthResponse;
import com.zkteco.open.util.*;

import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractClient {


    /**
     * The credential that made the request
     */
    private Certificate certificate;

    protected AbstractClient(Certificate certificate) {
        this.certificate = certificate;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    /**
     * Unified entry for unencrypted requests
     *
     * @param request
     * @param businessName
     * @return Message
     */
    protected <T> Message internalRequest(T request, String businessName) throws ZKSDKException {
        Message reqMsg = new Message(true);
        MessageUtils.addPayloadParams(reqMsg, JSON.parseObject(JSON.toJSONString(request)));
        String url = UrlConstants.BASE_URL.concat(businessName);
        if (request instanceof Pagination) {
            MessageUtils.addPayload(reqMsg, ZKMessageConstants.CUR_PAGE, ((Pagination) request).getCurPage());
            MessageUtils.addPayload(reqMsg, ZKMessageConstants.PAGE_SIZE, ((Pagination) request).getPageSize());
        }
        String accessToken = getAccessToken();
        Map<String, String> requestHeader = getRequestHeader();
        try {
            return postRequest(reqMsg, requestHeader, url, accessToken);
        } catch (Exception e) {
            throw new ZKSDKException(ZKMessageErrorCodes.SDKErrorCode.ERROR_REQUEST, e.getMessage());
        }
    }

    /**
     * Unified entry for encryption requests
     *
     * @param request
     * @param businessName
     * @return Message
     */
    protected <T> Message internalEncryptionRequest(T request, String businessName) throws ZKSDKException {
        Message reqMsg = new Message(true);
        MessageUtils.addPayloadParams(reqMsg, JSON.parseObject(JSON.toJSONString(request)));
        if (request instanceof Pagination) {
            MessageUtils.addPayload(reqMsg, ZKMessageConstants.CUR_PAGE, ((Pagination) request).getCurPage());
            MessageUtils.addPayload(reqMsg, ZKMessageConstants.PAGE_SIZE, ((Pagination) request).getPageSize());
        }
        String encryptMsg = EncryptionUtils.AES256Encode(reqMsg.toString(), certificate.getAppAESKey());
        EncryptionMessage encryptionMessage = new EncryptionMessage();
        encryptionMessage.setEncryptData(encryptMsg);
        String url = UrlConstants.BASE_URL.concat(businessName);
        String accessToken = getAccessToken();
        Map<String, String> requestHeader = getRequestHeader();
        try {
            return postRequest(encryptionMessage, requestHeader, url, accessToken);
        } catch (Exception e) {
            throw new ZKSDKException(ZKMessageErrorCodes.SDKErrorCode.ERROR_REQUEST, e.getMessage());
        }
    }

    /**
     * Initiating a POST request
     *
     * @param reqBody
     * @param url
     * @param accessToken
     * @return Message
     */
    private Message postRequest(Object reqBody, Map<String, String> requestHeader, String url, String accessToken) throws ZKSDKException {
        Message respMsg = HttpUtils.post(url, requestHeader, accessToken, reqBody);
        String msgCode = respMsg.getCode();
        if (ZKMessageConstants.SUCCESS_CODE.equals(msgCode)) {
            return respMsg;
        }
        if (ZKMessageErrorCodes.InnerErrorCode.TOKEN_EMPTY.equals(msgCode)
                || ZKMessageErrorCodes.InnerErrorCode.TOKEN_EXPIRED.equals(msgCode)
                || ZKMessageErrorCodes.InnerErrorCode.TOKEN_INVALID.equals(msgCode)
                || ZKMessageErrorCodes.InnerErrorCode.TOKEN_EXPIRED_REFRESH.equals(msgCode)) {
            respMsg = HttpUtils.post(url, requestHeader, accessToken, reqBody);
        }
        if (!MessageUtils.isSuccess(respMsg)) {
            throw new ZKSDKException(ZKMessageErrorCodes.SDKErrorCode.ERROR_REQUEST, respMsg.getMessage());
        }
        return respMsg;
    }

    /**
     * Get the access token of request
     *
     * @param
     * @return String
     */
    private String getAccessToken() {
        String accessToken = TokenCache.get(TokenCache.TOKEN_KEY.concat(certificate.getAppKey()));
        if (accessToken != null) {
            return accessToken;
        }
        return this.oauth();
    }

    /**
     * Enter the authentication authorization step
     *
     * @param
     * @return String
     */
    private String oauth() {
        String url = UrlConstants.BASE_URL.concat(UrlConstants.OAUTH).concat(formatRequestData(certificate));
        OAuthResponse oAuthResponse = HttpUtils.get(url, OAuthResponse.class);
        if (!ZKMessageConstants.SUCCESS_CODE.equals(oAuthResponse.getCode())) {
            throw new RuntimeException("com.zkteco.open.common.AbstractClient exception, result:".concat(JSON.toJSONString(oAuthResponse)));
        }
        String token = oAuthResponse.getAccessToken();
        if (oAuthResponse.getExpiresIn() < (100 * 60)) {
            url = UrlConstants.BASE_URL.concat(UrlConstants.REFRESH_TOKEN).concat(formatRequestData(certificate));
            oAuthResponse = HttpUtils.get(url, OAuthResponse.class);
            if (!ZKMessageConstants.SUCCESS_CODE.equals(oAuthResponse.getCode())) {
                throw new RuntimeException("com.zkteco.open.common.AbstractClient refresh oauth exception, result:".concat(JSON.toJSONString(oAuthResponse)));
            }
            token = oAuthResponse.getAccessToken();
        }
        TokenCache.set(TokenCache.TOKEN_KEY.concat(certificate.getAppKey()), token);
        return token;
    }

    /**
     * Format authentication request
     *
     * @param certificate
     * @return String
     */
    private String formatRequestData(Certificate certificate) {
        Map<String, Object> param = new HashMap<>(16);
        String nonce = MessageUtils.randomCode(8);
        long timeMillis = System.currentTimeMillis();
        String sign = this.generateSign(certificate.getAppKey(), certificate.getAppSecret(), timeMillis, nonce);
        param.put(ZKMessageConstants.APP_KEY, certificate.getAppKey());
        param.put(ZKMessageConstants.APP_SECRET, certificate.getAppSecret());
        param.put(ZKMessageConstants.NONCE, nonce);
        param.put(ZKMessageConstants.TIMESTAMP_LOWER, timeMillis);
        param.put(ZKMessageConstants.SIGN, sign);
        return Joiner.on("&").withKeyValueSeparator("=").join(param);
    }

    /**
     * Generate the sign of oauth
     *
     * @param appKey
     * @param appSecret
     * @param timestamp
     * @param nonce
     * @return String
     */
    private String generateSign(String appKey, String appSecret, Long timestamp, String nonce) {
        return MD5Utils.encode(appKey + timestamp + nonce + appSecret);
    }

    private Map<String, String> getRequestHeader() {
        Map<String, String> header = new HashMap<>(16);
        header.put("sdkVersion", "bmp_sdk_v0.0.1-SNAPSHOOT");
        header.put("plateForm", "bmp_sdk");
        try {
            header.put("userIp", IpAddressUtils.getRealIpAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
            header.put("userIp", "unknown");
        }
        return header;
    }
}

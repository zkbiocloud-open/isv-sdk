/*
 * Class Name: OAuthResponse
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.oauth;

import java.io.Serializable;

/**
 * dto-OAuthResponseDTO
 *
 * @author cooper.lin
 * @date 2020/12/29
 * @since 1.0.0
 */
public class OAuthResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private String code;

    /**
     * 信息
     */
    private String message;

    /**
     * token
     */
    private String accessToken;

    /**
     * 过期时间
     */
    private Long expiresIn;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }
}

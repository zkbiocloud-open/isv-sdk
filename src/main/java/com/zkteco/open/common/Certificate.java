/*
 * Class Name: Certificate
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.common;

public class Certificate {

    private String appKey;

    private String appSecret;

    private String appAESKey;

    public Certificate() {
    }

    public Certificate(String appKey, String appSecret, String encodingAESKey) {
        this.appKey = appKey;
        this.appSecret = appSecret;
        this.appAESKey = encodingAESKey;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getAppAESKey() {
        return appAESKey;
    }

    public void setAppAESKey(String appAESKey) {
        this.appAESKey = appAESKey;
    }
}

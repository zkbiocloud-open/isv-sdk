/*
 * Class Name: HealthCodeVerifyRequest
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2019 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.health.request;

import java.io.Serializable;

public class HealthCodeVerifyRequest implements Serializable {

    private static final long serialVersionUID = 4123631947706243119L;

    /** 国康码 */
    private String qrCode;
    /** 签名 */
    private String sign;

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}

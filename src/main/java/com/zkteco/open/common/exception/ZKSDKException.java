/*
 * Class Name: ZKSDKException
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.common.exception;

import java.io.Serializable;

public class ZKSDKException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1L;

    private String code;

    private String message;

    public ZKSDKException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public ZKSDKException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

/*
 * Class Name: BaseResponse
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.base;

import java.io.Serializable;

public class BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 响应返回码
     */
    private String code;

    /**
     * 响应消息
     */
    private String message;

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
}
/*
 * Class Name: CreateAccessRuleResponse
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.access.response;

import com.zkteco.open.model.base.BaseResponse;

import java.io.Serializable;

public class CreateAccessRuleResponse extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 规则ID（32位的uuid）
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
/*
 * Class Name: QueryRuleToDoorRequest
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.access.request;

import com.zkteco.open.model.base.BaseRequest;

import java.io.Serializable;

public class QueryRuleToDoorRequest extends BaseRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 规则id
     */
    private String ruleId;

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

}
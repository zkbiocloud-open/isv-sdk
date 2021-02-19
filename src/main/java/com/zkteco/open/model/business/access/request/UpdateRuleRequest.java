/*
 * Class Name: UpdateRuleRequest
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.access.request;

import com.zkteco.open.model.business.access.dto.RuleDTO;

import java.io.Serializable;

public class UpdateRuleRequest extends RuleDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 组织id
     */
    private String unitId;

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }
}
/*
 * Class Name: AssignRuleToDoorRequest
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.access.request;

import com.zkteco.open.model.base.BaseRequest;

import java.io.Serializable;
import java.util.List;

public class AssignRuleToDoorRequest extends BaseRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    /*规则ID*/
    private String ruleId;
    /*新增绑定的门ID集合*/
    private List<String> bindDoorIds;
    /*解绑已绑定过的门ID集合*/
    private List<String> unbindDoorIds;

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public List<String> getBindDoorIds() {
        return bindDoorIds;
    }

    public void setBindDoorIds(List<String> bindDoorIds) {
        this.bindDoorIds = bindDoorIds;
    }

    public List<String> getUnbindDoorIds() {
        return unbindDoorIds;
    }

    public void setUnbindDoorIds(List<String> unbindDoorIds) {
        this.unbindDoorIds = unbindDoorIds;
    }
}
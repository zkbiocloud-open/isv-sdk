/*
 * Class Name: AssignRuleToPersonRequest
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.access.request;

import com.zkteco.open.model.base.BaseRequest;

import java.io.Serializable;
import java.util.List;

public class AssignRuleToPersonRequest extends BaseRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /*规则ID*/
    private String ruleId;
    /*新增绑定的人Id集合*/
    private List<String> bindPersonIds;
    /*解绑已绑定过的人ID集合*/
    private List<String> unbindPersonIds;

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public List<String> getBindPersonIds() {
        return bindPersonIds;
    }

    public void setBindPersonIds(List<String> bindPersonIds) {
        this.bindPersonIds = bindPersonIds;
    }

    public List<String> getUnbindPersonIds() {
        return unbindPersonIds;
    }

    public void setUnbindPersonIds(List<String> unbindPersonIds) {
        this.unbindPersonIds = unbindPersonIds;
    }
}
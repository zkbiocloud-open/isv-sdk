package com.zkteco.open.model.business.attendance.request;

import com.zkteco.open.model.base.BaseRequest;

import java.io.Serializable;

public class QueryGroupToPersonRequest extends BaseRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 考勤组Id
     */
    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
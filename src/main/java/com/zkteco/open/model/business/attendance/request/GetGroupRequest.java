package com.zkteco.open.model.business.attendance.request;

import com.zkteco.open.model.base.BaseRequest;

import java.io.Serializable;

public class GetGroupRequest extends BaseRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 考勤组Id
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
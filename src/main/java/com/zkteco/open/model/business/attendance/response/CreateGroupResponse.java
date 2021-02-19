package com.zkteco.open.model.business.attendance.response;

import com.zkteco.open.model.base.BaseResponse;

import java.io.Serializable;

public class CreateGroupResponse extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 考勤组ID（32位的uuid）
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
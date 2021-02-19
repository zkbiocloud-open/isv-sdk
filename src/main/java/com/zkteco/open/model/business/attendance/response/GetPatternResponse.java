package com.zkteco.open.model.business.attendance.response;

import com.zkteco.open.model.base.BaseResponse;

import java.io.Serializable;

public class GetPatternResponse extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 设备管理模式
     */
    private String pattern;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
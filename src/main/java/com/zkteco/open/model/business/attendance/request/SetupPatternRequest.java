package com.zkteco.open.model.business.attendance.request;

import com.zkteco.open.model.base.BaseRequest;

import java.io.Serializable;

public class SetupPatternRequest extends BaseRequest implements Serializable {
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
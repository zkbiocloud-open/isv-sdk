package com.zkteco.open.model.business.attendance.request;

import com.zkteco.open.common.Pagination;

import java.io.Serializable;

public class PageDeviceToPersonRequest extends Pagination implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 组织Id
     */
    private String unitId;

    /**
     * 设备Id
     */
    private String deviceId;

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
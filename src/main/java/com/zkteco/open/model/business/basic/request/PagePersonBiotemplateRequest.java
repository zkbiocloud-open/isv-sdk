package com.zkteco.open.model.business.basic.request;

import com.zkteco.open.common.Pagination;

import java.io.Serializable;

public class PagePersonBiotemplateRequest extends Pagination implements Serializable {
    private static final long serialVersionUID = 1L;

    private String unitId;

    private String deviceId;

    private String biotemplateType;

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

    public String getBiotemplateType() {
        return biotemplateType;
    }

    public void setBiotemplateType(String biotemplateType) {
        this.biotemplateType = biotemplateType;
    }

}
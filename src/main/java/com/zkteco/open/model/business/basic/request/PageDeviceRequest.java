package com.zkteco.open.model.business.basic.request;

import com.zkteco.open.common.Pagination;

import java.io.Serializable;

public class PageDeviceRequest extends Pagination implements Serializable {
    private static final long serialVersionUID = 1L;

    private String unitId;

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }
}
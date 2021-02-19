/*
 * Class Name: BaseRequest
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.base;

import java.io.Serializable;

public class BaseRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 组织Id
     */
    private String unitId;

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }
}
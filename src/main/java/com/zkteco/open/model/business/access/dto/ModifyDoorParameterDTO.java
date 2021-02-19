/*
 * Class Name: ModifyDoorParameterDTO
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.access.dto;

import java.io.Serializable;

public class ModifyDoorParameterDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 参数名
     */
    private String name;

    /**
     * 参数值
     */
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
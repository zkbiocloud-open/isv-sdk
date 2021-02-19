/*
 * Class Name: ModifyDoorNameRequest
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.access.request;

import com.zkteco.open.model.base.BaseRequest;

import java.io.Serializable;

public class ModifyDoorNameRequest extends BaseRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 门id
     */
    private String id;

    /**
     * 门名称
     */
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
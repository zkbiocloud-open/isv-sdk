package com.zkteco.open.model.business.basic.response;

import com.zkteco.open.model.base.BaseResponse;

import java.io.Serializable;

public class CreateOrganizationResponse extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 组织Id
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
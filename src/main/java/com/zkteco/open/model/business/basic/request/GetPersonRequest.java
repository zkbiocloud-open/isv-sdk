package com.zkteco.open.model.business.basic.request;

import com.zkteco.open.model.base.BaseRequest;

import java.io.Serializable;

public class GetPersonRequest extends BaseRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
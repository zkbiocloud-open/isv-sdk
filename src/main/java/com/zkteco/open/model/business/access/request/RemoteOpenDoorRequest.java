/*
 * Class Name: RemoteOpenDoorRequest
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.access.request;

import com.zkteco.open.model.base.BaseRequest;

import java.io.Serializable;

public class RemoteOpenDoorRequest extends BaseRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 门id
     */
    private String id;

    /**
     * 人员编号
     */
    private String personNo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPersonNo() {
        return personNo;
    }

    public void setPersonNo(String personNo) {
        this.personNo = personNo;
    }
}
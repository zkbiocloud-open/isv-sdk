/*
 * Class Name: QueryDeviceRequest
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2019 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.video.request;

import com.zkteco.open.model.base.BaseRequest;

public class QueryVideoDeviceRequest extends BaseRequest {

    private String uid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}

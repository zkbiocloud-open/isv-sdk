/*
 * Class Name: CreateHomeRequest
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2019 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.video.request.tuya;

import com.zkteco.open.model.base.BaseRequest;

public class CreateHomeRequest extends BaseRequest {

    private String uid;
    private String timezone;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}

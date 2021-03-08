/*
 * Class Name: GetDeviceTokenResultRequest
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2019 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.video.request;

import com.zkteco.open.model.base.BaseRequest;

public class GetDeviceTokenResultRequest extends BaseRequest {

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

/*
 * Class Name: DeleteVideoDeviceRequest
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2019 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.video.request.tuya;

import com.zkteco.open.model.base.BaseRequest;

public class DeleteVideoDeviceRequest extends BaseRequest {

    private String deviceId;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}

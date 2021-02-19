package com.zkteco.open.model.business.attendance.request;

import com.zkteco.open.model.base.BaseRequest;

import java.io.Serializable;

public class ClearDeviceToPersonRequest extends BaseRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 设备Id
     */
    private String deviceId;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
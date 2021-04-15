/*
 * Class Name: AddDeviceRequest
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2019 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.video.request.ys;

import com.zkteco.open.model.base.BaseRequest;

public class AddDeviceRequest extends BaseRequest {

    private String validateCode;
    private String sn;

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }
}

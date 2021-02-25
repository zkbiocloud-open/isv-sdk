/*
 * Class Name: HealthCodeServiceClient
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2019 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.api;

import com.zkteco.open.common.AbstractClient;
import com.zkteco.open.common.Certificate;
import com.zkteco.open.constant.UrlConstants;
import com.zkteco.open.model.base.Message;
import com.zkteco.open.model.business.health.request.HealthCodeVerifyRequest;

public class HealthCodeServiceClient extends AbstractClient {

    public HealthCodeServiceClient(Certificate certificate) {
        super(certificate);
    }

    /**
     * 功能描述：国康码核验
     *
     * @param request HealthCodeVerifyRequest
     * @return com.zkteco.open.model.base.Message
     */
    public Message healthCodeVerify(HealthCodeVerifyRequest request) {
        Message message = this.internalEncryptionRequest(request, UrlConstants.HEALTH_CODE_VERIFY);
        return message;
    }

}

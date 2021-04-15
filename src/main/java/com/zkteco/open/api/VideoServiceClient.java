/*
 * Class Name: VideoServiceClient
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2019 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.api;

import com.zkteco.open.common.AbstractClient;
import com.zkteco.open.common.Certificate;
import com.zkteco.open.constant.UrlConstants;
import com.zkteco.open.model.base.BaseRequest;
import com.zkteco.open.model.base.Message;
import com.zkteco.open.model.business.video.request.tuya.*;
import com.zkteco.open.model.business.video.request.ys.AddDeviceRequest;

public class VideoServiceClient extends AbstractClient {

    protected VideoServiceClient(Certificate certificate) {
        super(certificate);
    }

    /**
     * 功能描述：同步用户
     *
     * @param request
     * @return com.zkteco.open.model.base.Message
     */
    public Message syncUser2TuYa(SyncUserRequest request) {
        return this.internalEncryptionRequest(request, UrlConstants.VIDEO_SYNC_USER);
    }

    /**
     * 功能描述：生成配网token
     *
     * @param request
     * @return com.zkteco.open.model.base.Message
     */
    public Message generateDeviceToken2TuYa(GenerateDeviceTokenRequest request) {
        return this.internalEncryptionRequest(request, UrlConstants.VIDEO_GET_DEVICE_TOKEN);
    }

    /**
     * 功能描述：获取配网结果
     *
     * @param request
     * @return com.zkteco.open.model.base.Message
     */
    public Message getDeviceTokenResult2TuYa(GetDeviceTokenResultRequest request) {
        return this.internalEncryptionRequest(request, String.format(UrlConstants.VIDEO_GET_DEVICE_TOKEN_RESULT, request.getToken()));
    }

    /**
     * 功能描述：根据uid查询设备列表
     *
     * @param request
     * @return com.zkteco.open.model.base.Message
     */
    public Message queryDeviceByUid2TuYa(QueryVideoDeviceRequest request) {
        return this.internalEncryptionRequest(request, String.format(UrlConstants.VIDEO_LIST_DEVICE_UID, request.getUid()));
    }

    /**
     * 功能描述：删除设备
     *
     * @param request
     * @return com.zkteco.open.model.base.Message
     */
    public Message deleteDevice2TuYa(DeleteVideoDeviceRequest request) {
        return this.internalEncryptionRequest(request, String.format(UrlConstants.VIDEO_DELETE_DEVICE, request.getDeviceId()));
    }

    /**
     * 功能描述：创建家庭
     *
     * @param request
     * @return com.zkteco.open.model.base.Message
     */
    public Message createHome2TuYa(CreateHomeRequest request) {
        return this.internalEncryptionRequest(request, UrlConstants.VIDEO_CREATE_HOME);
    }

    /**
     * 功能描述：获取萤石accessToken
     *
     * @param request
     * @return com.zkteco.open.model.base.Message
     */
    public Message getAccessToken2Ys(BaseRequest request) {
        return this.internalEncryptionRequest(request, UrlConstants.VIDEO_GET_ACCESS_TOKEN_YS);
    }

    /**
     * 功能描述：添加萤石设备
     *
     * @param request
     * @return com.zkteco.open.model.base.Message
     */
    public Message addDevice2Ys(AddDeviceRequest request) {
        return internalEncryptionRequest(request, UrlConstants.VIDEO_ADD_DEVICE_YS);
    }
}

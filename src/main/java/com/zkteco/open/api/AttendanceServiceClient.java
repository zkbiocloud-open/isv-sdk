/*
 * Class Name: AttendanceServiceClient
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.api;

import cn.hutool.core.bean.BeanUtil;
import com.zkteco.open.common.AbstractClient;
import com.zkteco.open.common.Certificate;
import com.zkteco.open.constant.UrlConstants;
import com.zkteco.open.model.base.BaseResponse;
import com.zkteco.open.model.base.Message;
import com.zkteco.open.model.business.access.dto.PersonDetailDTO;
import com.zkteco.open.model.business.attendance.dto.AttendanceGroupDTO;
import com.zkteco.open.model.business.attendance.dto.PunchRecordDTO;
import com.zkteco.open.model.business.attendance.request.*;
import com.zkteco.open.model.business.attendance.response.*;
import com.zkteco.open.model.business.basic.dto.DeviceDTO;
import com.zkteco.open.util.MessageUtils;
import com.zkteco.open.util.ModelConvertUtils;

public class AttendanceServiceClient extends AbstractClient {

    public AttendanceServiceClient(Certificate credential, String url) {
        super(credential);
    }

    /**
     * 设置设备管理模式
     *
     * @param request SetupPatternRequest
     * @return BaseResponse
     */
    public BaseResponse setUpPattern(SetupPatternRequest request) {
        BaseResponse response = new BaseResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.SETUP_ATTENDANCE_PATTERN);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 查询设备管理模式
     *
     * @param request GetPatternRequest
     * @return GetPatternResponse
     */
    public GetPatternResponse getPattern(GetPatternRequest request) {
        GetPatternResponse response = new GetPatternResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.QUERY_ATTENDANCE_PATTERN);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setPattern(ModelConvertUtils.messageToDto(respMsg, String.class));
        }
        return response;
    }

    /**
     * 创建考勤组
     *
     * @param request CreateGroupRequest
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroup(CreateGroupRequest request) {
        CreateGroupResponse response = new CreateGroupResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.CREATE_ATTENDANCE_GROUP);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setId(ModelConvertUtils.messageToDto(respMsg, String.class));
        }
        return response;
    }

    /**
     * 删除考勤组
     *
     * @param request DeleteGroupRequest
     * @return BaseResponse
     */
    public BaseResponse deleteGroup(DeleteGroupRequest request) {
        BaseResponse response = new BaseResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.DELETE_ATTENDANCE_GROUP);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 更新考勤组
     *
     * @param request UpdateGroupRequest
     * @return BaseResponse
     */
    public BaseResponse updateGroup(UpdateGroupRequest request) {
        BaseResponse response = new BaseResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.UPDATE_ATTENDANCE_GROUP);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 读取考勤组
     *
     * @param request GetGroupRequest
     * @return GetGroupResponse
     */
    public GetGroupResponse getGroup(GetGroupRequest request) {
        GetGroupResponse response = new GetGroupResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.GET_ATTENDANCE_GROUP);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            AttendanceGroupDTO dto = ModelConvertUtils.messageToDto(respMsg, AttendanceGroupDTO.class);
            BeanUtil.copyProperties(dto, response);
        }
        return response;
    }

    /**
     * 查询考勤组
     *
     * @param request QueryGroupRequest
     * @return QueryGroupResponse
     */
    public QueryGroupResponse findGroupList(QueryGroupRequest request) {
        QueryGroupResponse response = new QueryGroupResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.QUERY_ATTENDANCE_GROUP);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setAttendanceGroupDTOList(ModelConvertUtils.messageToList(respMsg, AttendanceGroupDTO.class));
        }
        return response;
    }

    /**
     * 设备绑定考勤组
     *
     * @param request ChangeDeviceToGroupStatusRequest
     * @return BaseResponse
     */
    public BaseResponse bindDeviceToGroup(ChangeDeviceToGroupStatusRequest request) {
        BaseResponse response = new BaseResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.BIND_DEVICE_GROUP);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 设备解绑考勤组
     *
     * @param request ChangeDeviceToGroupStatusRequest
     * @return BaseResponse
     */
    public BaseResponse unBindDeviceToGroup(ChangeDeviceToGroupStatusRequest request) {
        BaseResponse response = new BaseResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.UNBIND_DEVICE_GROUP);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 查询考勤组分配的设备
     *
     * @param request QueryGroupToDeviceRequest
     * @return QueryGroupToDeviceResponse
     */
    public QueryGroupToDeviceResponse findGroupToDeviceList(QueryGroupToDeviceRequest request) {
        QueryGroupToDeviceResponse response = new QueryGroupToDeviceResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.QUERY_GROUP_DEVICE);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setDeviceDTOList(ModelConvertUtils.messageToList(respMsg, DeviceDTO.class));
        }
        return response;
    }

    /**
     * 人员绑定考勤组
     *
     * @param request ChangePersonToGroupStatusRequest
     * @return BaseResponse
     */
    public BaseResponse bindPersonToGroup(ChangePersonToGroupStatusRequest request) {
        BaseResponse response = new BaseResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.BIND_PERSON_GROUP);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 人员解绑考勤组
     *
     * @param request ChangePersonToGroupStatusRequest
     * @return BaseResponse
     */
    public BaseResponse unBindPersonToGroup(ChangePersonToGroupStatusRequest request) {
        BaseResponse response = new BaseResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.UNBIND_PERSON_GROUP);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 查询考勤组分配的人员
     *
     * @param request QueryGroupToPersonRequest
     * @return QueryGroupToPersonResponse
     */
    public QueryGroupToPersonResponse findGroupToPersonList(QueryGroupToPersonRequest request) {
        QueryGroupToPersonResponse response = new QueryGroupToPersonResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.PAGE_GROUP_PERSON);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setPersonDetailDTOList(ModelConvertUtils.messageToList(respMsg, PersonDetailDTO.class));
        }
        return response;
    }

    /**
     * 清空设备分配的人员
     *
     * @param request ClearDeviceToPersonRequest
     * @return BaseResponse
     */
    public BaseResponse clearDeviceTopPerson(ClearDeviceToPersonRequest request) {
        BaseResponse response = new BaseResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.CLEAR_DEVICE_PERSON);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 查询设备分配的人员
     *
     * @param request PageDeviceToPersonRequest
     * @return PageDeviceToPersonResponse
     */
    public PageDeviceToPersonResponse findDeviceToPersonList(PageDeviceToPersonRequest request) {
        PageDeviceToPersonResponse response = new PageDeviceToPersonResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.QUERY_DEVICE_PERSON);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setPagination(MessageUtils.getPagination(respMsg));
            response.setList(ModelConvertUtils.messageToList(respMsg, PersonDetailDTO.class));
        }
        return response;
    }

    /**
     * 分页查询考勤打卡记录
     *
     * @param request PagePunchRecordRequest
     * @return PagePunchRecordResponse
     */
    public PagePunchRecordResponse findPunchRecordList(PagePunchRecordRequest request) {
        PagePunchRecordResponse response = new PagePunchRecordResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.PAGE_PUNCH_RECORD);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setPagination(MessageUtils.getPagination(respMsg));
            response.setList(ModelConvertUtils.messageToList(respMsg, PunchRecordDTO.class));
        }
        return response;
    }
}

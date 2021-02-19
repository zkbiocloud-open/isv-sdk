/*
 * Class Name: BasicServiceClient
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
import com.zkteco.open.model.business.basic.dto.DeviceDTO;
import com.zkteco.open.model.business.basic.dto.OrganizationDTO;
import com.zkteco.open.model.business.basic.dto.PersonBiotemplateDTO;
import com.zkteco.open.model.business.basic.dto.PersonDTO;
import com.zkteco.open.model.business.basic.request.*;
import com.zkteco.open.model.business.basic.response.*;
import com.zkteco.open.util.MessageUtils;
import com.zkteco.open.util.ModelConvertUtils;

public class BasicServiceClient extends AbstractClient {

    public BasicServiceClient(Certificate credential) {
        super(credential);
    }

    /**
     * 创建组织
     *
     * @param request CreateOrganizationRequest
     * @return CreateOrganizationResponse
     */
    public CreateOrganizationResponse createOrganization(CreateOrganizationRequest request) {
        CreateOrganizationResponse response = new CreateOrganizationResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.CREATE_ORGANIZATION);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setId(ModelConvertUtils.resultToDto(respMsg, CreateOrganizationResponse.class).getId());
        }
        return response;
    }

    /**
     * 读取组织
     *
     * @param request GetOrganizationRequest
     * @return GetOrganizationResponse
     */
    public GetOrganizationResponse getOrganization(GetOrganizationRequest request) {
        GetOrganizationResponse response = new GetOrganizationResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.GET_ORGANIZATION);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            OrganizationDTO dto = ModelConvertUtils.resultToDto(respMsg, OrganizationDTO.class);
            BeanUtil.copyProperties(dto, response);
        }
        return response;
    }

    /**
     * 查询组织
     *
     * @param request QueryOrganizationRequest
     * @return QueryOrganizationResponse
     */
    public QueryOrganizationResponse findOrganizationList(QueryOrganizationRequest request) {
        QueryOrganizationResponse response = new QueryOrganizationResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.QUERY_ORGANIZATION);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setOrganizationDTOList(ModelConvertUtils.resultToList(respMsg, OrganizationDTO.class));
        }
        return response;
    }

    /**
     * 创建人员
     *
     * @param request CreatePersonRequest
     * @return CreatePersonResponse
     */
    public CreatePersonResponse createPerson(CreatePersonRequest request) {
        CreatePersonResponse response = new CreatePersonResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.CREATE_PERSON);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setId(ModelConvertUtils.resultToDto(respMsg, CreatePersonResponse.class).getId());
        }
        return response;
    }

    /**
     * 删除人员
     *
     * @param request DeletePersonRequest
     * @return BaseResponse
     */
    public BaseResponse deletePerson(DeletePersonRequest request) {
        BaseResponse response = new BaseResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.DELETE_PERSON);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 更新人员
     *
     * @param request UpdatePersonRequest
     * @return BaseResponse
     */
    public BaseResponse updatePerson(UpdatePersonRequest request) {
        BaseResponse response = new BaseResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.UPDATE_PERSON);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 读取人员
     *
     * @param request GetPersonRequest
     * @return GetPersonResponse
     */
    public GetPersonResponse getPerson(GetPersonRequest request) {
        GetPersonResponse response = new GetPersonResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.GET_PERSON);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            PersonDTO dto = ModelConvertUtils.resultToDto(respMsg, PersonDTO.class);
            BeanUtil.copyProperties(dto, response);
        }
        return response;
    }

    /**
     * 查询人员
     *
     * @param request QueryPersonRequest
     * @return QueryPersonResponse
     */
    public QueryPersonResponse findPersonList(QueryPersonRequest request) {
        QueryPersonResponse response = new QueryPersonResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.QUERY_PERSON);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setPersonDTOList(ModelConvertUtils.resultToList(respMsg, PersonDTO.class));
        }
        return response;
    }

    /**
     * 分页查询人员
     *
     * @param request PagePersonRequest
     * @return PagePersonResponse
     */
    public PagePersonResponse pagePerson(PagePersonRequest request) {
        PagePersonResponse response = new PagePersonResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.PAGE_PERSON);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setPagination(MessageUtils.getPagination(respMsg));
            response.setList(ModelConvertUtils.pageResultToList(respMsg, PersonDTO.class));
        }
        return response;
    }

    /**
     * 添加设备
     *
     * @param request AddDeviceRequest
     * @return AddDeviceResponse
     */
    public AddDeviceResponse addDevice(AddDeviceRequest request) {
        AddDeviceResponse response = new AddDeviceResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.ADD_DEVICE);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setId(ModelConvertUtils.resultToDto(respMsg, AddDeviceResponse.class).getId());
        }
        return response;
    }

    /**
     * 删除设备
     *
     * @param request DeleteDeviceRequest
     * @return BaseResponse
     */
    public BaseResponse deleteDevice(DeleteDeviceRequest request) {
        BaseResponse response = new BaseResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.DELETE_DEVICE);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 更新设备
     *
     * @param request UpdateDeviceRequest
     * @return BaseResponse
     */
    public BaseResponse updateDevice(UpdateDeviceRequest request) {
        BaseResponse response = new BaseResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.UPDATE_DEVICE);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 读取设备
     *
     * @param request GetDeviceRequest
     * @return GetDeviceResponse
     */
    public GetDeviceResponse getDevice(GetDeviceRequest request) {
        GetDeviceResponse response = new GetDeviceResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.GET_DEVICE);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            DeviceDTO dto = ModelConvertUtils.resultToDto(respMsg, DeviceDTO.class);
            BeanUtil.copyProperties(dto, response);
        }
        return response;
    }

    /**
     * 查询设备
     *
     * @param request QueryDeviceRequest
     * @return QueryDeviceResponse
     */
    public QueryDeviceResponse findDeviceList(QueryDeviceRequest request) {
        QueryDeviceResponse response = new QueryDeviceResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.QUERY_DEVICE);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setDeviceDTOList(ModelConvertUtils.resultToList(respMsg, DeviceDTO.class));
        }
        return response;
    }

    /**
     * 分页查询设备
     *
     * @param request PageDeviceRequest
     * @return PageDeviceResponse
     */
    public PageDeviceResponse pageDevice(PageDeviceRequest request) {
        PageDeviceResponse response = new PageDeviceResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.PAGE_DEVICE);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setPagination(MessageUtils.getPagination(respMsg));
            response.setList(ModelConvertUtils.pageResultToList(respMsg, DeviceDTO.class));
        }
        return response;
    }

    /**
     * 启用设备
     *
     * @param request ChangeDeviceStatusRequest
     * @return BaseResponse
     */
    public BaseResponse enableDevice(ChangeDeviceStatusRequest request) {
        QueryOrganizationResponse response = new QueryOrganizationResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.ENABLE_DEVICE);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 禁用设备
     *
     * @param request ChangeDeviceStatusRequest
     * @return BaseResponse
     */
    public BaseResponse disableDevice(ChangeDeviceStatusRequest request) {
        BaseResponse response = new BaseResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.DISABLE_DEVICE);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 分页查询设备分配的人员
     *
     * @param request PagePersonRequest
     * @return PagePersonResponse
     */
    public PagePersonResponse pagePersonOfDevice(PagePersonRequest request) {
        PagePersonResponse response = new PagePersonResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.PAGE_DEVICE_PERSON);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setPagination(MessageUtils.getPagination(respMsg));
            response.setList(ModelConvertUtils.pageResultToList(respMsg, PersonDTO.class));
        }
        return response;
    }

    /**
     * 分页查询设备分配的人员生物模板
     *
     * @param request PagePersonBiotemplateRequest
     * @return PagePersonBiotemplateResponse
     */
    public PagePersonBiotemplateResponse pagePersonBiotemplateOfDevice(PagePersonBiotemplateRequest request) {
        PagePersonBiotemplateResponse response = new PagePersonBiotemplateResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.PAGE_DEVICE_PERSON_BIOTEMPLATE);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setPagination(MessageUtils.getPagination(respMsg));
            response.setList(ModelConvertUtils.pageResultToList(respMsg, PersonBiotemplateDTO.class));
        }
        return response;
    }

}

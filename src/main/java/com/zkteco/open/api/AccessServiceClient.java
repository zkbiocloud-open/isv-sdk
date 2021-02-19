/*
 * Class Name: AccessServiceClient
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
import com.zkteco.open.model.business.access.dto.DoorDTO;
import com.zkteco.open.model.business.access.dto.PersonDetailDTO;
import com.zkteco.open.model.business.access.dto.RuleDTO;
import com.zkteco.open.model.business.access.request.*;
import com.zkteco.open.model.business.access.response.*;
import com.zkteco.open.model.business.basic.dto.PersonDTO;
import com.zkteco.open.util.MessageUtils;
import com.zkteco.open.util.ModelConvertUtils;

public class AccessServiceClient extends AbstractClient {

    public AccessServiceClient(Certificate credential) {
        super(credential);
    }

    /**
     * 修改门名称
     *
     * @param request ModifyDoorNameRequest
     * @return BaseResponse
     */
    public BaseResponse modifyDoorName(ModifyDoorNameRequest request) {
        BaseResponse response = new BaseResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.MODIFY_DOOR_NAME);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 修改门参数
     *
     * @param request ModifyDoorParameterRequest
     * @return BaseResponse
     */
    public BaseResponse modifyDoorParameter(ModifyDoorParameterRequest request) {
        BaseResponse response = new BaseResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.MODIFY_DOOR_PARAMETER);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 查询门
     *
     * @param request QueryDoorRequest
     * @return QueryDoorResponse
     */
    public QueryDoorResponse queryDoorList(QueryDoorRequest request) {
        QueryDoorResponse response = new QueryDoorResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.QUERY_DOOR);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setDoorDTOList(ModelConvertUtils.resultToList(respMsg, DoorDTO.class));
        }
        return response;
    }

    /**
     * 远程开门
     *
     * @param request RemoteOpenDoorRequest
     * @return BaseResponse
     */
    public BaseResponse remoteOpenDoor(RemoteOpenDoorRequest request) {
        BaseResponse response = new BaseResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.REMOTE_OPEN_DOOR);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 创建门禁规则
     *
     * @param request CreateAccessRuleRequest
     * @return CreateAccessRuleResponse
     */
    public CreateAccessRuleResponse createRule(CreateAccessRuleRequest request) {
        CreateAccessRuleResponse response = new CreateAccessRuleResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.CREATE_RULE);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setId(ModelConvertUtils.resultToDto(respMsg, CreateAccessRuleResponse.class).getId());
        }
        return response;
    }

    /**
     * 删除门禁规则
     *
     * @param request DeleteAccessRuleRequest
     * @return BaseResponse
     */
    public BaseResponse deleteRule(DeleteAccessRuleRequest request) {
        BaseResponse response = new BaseResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.DELETE_RULE);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 更新门禁规则
     *
     * @param request UpdateRuleRequest
     * @return BaseResponse
     */
    public BaseResponse updateRule(UpdateRuleRequest request) {
        BaseResponse response = new BaseResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.UPDATE_RULE);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 读取门禁规则
     *
     * @param request GetAccessRuleRequest
     * @return GetAccessRuleResponse
     */
    public GetAccessRuleResponse getRule(GetAccessRuleRequest request) {
        GetAccessRuleResponse response = new GetAccessRuleResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.GET_RULE);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            RuleDTO ruleDTO = ModelConvertUtils.resultToDto(respMsg, RuleDTO.class);
            BeanUtil.copyProperties(ruleDTO, response);
        }
        return response;
    }

    /**
     * 查询门禁规则
     *
     * @param request QueryAccessRuleRequest
     * @return QueryAccessRuleResponse
     */
    public QueryAccessRuleResponse findRuleList(QueryAccessRuleRequest request) {
        QueryAccessRuleResponse response = new QueryAccessRuleResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.QUERY_RULE);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setRuleDTOList(ModelConvertUtils.resultToList(respMsg, RuleDTO.class));
        }
        return response;
    }

    /**
     * 门禁规则分配门
     *
     * @param request AssignRuleToDoorRequest
     * @return BaseResponse
     */
    public BaseResponse assignRuleToDoor(AssignRuleToDoorRequest request) {
        BaseResponse response = new BaseResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.ASSIGN_DOOR);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 门禁规则分配人员
     *
     * @param request AssignRuleToPersonRequest
     * @return BaseResponse
     */
    public BaseResponse assignRuleToPerson(AssignRuleToPersonRequest request) {
        BaseResponse response = new BaseResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.ASSIGN_PERSON);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        return response;
    }

    /**
     * 查询规则分配的门
     *
     * @param request QueryRuleToDoorRequest
     * @return QueryRuleToDoorResponse
     */
    public QueryRuleToDoorResponse findRuleToDoorList(QueryRuleToDoorRequest request) {
        QueryRuleToDoorResponse response = new QueryRuleToDoorResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.QUERY_RULE_DOOR);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setDoorDTOList(ModelConvertUtils.resultToList(respMsg, DoorDTO.class));
        }
        return response;
    }

    /**
     * 查询规则分配的人员
     *
     * @param request QueryRuleToPersonRequest
     * @return QueryRuleToPersonResponse
     */
    public QueryRuleToPersonResponse findRuleToPersonList(QueryRuleToPersonRequest request) {
        QueryRuleToPersonResponse response = new QueryRuleToPersonResponse();
        Message respMsg = this.internalEncryptionRequest(request, UrlConstants.QUERY_RULE_PERSON);
        response.setCode(respMsg.getCode());
        response.setMessage(respMsg.getMessage());
        if (MessageUtils.isSuccess(respMsg)) {
            response.setPersonDTOList(ModelConvertUtils.resultToList(respMsg, PersonDTO.class));
        }
        return response;
    }
}

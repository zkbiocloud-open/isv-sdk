/*
 * Class Name: ModifyDoorParameterRequest
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.access.request;

import com.zkteco.open.model.base.BaseRequest;
import com.zkteco.open.model.business.access.dto.ModifyDoorParameterDTO;

import java.io.Serializable;
import java.util.List;

public class ModifyDoorParameterRequest extends BaseRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 门id
     */
    private String id;

    /**
     * 门参数
     */
    private List<ModifyDoorParameterDTO> parameters;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ModifyDoorParameterDTO> getParameters() {
        return parameters;
    }

    public void setParameters(List<ModifyDoorParameterDTO> parameters) {
        this.parameters = parameters;
    }
}
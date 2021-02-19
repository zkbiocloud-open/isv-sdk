/*
 * Class Name: QueryAccessRuleResponse
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.access.response;

import com.zkteco.open.model.base.BaseResponse;
import com.zkteco.open.model.business.access.dto.RuleDTO;

import java.io.Serializable;
import java.util.List;

public class QueryAccessRuleResponse extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<RuleDTO> ruleDTOList;

    public List<RuleDTO> getRuleDTOList() {
        return ruleDTOList;
    }

    public void setRuleDTOList(List<RuleDTO> ruleDTOList) {
        this.ruleDTOList = ruleDTOList;
    }
}
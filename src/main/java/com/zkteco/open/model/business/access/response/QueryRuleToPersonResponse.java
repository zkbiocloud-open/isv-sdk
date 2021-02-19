/*
 * Class Name: QueryRuleToPersonResponse
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.access.response;

import com.zkteco.open.model.base.BaseResponse;
import com.zkteco.open.model.business.access.dto.PersonDetailDTO;
import com.zkteco.open.model.business.basic.dto.PersonDTO;

import java.io.Serializable;
import java.util.List;

public class QueryRuleToPersonResponse extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<PersonDTO> personDTOList;

    public List<PersonDTO> getPersonDTOList() {
        return personDTOList;
    }

    public void setPersonDTOList(List<PersonDTO> personDTOList) {
        this.personDTOList = personDTOList;
    }
}
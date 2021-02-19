package com.zkteco.open.model.business.basic.response;

import com.zkteco.open.model.base.BaseResponse;
import com.zkteco.open.model.business.basic.dto.PersonDTO;

import java.io.Serializable;
import java.util.List;

public class QueryPersonResponse extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<PersonDTO> personDTOList;

    public List<PersonDTO> getPersonDTOList() {
        return personDTOList;
    }

    public void setPersonDTOList(List<PersonDTO> personDTOList) {
        this.personDTOList = personDTOList;
    }
}
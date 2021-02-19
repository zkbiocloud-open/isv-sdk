package com.zkteco.open.model.business.attendance.response;

import com.zkteco.open.model.base.BaseResponse;
import com.zkteco.open.model.business.access.dto.PersonDetailDTO;

import java.io.Serializable;
import java.util.List;

public class QueryGroupToPersonResponse extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<PersonDetailDTO> personDetailDTOList;

    public List<PersonDetailDTO> getPersonDetailDTOList() {
        return personDetailDTOList;
    }

    public void setPersonDetailDTOList(List<PersonDetailDTO> personDetailDTOList) {
        this.personDetailDTOList = personDetailDTOList;
    }
}
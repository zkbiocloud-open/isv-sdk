package com.zkteco.open.model.business.basic.response;

import com.zkteco.open.model.base.BaseResponse;
import com.zkteco.open.model.business.basic.dto.OrganizationDTO;

import java.io.Serializable;
import java.util.List;

public class QueryOrganizationResponse extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<OrganizationDTO> organizationDTOList;

    public List<OrganizationDTO> getOrganizationDTOList() {
        return organizationDTOList;
    }

    public void setOrganizationDTOList(List<OrganizationDTO> organizationDTOList) {
        this.organizationDTOList = organizationDTOList;
    }
}
package com.zkteco.open.model.business.basic.response;

import com.zkteco.open.common.Pagination;
import com.zkteco.open.model.base.BaseResponse;
import com.zkteco.open.model.business.basic.dto.PersonBiotemplateDTO;

import java.io.Serializable;
import java.util.List;

public class PagePersonBiotemplateResponse extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private Pagination pagination;

    private List<PersonBiotemplateDTO> list;

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<PersonBiotemplateDTO> getList() {
        return list;
    }

    public void setList(List<PersonBiotemplateDTO> list) {
        this.list = list;
    }
}
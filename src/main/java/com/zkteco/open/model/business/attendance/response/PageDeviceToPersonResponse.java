package com.zkteco.open.model.business.attendance.response;

import com.zkteco.open.common.Pagination;
import com.zkteco.open.model.base.BaseResponse;
import com.zkteco.open.model.business.access.dto.PersonDetailDTO;

import java.io.Serializable;
import java.util.List;

public class PageDeviceToPersonResponse extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private Pagination pagination;

    private List<PersonDetailDTO> list;

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<PersonDetailDTO> getList() {
        return list;
    }

    public void setList(List<PersonDetailDTO> list) {
        this.list = list;
    }
}
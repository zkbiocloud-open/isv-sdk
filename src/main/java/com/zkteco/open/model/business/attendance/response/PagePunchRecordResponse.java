package com.zkteco.open.model.business.attendance.response;

import com.zkteco.open.common.Pagination;
import com.zkteco.open.model.base.BaseResponse;
import com.zkteco.open.model.business.attendance.dto.PunchRecordDTO;

import java.io.Serializable;
import java.util.List;

public class PagePunchRecordResponse extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private Pagination pagination;

    private List<PunchRecordDTO> list;

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<PunchRecordDTO> getList() {
        return list;
    }

    public void setList(List<PunchRecordDTO> list) {
        this.list = list;
    }
}
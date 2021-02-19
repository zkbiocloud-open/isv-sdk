package com.zkteco.open.model.business.basic.response;

import com.zkteco.open.common.Pagination;
import com.zkteco.open.model.base.BaseResponse;
import com.zkteco.open.model.business.basic.dto.DeviceDTO;

import java.io.Serializable;
import java.util.List;

public class PageDeviceResponse extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private Pagination pagination;

    private List<DeviceDTO> list;

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<DeviceDTO> getList() {
        return list;
    }

    public void setList(List<DeviceDTO> list) {
        this.list = list;
    }
}
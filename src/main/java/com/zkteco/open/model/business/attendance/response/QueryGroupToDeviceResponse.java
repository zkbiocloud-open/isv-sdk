package com.zkteco.open.model.business.attendance.response;

import com.zkteco.open.model.base.BaseResponse;
import com.zkteco.open.model.business.basic.dto.DeviceDTO;

import java.io.Serializable;
import java.util.List;

public class QueryGroupToDeviceResponse extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<DeviceDTO> deviceDTOList;

    public List<DeviceDTO> getDeviceDTOList() {
        return deviceDTOList;
    }

    public void setDeviceDTOList(List<DeviceDTO> deviceDTOList) {
        this.deviceDTOList = deviceDTOList;
    }
}
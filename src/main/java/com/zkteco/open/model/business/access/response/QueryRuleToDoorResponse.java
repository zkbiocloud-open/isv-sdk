/*
 * Class Name: QueryRuleToDoorResponse
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.access.response;

import com.zkteco.open.model.base.BaseResponse;
import com.zkteco.open.model.business.access.dto.DoorDTO;

import java.io.Serializable;
import java.util.List;

public class QueryRuleToDoorResponse extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<DoorDTO> doorDTOList;

    public List<DoorDTO> getDoorDTOList() {
        return doorDTOList;
    }

    public void setDoorDTOList(List<DoorDTO> doorDTOList) {
        this.doorDTOList = doorDTOList;
    }
}
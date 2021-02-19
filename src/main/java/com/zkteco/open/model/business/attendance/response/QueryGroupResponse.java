package com.zkteco.open.model.business.attendance.response;

import com.zkteco.open.model.base.BaseResponse;
import com.zkteco.open.model.business.attendance.dto.AttendanceGroupDTO;

import java.io.Serializable;
import java.util.List;

public class QueryGroupResponse extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<AttendanceGroupDTO> attendanceGroupDTOList;

    public List<AttendanceGroupDTO> getAttendanceGroupDTOList() {
        return attendanceGroupDTOList;
    }

    public void setAttendanceGroupDTOList(List<AttendanceGroupDTO> attendanceGroupDTOList) {
        this.attendanceGroupDTOList = attendanceGroupDTOList;
    }
}
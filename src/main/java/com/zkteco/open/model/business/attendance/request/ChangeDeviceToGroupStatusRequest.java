package com.zkteco.open.model.business.attendance.request;

import com.zkteco.open.model.base.BaseRequest;

import java.io.Serializable;
import java.util.List;

public class ChangeDeviceToGroupStatusRequest extends BaseRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 考勤组Id
     */
    private String groupId;

    /**
     * 设备Id列表
     */
    private List<String> deviceIds;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<String> getDeviceIds() {
        return deviceIds;
    }

    public void setDeviceIds(List<String> deviceIds) {
        this.deviceIds = deviceIds;
    }
}
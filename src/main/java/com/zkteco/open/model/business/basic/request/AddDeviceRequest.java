package com.zkteco.open.model.business.basic.request;

import com.zkteco.open.model.base.BaseRequest;

import java.io.Serializable;

public class AddDeviceRequest extends BaseRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 设备唯一序列号
     */
    private String sn;

    /**
     * 设备名称
     */
    private String name;

    /**
     * 设备型号
     */
    private String zoneId;

    /**
     * 备注
     */
    private String remark;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
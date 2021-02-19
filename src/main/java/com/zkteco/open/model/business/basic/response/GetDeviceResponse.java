package com.zkteco.open.model.business.basic.response;

import com.zkteco.open.model.base.BaseResponse;
import com.zkteco.open.model.business.basic.dto.DeviceDTO;

import java.io.Serializable;
import java.util.List;

public class GetDeviceResponse extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 设备id
     */
    private String id;

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
    private String model;

    /**
     * 设备类型（0-考勤，1-门禁，999-未知设备）
     */
    private Integer type;

    /**
     * 设备状态（0-禁用；1-启用）
     */
    private Integer enable;

    /** status（0-离线；1-在线；2-重置） */
    private Integer status;

    /**
     * 设备时区
     */
    private String zoneId;

    /**
     * 备注
     */
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

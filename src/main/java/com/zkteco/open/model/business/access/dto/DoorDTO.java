/*
 * Class Name: DoorDTO
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.access.dto;

import java.io.Serializable;

public class DoorDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 门id
     */
    private String id;

    /**
     * 门序号
     */
    private String num;

    /**
     * 门名称
     */
    private String name;

    /**
     * 设备序列号
     */
    private String deviceSn;

    /**
     * 设备名称
     */
    private String deviceName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
}
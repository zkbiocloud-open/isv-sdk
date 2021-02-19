/*
 * Class Name: PersonDetailDTO
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.access.dto;

import com.zkteco.open.model.business.basic.dto.PersonDTO;

import java.io.Serializable;

public class PersonDetailDTO extends PersonDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 组织id
     */
    private String id;

    /**
     * 规则名称
     */
    private String name;

    /**
     * 星期为7位的字符串，每一位分别代表
     * 星期一、二、三、四、五、六和日，
     * 0-表示禁用，1-表示启用。
     * 如1111100、1111010、0011100
     */
    private String week;

    /**
     * 开始时间，格式HH:mm，范围00:00~23:59
     */
    private String startTime;

    /**
     * 结束时间，格式HH:mm，范围00:00~23:59
     */
    private String endTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
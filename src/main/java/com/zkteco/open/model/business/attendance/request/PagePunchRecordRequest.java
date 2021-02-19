package com.zkteco.open.model.business.attendance.request;

import com.zkteco.open.common.Pagination;

import java.io.Serializable;

public class PagePunchRecordRequest extends Pagination implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 组织Id
     */
    private String unitId;

    /**
     * 打卡开始Unix时间戳，精确到秒
     */
    private Long startTime;

    /**
     * 打卡截止Unix时间戳，精确到秒
     */
    private Long endTime;

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
}
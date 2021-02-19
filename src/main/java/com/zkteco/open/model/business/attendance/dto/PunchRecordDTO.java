package com.zkteco.open.model.business.attendance.dto;

import java.io.Serializable;

public class PunchRecordDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 打卡记录ID
     */
    private String id;

    /**
     * 设备SN
     */
    private String sn;

    /**
     * 人员编号
     */
    private String employeeNo;

    /**
     * 打卡标准Unix时间戳
     */
    private Long punchTime;

    /**
     * 打卡时间(iso8601标准格式)
     */
    private String iso8601PunchTime;

    /**
     * 打卡状态（0 上班签到；1 下班签退；2 外出；3 外出返回；4 加班签到；5 加班签退；255 默认）
     */
    private Integer status;

    /**
     * 工作代码
     */
    private String workCode;

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

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public Long getPunchTime() {
        return punchTime;
    }

    public void setPunchTime(Long punchTime) {
        this.punchTime = punchTime;
    }

    public String getIso8601PunchTime() {
        return iso8601PunchTime;
    }

    public void setIso8601PunchTime(String iso8601PunchTime) {
        this.iso8601PunchTime = iso8601PunchTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getWorkCode() {
        return workCode;
    }

    public void setWorkCode(String workCode) {
        this.workCode = workCode;
    }
}
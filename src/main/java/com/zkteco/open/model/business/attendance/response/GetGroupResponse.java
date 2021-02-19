package com.zkteco.open.model.business.attendance.response;

import com.zkteco.open.model.base.BaseResponse;

import java.io.Serializable;

public class GetGroupResponse extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 考勤组Id
     */
    private String id;

    /**
     * 考勤组编码
     */
    private String code;

    /**
     * 考勤组名称
     */
    private String name;

    /**
     * 考勤组备注
     */
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
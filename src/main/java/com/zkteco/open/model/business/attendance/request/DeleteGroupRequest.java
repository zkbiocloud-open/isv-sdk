package com.zkteco.open.model.business.attendance.request;

import com.zkteco.open.model.base.BaseRequest;

import java.io.Serializable;
import java.util.List;

public class DeleteGroupRequest extends BaseRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 考勤组id列表
     */
    private List<String> ids;

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }
}
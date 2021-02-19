package com.zkteco.open.model.business.basic.request;

import com.zkteco.open.model.base.BaseRequest;

import java.io.Serializable;
import java.util.List;

public class DeletePersonRequest extends BaseRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 人员编号列表
     */
    private List<String> ids;

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }
}
/*
 * Class Name: Pagination
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.common;

import java.io.Serializable;

public class Pagination implements Serializable {
    private static final long serialVersionUID = 1L;

    private long total;

    private int curPage;

    private int pageSize;

    public Pagination() {
        super();
    }

    public Pagination(int pageSize, int curPage, long total) {
        super();
        this.pageSize = pageSize;
        this.curPage = curPage;
        this.total = total;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}

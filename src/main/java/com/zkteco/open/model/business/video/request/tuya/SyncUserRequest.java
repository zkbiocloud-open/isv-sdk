/*
 * Class Name: SyncUserRequest
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2019 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.business.video.request.tuya;

import com.zkteco.open.model.base.BaseRequest;

public class SyncUserRequest extends BaseRequest {

    private String accountId;
    private String countryCode;
    private String username;
    private Integer usernameType;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUsernameType() {
        return usernameType;
    }

    public void setUsernameType(Integer usernameType) {
        this.usernameType = usernameType;
    }
}

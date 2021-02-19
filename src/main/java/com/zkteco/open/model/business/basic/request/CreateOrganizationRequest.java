package com.zkteco.open.model.business.basic.request;

import java.io.Serializable;

public class CreateOrganizationRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 组织名称
     */
    private String name;

    /**
     * 组织国家编码
     */
    private String countryCode;

    /**
     * 组织省份
     */
    private String province;

    /**
     * 组织城市
     */
    private String city;

    /**
     * 组织街区
     */
    private String county;

    /**
     * 组织详细地址
     */
    private String address;

    /**
     * 组织邮政编码
     */
    private String zip;

    /**
     * 组织联系邮箱
     */
    private String email;

    /**
     * 组织联系电话
     */
    private String phone;

    /**
     * 组织徽标
     */
    private String logo;

    /**
     * 组织行业
     */
    private String industry;

    /**
     * 组织子行业，用/分割
     */
    private String subIndustry;

    /**
     * 组织备注
     */
    private String remark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getSubIndustry() {
        return subIndustry;
    }

    public void setSubIndustry(String subIndustry) {
        this.subIndustry = subIndustry;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
package com.zkteco.open.model.business.basic.request;

import com.zkteco.open.model.base.BaseRequest;

import java.io.Serializable;

public class CreatePersonRequest extends BaseRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 人员编号
     */
    private String no;

    /**
     * 人员-名
     */
    private String firstName;

    /**
     * 人员-姓
     */
    private String lastName;

    /**
     * 人员-格式化名
     */
    private String formatName;

    /**
     * 人员邮箱
     */
    private String email;

    /**
     * 人员手机号码
     */
    private String mobilePhone;

    /**
     * 人员身份证号码
     */
    private String idCardNo;

    /**
     * 卡号（IC卡信息）
     */
    private String cardNo;

    /**
     * 人员头像
     */
    private String avatarUrl;

    /**
     * 人员头像base64
     */
    private String avatarBase64;

    /**
     * 人员人脸照片
     */
    private String facePhotoUrl;

    /**
     * 人员人脸照片base64
     */
    private String facePhotoBase64;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFormatName() {
        return formatName;
    }

    public void setFormatName(String formatName) {
        this.formatName = formatName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getAvatarBase64() {
        return avatarBase64;
    }

    public void setAvatarBase64(String avatarBase64) {
        this.avatarBase64 = avatarBase64;
    }

    public String getFacePhotoUrl() {
        return facePhotoUrl;
    }

    public void setFacePhotoUrl(String facePhotoUrl) {
        this.facePhotoUrl = facePhotoUrl;
    }

    public String getFacePhotoBase64() {
        return facePhotoBase64;
    }

    public void setFacePhotoBase64(String facePhotoBase64) {
        this.facePhotoBase64 = facePhotoBase64;
    }
}
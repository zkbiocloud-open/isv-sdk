package com.zkteco.open.model.business.basic.dto;

import java.io.Serializable;

public class PersonBiotemplateDTO implements Serializable {

    /**
     * name
     */
    private String name;

    /**
     * avatar
     */
    private String avatar;

    /**
     * have finger
     */
    private Integer haveFinger;

    /**
     * have face photo
     */
    private String haveFacePhoto;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getHaveFinger() {
        return haveFinger;
    }

    public void setHaveFinger(Integer haveFinger) {
        this.haveFinger = haveFinger;
    }

    public String getHaveFacePhoto() {
        return haveFacePhoto;
    }

    public void setHaveFacePhoto(String haveFacePhoto) {
        this.haveFacePhoto = haveFacePhoto;
    }

}

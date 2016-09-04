package com.crickD.models;

/**
 * Uses to display adds
 * related to advertisement
 * Created by Anushka Ekanayake on 8/10/2016.
 */
public class Advertisement {
    private String ADD_NAME = null;
    private String ADD_CODE = null;
    private String ADD_IMG_URL = null;
    private String ADD_AUDIO_URL = null;
    //Duration of the advertisement in seconds
    private Double ADD_DURATION = 0.0;
    private String ADD_OWNER_NAME = null;
    private String ADD_OWNNER_CODE = null;
    private String ADD_OWNER_EMAIL = null;
    private String ADD_OWNER_TP = null;
    //if it is a paid add its as true
    private boolean ADD_PAIED = false;

    public String getADD_NAME() {
        return ADD_NAME;
    }

    public void setADD_NAME(String ADD_NAME) {
        this.ADD_NAME = ADD_NAME;
    }

    public String getADD_CODE() {
        return ADD_CODE;
    }

    public void setADD_CODE(String ADD_CODE) {
        this.ADD_CODE = ADD_CODE;
    }

    public String getADD_IMG_URL() {
        return ADD_IMG_URL;
    }

    public void setADD_IMG_URL(String ADD_IMG_URL) {
        this.ADD_IMG_URL = ADD_IMG_URL;
    }

    public String getADD_AUDIO_URL() {
        return ADD_AUDIO_URL;
    }

    public void setADD_AUDIO_URL(String ADD_AUDIO_URL) {
        this.ADD_AUDIO_URL = ADD_AUDIO_URL;
    }

    public Double getADD_DURATION() {
        return ADD_DURATION;
    }

    public void setADD_DURATION(Double ADD_DURATION) {
        this.ADD_DURATION = ADD_DURATION;
    }

    public String getADD_OWNER_NAME() {
        return ADD_OWNER_NAME;
    }

    public void setADD_OWNER_NAME(String ADD_OWNER_NAME) {
        this.ADD_OWNER_NAME = ADD_OWNER_NAME;
    }

    public String getADD_OWNNER_CODE() {
        return ADD_OWNNER_CODE;
    }

    public void setADD_OWNNER_CODE(String ADD_OWNNER_CODE) {
        this.ADD_OWNNER_CODE = ADD_OWNNER_CODE;
    }

    public String getADD_OWNER_EMAIL() {
        return ADD_OWNER_EMAIL;
    }

    public void setADD_OWNER_EMAIL(String ADD_OWNER_EMAIL) {
        this.ADD_OWNER_EMAIL = ADD_OWNER_EMAIL;
    }

    public String getADD_OWNER_TP() {
        return ADD_OWNER_TP;
    }

    public void setADD_OWNER_TP(String ADD_OWNER_TP) {
        this.ADD_OWNER_TP = ADD_OWNER_TP;
    }

    public boolean isADD_PAIED() {
        return ADD_PAIED;
    }

    public void setADD_PAIED(boolean ADD_PAIED) {
        this.ADD_PAIED = ADD_PAIED;
    }
}

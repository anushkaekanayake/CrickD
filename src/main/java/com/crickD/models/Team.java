package com.crickD.models;

import java.util.ArrayList;

/**
 * Entity for a team
 * Created by Anushka Ekanayake on 8/7/2016.
 */
public class Team {
    private String TEAM_NAME = null;
    private String TEAM_CODE = null;
    private String TEAM_ADDRESS = null;
    private String TEAM_MANAGER = null;
    private String TEAM_CONTACT_NO = null;
    private String TEAM_LOGO_URL = null;
    //team status CREATED, CANCELLED, RETIRED, ACTIVE , PLAYED (if that team is played)
    private String TEAM_STATUS = null;
    private ArrayList<Player> PLAYER_LIST = null;
    private int TEAM_RATING = 0;

    public String getTEAM_NAME() {
        return TEAM_NAME;
    }

    public void setTEAM_NAME(String TEAM_NAME) {
        this.TEAM_NAME = TEAM_NAME;
    }

    public String getTEAM_CODE() {
        return TEAM_CODE;
    }

    public void setTEAM_CODE(String TEAM_CODE) {
        this.TEAM_CODE = TEAM_CODE;
    }

    public String getTEAM_ADDRESS() {
        return TEAM_ADDRESS;
    }

    public void setTEAM_ADDRESS(String TEAM_ADDRESS) {
        this.TEAM_ADDRESS = TEAM_ADDRESS;
    }

    public String getTEAM_MANAGER() {
        return TEAM_MANAGER;
    }

    public void setTEAM_MANAGER(String TEAM_MANAGER) {
        this.TEAM_MANAGER = TEAM_MANAGER;
    }

    public String getTEAM_CONTACT_NO() {
        return TEAM_CONTACT_NO;
    }

    public void setTEAM_CONTACT_NO(String TEAM_CONTACT_NO) {
        this.TEAM_CONTACT_NO = TEAM_CONTACT_NO;
    }

    public String getTEAM_LOGO_URL() {
        return TEAM_LOGO_URL;
    }

    public void setTEAM_LOGO_URL(String TEAM_LOGO_URL) {
        this.TEAM_LOGO_URL = TEAM_LOGO_URL;
    }

    public String getTEAM_STATUS() {
        return TEAM_STATUS;
    }

    public void setTEAM_STATUS(String TEAM_STATUS) {
        this.TEAM_STATUS = TEAM_STATUS;
    }

    public ArrayList<Player> getPLAYER_LIST() {
        return PLAYER_LIST;
    }

    public void setPLAYER_LIST(ArrayList<Player> PLAYER_LIST) {
        this.PLAYER_LIST = PLAYER_LIST;
    }

    public int getTEAM_RATING() {
        return TEAM_RATING;
    }

    public void setTEAM_RATING(int TEAM_RATING) {
        this.TEAM_RATING = TEAM_RATING;
    }
}

package com.crickD.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Entity for a Tournament
 * Created by Anushka Ekanayake on 8/7/2016.
 */
public class Tournament {
    private String TOURNAMENT_NAME = null;
    private String TOURNAMENT_CODE = null;
    private String TOURNAMENT_ID = null;
    private String ORGANIZER_NAME = null;
    private String ORGANIZER_ID = null;
    //address of the ground
    private String LOCATION = null;
    private String GROUNG_NAME = null;
    private int NUMBER_OF_TEAMS = 0;
    private Date DATE_START = null;
    private Date DATE_END = null;
    private Team TEAM_WINNER = null;
    private ArrayList<Team> TEAM_ALL = null;
    //CREATED ,PLANNED, ONGOING, FINISHED, CANCELLED
    private String TOURNAMENT_STATUS = null;
    //uses to record the team and it's place of that team got by playing the tournament (1st place, 2nd place etc.)
    private HashMap<Team, Integer> TEAM_WINNER_ORDER = null;


    public HashMap<Team, Integer> getTEAM_WINNER_ORDER() {
        return TEAM_WINNER_ORDER;
    }

    public void setTEAM_WINNER_ORDER(HashMap<Team, Integer> TEAM_WINNER_ORDER) {
        this.TEAM_WINNER_ORDER = TEAM_WINNER_ORDER;
    }

    public String getTOURNAMENT_NAME() {
        return TOURNAMENT_NAME;
    }

    public void setTOURNAMENT_NAME(String TOURNAMENT_NAME) {
        this.TOURNAMENT_NAME = TOURNAMENT_NAME;
    }

    public String getTOURNAMENT_CODE() {
        return TOURNAMENT_CODE;
    }

    public void setTOURNAMENT_CODE(String TOURNAMENT_CODE) {
        this.TOURNAMENT_CODE = TOURNAMENT_CODE;
    }

    public String getTOURNAMENT_ID() {
        return TOURNAMENT_ID;
    }

    public void setTOURNAMENT_ID(String TOURNAMENT_ID) {
        this.TOURNAMENT_ID = TOURNAMENT_ID;
    }

    public String getORGANIZER_NAME() {
        return ORGANIZER_NAME;
    }

    public void setORGANIZER_NAME(String ORGANIZER_NAME) {
        this.ORGANIZER_NAME = ORGANIZER_NAME;
    }

    public String getORGANIZER_ID() {
        return ORGANIZER_ID;
    }

    public void setORGANIZER_ID(String ORGANIZER_ID) {
        this.ORGANIZER_ID = ORGANIZER_ID;
    }

    public String getLOCATION() {
        return LOCATION;
    }

    public void setLOCATION(String LOCATION) {
        this.LOCATION = LOCATION;
    }

    public String getGROUNG_NAME() {
        return GROUNG_NAME;
    }

    public void setGROUNG_NAME(String GROUNG_NAME) {
        this.GROUNG_NAME = GROUNG_NAME;
    }

    public int getNUMBER_OF_TEAMS() {
        return NUMBER_OF_TEAMS;
    }

    public void setNUMBER_OF_TEAMS(int NUMBER_OF_TEAMS) {
        this.NUMBER_OF_TEAMS = NUMBER_OF_TEAMS;
    }

    public Date getDATE_START() {
        return DATE_START;
    }

    public void setDATE_START(Date DATE_START) {
        this.DATE_START = DATE_START;
    }

    public Date getDATE_END() {
        return DATE_END;
    }

    public void setDATE_END(Date DATE_END) {
        this.DATE_END = DATE_END;
    }

    public Team getTEAM_WINNER() {
        return TEAM_WINNER;
    }

    public void setTEAM_WINNER(Team TEAM_WINNER) {
        this.TEAM_WINNER = TEAM_WINNER;
    }

    public ArrayList<Team> getTEAM_ALL() {
        return TEAM_ALL;
    }

    public void setTEAM_ALL(ArrayList<Team> TEAM_ALL) {
        this.TEAM_ALL = TEAM_ALL;
    }

    public String getTOURNAMENT_STATUS() {
        return TOURNAMENT_STATUS;
    }

    public void setTOURNAMENT_STATUS(String TOURNAMENT_STATUS) {
        this.TOURNAMENT_STATUS = TOURNAMENT_STATUS;
    }
}

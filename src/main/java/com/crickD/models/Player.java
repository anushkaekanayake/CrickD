package com.crickD.models;

import java.util.ArrayList;

/**
 * Entity related to a single player
 * Created by Anushka Ekanayake on 8/7/2016.
 */
public class Player {
    private String PLAYER_NAME = null;
    private String PLAYER_NUMBER = null;
    private String PLAYER_EMAIL = null;
    private String PLAYER_MOBILE_NO = null;
    private String PLAYER_RATING = null;
    private int PLAYER_AGE = 0;
    private String PLAYER_NATIONALITY = null;
    /**
     * player good at
     * BAT = bats man
     * BALL = bowler
     * WK = wicket keeper
     */
    private ArrayList<String> PLAYER_CATEGORIES = null;

    //RELATED TO TEST
    private double TEST_TOTAL_NUM_RUNS = 0;
    private double TEST_TOTAL_NUM_WICKETS = 0;
    private double TEST_TOTAL_NUM_STUMPPED = 0;
    private String TEST_BEST_PERFORMANCE_BATTING = null;
    private String TEST_BEST_PERFORMANCE_BAWLING = null;

    //RELATED TO Oneday
    private double ODI_TOTAL_NUM_RUNS = 0;
    private double ODI_TOTAL_NUM_WICKETS = 0;
    private double ODI_TOTAL_NUM_STUMPPED = 0;
    private String ODI_BEST_PERFORMANCE_BATTING = null;
    private String ODI_BEST_PERFORMANCE_BAWLING = null;

    //RELATED TO T20
    private double T20_TOTAL_NUM_RUNS = 0;
    private double T20_TOTAL_NUM_WICKETS = 0;
    private double T20_TOTAL_NUM_STUMPPED = 0;
    private String T20_BEST_PERFORMANCE_BATTING = null;
    private String T20_BEST_PERFORMANCE_BAWLING = null;

    public String getPLAYER_NAME() {
        return PLAYER_NAME;
    }

    public void setPLAYER_NAME(String PLAYER_NAME) {
        this.PLAYER_NAME = PLAYER_NAME;
    }

    public String getPLAYER_NUMBER() {
        return PLAYER_NUMBER;
    }

    public void setPLAYER_NUMBER(String PLAYER_NUMBER) {
        this.PLAYER_NUMBER = PLAYER_NUMBER;
    }

    public String getPLAYER_EMAIL() {
        return PLAYER_EMAIL;
    }

    public void setPLAYER_EMAIL(String PLAYER_EMAIL) {
        this.PLAYER_EMAIL = PLAYER_EMAIL;
    }

    public String getPLAYER_MOBILE_NO() {
        return PLAYER_MOBILE_NO;
    }

    public void setPLAYER_MOBILE_NO(String PLAYER_MOBILE_NO) {
        this.PLAYER_MOBILE_NO = PLAYER_MOBILE_NO;
    }

    public String getPLAYER_RATING() {
        return PLAYER_RATING;
    }

    public void setPLAYER_RATING(String PLAYER_RATING) {
        this.PLAYER_RATING = PLAYER_RATING;
    }

    public int getPLAYER_AGE() {
        return PLAYER_AGE;
    }

    public void setPLAYER_AGE(int PLAYER_AGE) {
        this.PLAYER_AGE = PLAYER_AGE;
    }

    public String getPLAYER_NATIONALITY() {
        return PLAYER_NATIONALITY;
    }

    public void setPLAYER_NATIONALITY(String PLAYER_NATIONALITY) {
        this.PLAYER_NATIONALITY = PLAYER_NATIONALITY;
    }

    public ArrayList<String> getPLAYER_CATEGORIES() {
        return PLAYER_CATEGORIES;
    }

    public void setPLAYER_CATEGORIES(ArrayList<String> PLAYER_CATEGORIES) {
        this.PLAYER_CATEGORIES = PLAYER_CATEGORIES;
    }

    public double getTEST_TOTAL_NUM_RUNS() {
        return TEST_TOTAL_NUM_RUNS;
    }

    public void setTEST_TOTAL_NUM_RUNS(double TEST_TOTAL_NUM_RUNS) {
        this.TEST_TOTAL_NUM_RUNS = TEST_TOTAL_NUM_RUNS;
    }

    public double getTEST_TOTAL_NUM_WICKETS() {
        return TEST_TOTAL_NUM_WICKETS;
    }

    public void setTEST_TOTAL_NUM_WICKETS(double TEST_TOTAL_NUM_WICKETS) {
        this.TEST_TOTAL_NUM_WICKETS = TEST_TOTAL_NUM_WICKETS;
    }

    public double getTEST_TOTAL_NUM_STUMPPED() {
        return TEST_TOTAL_NUM_STUMPPED;
    }

    public void setTEST_TOTAL_NUM_STUMPPED(double TEST_TOTAL_NUM_STUMPPED) {
        this.TEST_TOTAL_NUM_STUMPPED = TEST_TOTAL_NUM_STUMPPED;
    }

    public String getTEST_BEST_PERFORMANCE_BATTING() {
        return TEST_BEST_PERFORMANCE_BATTING;
    }

    public void setTEST_BEST_PERFORMANCE_BATTING(String TEST_BEST_PERFORMANCE_BATTING) {
        this.TEST_BEST_PERFORMANCE_BATTING = TEST_BEST_PERFORMANCE_BATTING;
    }

    public String getTEST_BEST_PERFORMANCE_BAWLING() {
        return TEST_BEST_PERFORMANCE_BAWLING;
    }

    public void setTEST_BEST_PERFORMANCE_BAWLING(String TEST_BEST_PERFORMANCE_BAWLING) {
        this.TEST_BEST_PERFORMANCE_BAWLING = TEST_BEST_PERFORMANCE_BAWLING;
    }

    public double getODI_TOTAL_NUM_RUNS() {
        return ODI_TOTAL_NUM_RUNS;
    }

    public void setODI_TOTAL_NUM_RUNS(double ODI_TOTAL_NUM_RUNS) {
        this.ODI_TOTAL_NUM_RUNS = ODI_TOTAL_NUM_RUNS;
    }

    public double getODI_TOTAL_NUM_WICKETS() {
        return ODI_TOTAL_NUM_WICKETS;
    }

    public void setODI_TOTAL_NUM_WICKETS(double ODI_TOTAL_NUM_WICKETS) {
        this.ODI_TOTAL_NUM_WICKETS = ODI_TOTAL_NUM_WICKETS;
    }

    public double getODI_TOTAL_NUM_STUMPPED() {
        return ODI_TOTAL_NUM_STUMPPED;
    }

    public void setODI_TOTAL_NUM_STUMPPED(double ODI_TOTAL_NUM_STUMPPED) {
        this.ODI_TOTAL_NUM_STUMPPED = ODI_TOTAL_NUM_STUMPPED;
    }

    public String getODI_BEST_PERFORMANCE_BATTING() {
        return ODI_BEST_PERFORMANCE_BATTING;
    }

    public void setODI_BEST_PERFORMANCE_BATTING(String ODI_BEST_PERFORMANCE_BATTING) {
        this.ODI_BEST_PERFORMANCE_BATTING = ODI_BEST_PERFORMANCE_BATTING;
    }

    public String getODI_BEST_PERFORMANCE_BAWLING() {
        return ODI_BEST_PERFORMANCE_BAWLING;
    }

    public void setODI_BEST_PERFORMANCE_BAWLING(String ODI_BEST_PERFORMANCE_BAWLING) {
        this.ODI_BEST_PERFORMANCE_BAWLING = ODI_BEST_PERFORMANCE_BAWLING;
    }

    public double getT20_TOTAL_NUM_RUNS() {
        return T20_TOTAL_NUM_RUNS;
    }

    public void setT20_TOTAL_NUM_RUNS(double t20_TOTAL_NUM_RUNS) {
        T20_TOTAL_NUM_RUNS = t20_TOTAL_NUM_RUNS;
    }

    public double getT20_TOTAL_NUM_WICKETS() {
        return T20_TOTAL_NUM_WICKETS;
    }

    public void setT20_TOTAL_NUM_WICKETS(double t20_TOTAL_NUM_WICKETS) {
        T20_TOTAL_NUM_WICKETS = t20_TOTAL_NUM_WICKETS;
    }

    public double getT20_TOTAL_NUM_STUMPPED() {
        return T20_TOTAL_NUM_STUMPPED;
    }

    public void setT20_TOTAL_NUM_STUMPPED(double t20_TOTAL_NUM_STUMPPED) {
        T20_TOTAL_NUM_STUMPPED = t20_TOTAL_NUM_STUMPPED;
    }

    public String getT20_BEST_PERFORMANCE_BATTING() {
        return T20_BEST_PERFORMANCE_BATTING;
    }

    public void setT20_BEST_PERFORMANCE_BATTING(String t20_BEST_PERFORMANCE_BATTING) {
        T20_BEST_PERFORMANCE_BATTING = t20_BEST_PERFORMANCE_BATTING;
    }

    public String getT20_BEST_PERFORMANCE_BAWLING() {
        return T20_BEST_PERFORMANCE_BAWLING;
    }

    public void setT20_BEST_PERFORMANCE_BAWLING(String t20_BEST_PERFORMANCE_BAWLING) {
        T20_BEST_PERFORMANCE_BAWLING = t20_BEST_PERFORMANCE_BAWLING;
    }
}

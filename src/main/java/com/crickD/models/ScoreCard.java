package com.crickD.models;

/**
 * Uses to representation for display
 * Values related to the Score card and it's properties
 * Created by Anushka Ekanayake on 8/10/2016.
 */
public class ScoreCard {

    private int TOTAL_NUM_RUNS = 0;
    private Double TOTOAL_NUM_OVERS = 0.0;
    private int TOTAL_NUM_WICKETS = 0;
    private Team CURRENT_TEAM_BATTING = null;
    private Team CURRENT_TEAM_BAWLING = null;
    private Player CURRENT_PLAYER_BATTING = null;
    private Player CURRENT_PLAYER_BATTING_OTHER = null;
    private Player CURRENT_PLAYER_BAWLING = null;

    public Player getCURRENT_PLAYER_BAWLING() {
        return CURRENT_PLAYER_BAWLING;
    }

    public void setCURRENT_PLAYER_BAWLING(Player CURRENT_PLAYER_BAWLING) {
        this.CURRENT_PLAYER_BAWLING = CURRENT_PLAYER_BAWLING;
    }

    public int getTOTAL_NUM_RUNS() {
        return TOTAL_NUM_RUNS;
    }

    public void setTOTAL_NUM_RUNS(int TOTAL_NUM_RUNS) {
        this.TOTAL_NUM_RUNS = TOTAL_NUM_RUNS;
    }

    public Double getTOTOAL_NUM_OVERS() {
        return TOTOAL_NUM_OVERS;
    }

    public void setTOTOAL_NUM_OVERS(Double TOTOAL_NUM_OVERS) {
        this.TOTOAL_NUM_OVERS = TOTOAL_NUM_OVERS;
    }

    public int getTOTAL_NUM_WICKETS() {
        return TOTAL_NUM_WICKETS;
    }

    public void setTOTAL_NUM_WICKETS(int TOTAL_NUM_WICKETS) {
        this.TOTAL_NUM_WICKETS = TOTAL_NUM_WICKETS;
    }

    public Team getCURRENT_TEAM_BATTING() {
        return CURRENT_TEAM_BATTING;
    }

    public void setCURRENT_TEAM_BATTING(Team CURRENT_TEAM_BATTING) {
        this.CURRENT_TEAM_BATTING = CURRENT_TEAM_BATTING;
    }

    public Team getCURRENT_TEAM_BAWLING() {
        return CURRENT_TEAM_BAWLING;
    }

    public void setCURRENT_TEAM_BAWLING(Team CURRENT_TEAM_BAWLING) {
        this.CURRENT_TEAM_BAWLING = CURRENT_TEAM_BAWLING;
    }

    public Player getCURRENT_PLAYER_BATTING() {
        return CURRENT_PLAYER_BATTING;
    }

    public void setCURRENT_PLAYER_BATTING(Player CURRENT_PLAYER_BATTING) {
        this.CURRENT_PLAYER_BATTING = CURRENT_PLAYER_BATTING;
    }

    public Player getCURRENT_PLAYER_BATTING_OTHER() {
        return CURRENT_PLAYER_BATTING_OTHER;
    }

    public void setCURRENT_PLAYER_BATTING_OTHER(Player CURRENT_PLAYER_BATTING_OTHER) {
        this.CURRENT_PLAYER_BATTING_OTHER = CURRENT_PLAYER_BATTING_OTHER;
    }
}

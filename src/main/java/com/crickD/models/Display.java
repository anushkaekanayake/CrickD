package com.crickD.models;

/**
 * Entity related to all the content of the Display - WHEN PASSING DATA TO DISPLAY THIS SHOULD NOT BE PASSED**** DTO MUST BE PASSED
 * <p>
 * Created by Anushka Ekanayake on 8/7/2016.
 */
public class Display {

    // TODO: 8/10/2016 imporove this model
    //small score card which will publish always
    private ScoreCard SCORE_CARD = null;
    private Advertisement ADDVERTIESMENT = null;
    private Animation ANIMATION = null;

    public ScoreCard getSCORE_CARD() {
        return SCORE_CARD;
    }

    public void setSCORE_CARD(ScoreCard SCORE_CARD) {
        this.SCORE_CARD = SCORE_CARD;
    }

    public Advertisement getADDVERTIESMENT() {
        return ADDVERTIESMENT;
    }

    public void setADDVERTIESMENT(Advertisement ADDVERTIESMENT) {
        this.ADDVERTIESMENT = ADDVERTIESMENT;
    }

    public Animation getANIMATION() {
        return ANIMATION;
    }

    public void setANIMATION(Animation ANIMATION) {
        this.ANIMATION = ANIMATION;
    }
}

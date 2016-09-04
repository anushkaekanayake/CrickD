package com.crickD.models;

import java.util.HashMap;

/**
 * Uses for display
 * Uses to represent animations for starting, ending , out, six, four,catch,lbw,wicket,zero(duck) 50, 100, 150, 200, 250,300,350,400,450,500,550,600
 * all these are animated gif
 * Created by Anushka Ekanayake on 8/10/2016.
 */
public class Animation {
    //read all the animation types and its values (URL)
    private HashMap<String, String> ANIMATION_URL = null;

    public HashMap<String, String> getANIMATION_URL() {
        return ANIMATION_URL;
    }

    public void setANIMATION_URL(HashMap<String, String> ANIMATION_URL) {
        this.ANIMATION_URL = ANIMATION_URL;
    }
}

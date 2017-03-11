package com.company;

/**
 * Created by ian on 10/03/2017.
 */
public class Player {

    public String mFullName;
    public int mHealth;
    public String mWeapon;

    public void loseHealth(int damage) {
        mHealth= mHealth - damage;
        if(mHealth <=0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return mHealth;
    }
}

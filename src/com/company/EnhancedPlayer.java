package com.company;

/**
 * Created by ian on 10/03/2017.
 */
public class EnhancedPlayer {
    private String mFullName;
    private int mHealth;
    private String mWeapon;

    public EnhancedPlayer(String fullName, int health, String weapon) {
        mFullName = fullName;

        if(health <= 100){
            mHealth = health;
        }else{
            System.out.println("invalid health setting health to 100");
            mHealth = 100;
        }
        mWeapon = weapon;
    }

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

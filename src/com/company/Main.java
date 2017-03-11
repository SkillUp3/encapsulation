package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Player player = new Player();
//        player.mFullName = "ian";
//        player.mHealth = 100;
//        player.mWeapon = "sword";
//        player.mHealth = 999999;
//
//        player.loseHealth(50);
//        System.out.println(player.getHealth());
//        player.loseHealth(50);

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Ian", 10, "sword");
        System.out.println(enhancedPlayer.getHealth());

    }
}

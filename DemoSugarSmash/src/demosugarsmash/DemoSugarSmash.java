/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosugarsmash;

import java.util.*;

/**
 *
 * @author Ahsan
 */
public class DemoSugarSmash {

    public static final String EXIT = "X";

    private static final String MENU
            = "-------------------------\n"
            + "- CIS Menu\n"
            + "- 1> Free version\n"
            + "- 2> Premium Version\n"
            + "- 3> Show details\n"
            + "- X-eXit\n"
            + "-------------------------\n"
            + "Option-->";

    public static ArrayList<SugarSmashPlayer> storeGamesPlayed = new ArrayList<>();

    public static void main(String[] args) {

        //Add a loop below to continuously promput the user for their choice 
        //until they choose to exit.
        String option = "";

        do {
            option = Util.getInputString(MENU);
            processMenuOption(option);
        } while (!option.equalsIgnoreCase(EXIT));

    }

    /**
     * This method will process the menu option specified in the input
     * parameter. It will call appropriate functionality based on its value.
     *
     * @param option The menu option
     * @since 20171102
     * @author cis1201b modified by Md Ahsanul Hoque in 20190727
     *
     */
    public static void processMenuOption(String option) {
        //Add a switch to process the option
        //int tempLevel = 0, tempScore = 0; String tempScreenName = "";
        switch (option.toUpperCase()) {
            
            
            
            case "1":
                SugarSmashPlayer aSugarSmashPlayer = new SugarSmashPlayer();
                aSugarSmashPlayer.getScreenNameFromUser();
                
                //aSugarSmashPlayer.setScreenName();
                int temp = 0;
                while(temp != -1){
                    aSugarSmashPlayer.getInfoFromUser();
                    temp = aSugarSmashPlayer.setScore(aSugarSmashPlayer.getSingleScore(), aSugarSmashPlayer.getLevel());
                    if(aSugarSmashPlayer.getLevel() == 10){
                        System.out.println("Congratulation" + aSugarSmashPlayer.getScreenName() + " you have completed the all levels of the game!! \nThe scores are as follow: ");
                        temp = -1;
                    }
                }
//                if(temp != -1){
//                    storeGamesPlayed.add(aSugarSmashPlayer);
//                }
                //int[] myInt = aSugarSmashPlayer.getScores();
                for (int i = 0; i < aSugarSmashPlayer.getScores().length; i++) {
                    System.out.print(aSugarSmashPlayer.getScores()[i]+" ");
                }
                break;
            case "2":
                PremiumSugarSmashPlayer aPremiumSugarSmashPlayer = new PremiumSugarSmashPlayer();
                aPremiumSugarSmashPlayer.getScreenNameFromUser();
                aPremiumSugarSmashPlayer.getInfoFromUser();
                aPremiumSugarSmashPlayer.setScore(aPremiumSugarSmashPlayer.getSingleScore(), aPremiumSugarSmashPlayer.getLevel());
                for (int i = 0; i < aPremiumSugarSmashPlayer.getScores().length; i++) {
                    System.out.print(aPremiumSugarSmashPlayer.getScores()[i]+" ");
                }
                break;
            case "3":
                for(SugarSmashPlayer current : storeGamesPlayed){
                    Util.display("Level: " +current.getLevel() + ", Score: " + current.getScore(current.getLevel()));
                }
                //Util.display("User picked 2");
                break;
            case "X":
                Util.display("User picked x");
                break;
            default:
                Util.display("Invalid entry");
        }
    }
}

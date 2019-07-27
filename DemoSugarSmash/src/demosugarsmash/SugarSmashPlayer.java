/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosugarsmash;

/**
 *
 * @author Ahsan
 */
public class SugarSmashPlayer {
    
    public final int INVALID = -1;
    public final int MINIMUM_SCORE = 100;
    private int level = 10;
    private int playerId;
    private String screenName;
    private int[] scores = new int[level - 1];
    
    private int singleScore;

    public int getSingleScore() {
        return singleScore;
    }

    public void setSingleScore(int singleScore) {
        this.singleScore = singleScore;
    }

    
    public SugarSmashPlayer(){
        this.level = Util.getInputInt("Enter the level of the game: ");
        this.singleScore = Util.getInputInt("Enter the score(int) of the game: ");
        //this.screenName = Util.getInputString("Enter Screen Name: ");
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public int getScore(int l) {
        if(l>scores.length) {
            System.out.println("Invalid level mentioned..!!");
            return INVALID;
        }
        else return this.scores[l-1];
    }
    
    public int[] getScores(){
        return this.scores;
    }
    
    

    public int setScore(int score, int level) {
        int determinant = 0;
        int temp = level - 1;
        if(!isAssignable() && level > this.level){
            System.out.println("Invalid operation for setting up the score you entered");
            determinant = INVALID;
        }else{
            if(temp == 0){
                this.scores[temp] = score;
            }else{
                determinant = earnMinimumScore(score, temp);
            }
        }
        return determinant;
    }

    private int earnMinimumScore(int score, int temp) {
        int validator = 0;
        if (score>=MINIMUM_SCORE) {
            this.scores[temp] = score;
        } else {
            System.out.println("You must earn at least 100 points");
            validator = INVALID;
        }
        return validator;
    }
    
//    public boolean isFound(int indexValue)
//    {
//        boolean flag = false;
//        for(int i = 0; i<scores.length; i++){
//            if(scores[i] == indexValue){   
//                flag = true;
//                break;
//            }
//        }
//        return flag;
//    }
//    
    public boolean isAssignable(){
        boolean flag = false;
        for(int i=0; i<scores.length; i++){
            if(scores[i] == 0){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public int getLevel() {
        return level;
    }
}

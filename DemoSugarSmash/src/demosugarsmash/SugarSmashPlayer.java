
package demosugarsmash;

/**
 *
 * @author Ahsanul Hoque
 * @since 20190808
 */
public class SugarSmashPlayer {
    
    public final int INVALID = -1;
    public final int MINIMUM_SCORE = 100;
    public final int SCORE_SIZE = 10;
    
    private int level;
    private int playerId;
    private String screenName;
    private int[] scores = new int[SCORE_SIZE];
    
    private int singleScore;

    public int getSingleScore() {
        return singleScore;
    }

    public void setSingleScore(int singleScore) {
        this.singleScore = singleScore;
    }

    //public SugarSmashPlayer(){}
    public SugarSmashPlayer(){}

    /**
     * Get input from the user using the appropriate input method
     * @since 20190808
     * @author Md Ahsanul Hoque
     */
    public void getInfoFromUser() {
        this.level = Util.getInputInt("Enter the level of the game: ");
        this.singleScore = Util.getInputInt("Enter the score(int) of the game: ");
    }
    
    public void getScreenNameFromUser(){
        this.screenName = Util.getInputString("Enter Screen Name: ");
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
    
    
    /**
     * @return integer is determinant that ensure whether it is valid or not.
     * @since 20190808
     * @author Md Ahsanul Hoque
     */
    public int setScore(int score, int level) {
        int determinant = 0;
        int temp = level - 1;
        return saveScore(temp, score, determinant);
    }

    /**
     * save the score in array
     * @since 20190808
     * @author Md Ahsanul Hoque
     */
    private int saveScore(int temp, int score, int determinant) {
        //int temp2 = this.level;
        //boolean temp3 = isAssignable(temp);
        if(temp < scores.length && isAssignable(temp)){
            if(temp == 0){
                this.scores[temp] = score;
            }else{
                determinant = earnMinimumScore(score, temp);
            }
        }else{
            System.out.println("You entered invalid level");
            determinant = INVALID;
        }
        return determinant;
    }

    /**
     * ensure minimum score is achieved
     * @since 20190808
     * @author Md Ahsanul Hoque
     */
    private int earnMinimumScore(int score, int temp) {
        int validator = 0;
        if (temp != 0 && scores[temp - 1] >= MINIMUM_SCORE) {
            this.scores[temp] = score;
        } else {
            System.out.println("You must earn at least 100 points in previous level");
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
    /**
     * validate whether the score user entered is assignable or not in the array
     * @since 20190808
     * @author Md Ahsanul Hoque
     */
    public boolean isAssignable(int index){
        boolean flag = false;
            if(index<this.SCORE_SIZE && scores[index] == 0){
                flag = true;
            }
        return flag;
    }

    public int getLevel() {
        return level;
    }
}

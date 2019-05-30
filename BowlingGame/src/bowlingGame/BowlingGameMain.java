package bowlingGame;

/**
 * @BowlingGame Main class
 * @author Md Ahsanul Hoque
 * @since 20190204
 */
public class BowlingGameMain {

    public static final int NO_OF_PLAYERS = 4;
    public static final int NO_OF_ENDS = 10;
    static String[] playerNames = new String[NO_OF_PLAYERS];
    static int[] scores = new int[NO_OF_PLAYERS];
    
    static int[][] gameRecords = new int[NO_OF_PLAYERS][NO_OF_ENDS];
    
    static Player newPlayer = new Player();
    
    public static void main(String[] args) {
        setInitialGameRecords();
        setInitialIndividualTotalScore();
        storePlayerNames();
        updateCurrentState();
        CisUtility.display(determineWiner(scores));
    }
    
    /**
    * @A method that sets initial game records for each player
    * @author Md Ahsanul Hoque
    * @since 20190204
    */
    public static void setInitialGameRecords(){
        for (int i = 0; i < NO_OF_PLAYERS; i++) {
            for (int j = 0; j < NO_OF_ENDS; j++) {
                gameRecords[i][j] = -1;
            }
        }
    }
    /**
    * @A method that sets initial individual total score for player
    * @author Md Ahsanul Hoque
    * @since 20190204
    */
    public static void setInitialIndividualTotalScore(){
        for (int i = 0; i < scores.length; i++) {
            scores[i] = 0;
        }
    }
    
    /**
    * @A method that store player name
    * @author Md Ahsanul Hoque
    * @since 20190204
    */
    public static void storePlayerNames(){
        String name = "";
        for (int count = 0; count < playerNames.length; count++) {
             name = CisUtility.getInputString("Enter player#"
                    +(count+1)+" name: ");
             newPlayer.setName(name);
            playerNames[count] = newPlayer.getName();
        }
    }
    
    /**
    * @A method that update current statistics upon entering each player's score
    * @author Md Ahsanul Hoque
    * @since 20190204
    */
    public static void updateCurrentState(){
        
        //int totalIndividualScore = 0;
        for (int i = 0; i < NO_OF_ENDS; i++) {
            //gameRecords[i][0] = i+1;
            for (int j = 0; j < NO_OF_PLAYERS; j++) {
                gameRecords[j][i] = CisUtility.getInputInt("\nEnter the score for "
                +playerNames[j]+"--> ");
                display(gameRecords);
            }
        }
    }

    /**
    * @A method that display current summery
    * @author Md Ahsanul Hoque
    * @since 20190204
    */
    public static void display(int[][] gameRecords){
        calculateIndividualTotalScore();
        for (int i = 0; i < playerNames.length; i++) {
            System.out.print(playerNames[i]+ "\t");
            for (int j = 0; j < NO_OF_ENDS; j++) {
                if(gameRecords[i][j] == -1){
                    System.out.print("");
                }else{
                    System.out.print("  "+gameRecords[i][j]);
                }
            }
            System.out.print(scores[i]!=0? "\t| "+scores[i] : "");
            System.out.println();
        }
        
    }
    
    /**
    * @A method that calculates current individual score
    * @author Md Ahsanul Hoque
    * @since 20190204
    */
    public static void calculateIndividualTotalScore(){
        int tempTotal = 0;
        
        for (int i = 0; i < NO_OF_PLAYERS; i++) {
            for (int j = 0; j < NO_OF_ENDS; j++) {
                if (gameRecords[i][j] != -1) {
                    tempTotal += gameRecords[i][j];   
                }
            }
            newPlayer.setTotalScore(tempTotal);
            scores[i] = newPlayer.getTotalScore();
            tempTotal = 0;
        }
    }
    
    /**
    * @A method that determines winner based on highest score
    * @author Md Ahsanul Hoque
    * @since 20190204
    */
    public static String determineWiner(int[] score){
        int highestScore = score[0];
        int hightScorerIndex = 0;
        for (int i = 0; i < score.length;i++) {
            if(highestScore<score[i]){
                highestScore = score[i];
                hightScorerIndex = i;
            }
        }
        return "Congratulation " + playerNames[hightScorerIndex];
    }
}

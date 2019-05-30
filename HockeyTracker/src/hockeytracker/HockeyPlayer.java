package hockeytracker;

    /**
    * @HockeyPlayer class
    * @since 20192301
    * @author MdAhsanul Hoque
    */
public class HockeyPlayer {
    public final int GAME_SESSION = 10;
    public final int NO_GOAL = -1;
    
    private String[] opponentTeamName = new String[GAME_SESSION];
    private int[] numberOfGoals = new int[GAME_SESSION];
    
    private String name;
    private int playerNumber;
    private int[] gameNumber = new int[GAME_SESSION];
    

    private int goals;
    private int gameNum;
    

    
    public HockeyPlayer(){
        this.goals = NO_GOAL;
        assignInitialNoOfGoals(this.goals);
        this.name = CisUtility.getInputString("Enter the player's name: ");
        this.playerNumber = CisUtility.getInputInt("Enter player number: ");
        assignDefaultGameNum();
    }
    public void addGameDetails(){
        gameNum = CisUtility.getInputInt("Enter game number: ");
        String opponentName = CisUtility.getInputString("Enter Opponent name: ");
        opponentTeamName[gameNum-1] = opponentName;
        numberOfGoals[gameNum-1] = CisUtility.getInputInt("Enter the number of goals: ");
        this.gameNumber[gameNum - 1] = gameNum;
    }
    private void assignDefaultGameNum(){
        for (int i = 0; i < gameNumber.length; i++) {
            this.gameNumber[i] = -1;
        }
    }
    /**
    * @A method that display game details
    * @since 20192301
    * @author MdAhsanul Hoque
    */
    public String toString(){
        int totalGames=0,totalGoals=0;
        CisUtility.display("#"+ getPlayerNumber() + " " + getName()
                            +"\nGame details: \n");
        for (int i = 0; i < this.gameNumber.length; i++) {
            if(this.gameNumber[i] != -1){
                System.out.println("Game " + this.gameNumber[i] + ": " + opponentTeamName[i] + " " + numberOfGoals[i] + " Goals");
                
            }
        }
        totalGoals = calculateTotalGoals();
        totalGames = countGameNumber();
        CisUtility.display("\nTotal games: "+ totalGames 
                           +"\nTotal goals: " +totalGoals +"\n"
                           +"-----------------------------------");
        return null;
    }
    /**
    * @Method that assigns initial value of goals(NO_GOAL)
    * @since 20192301
    * @author MdAhsanul Hoque
    */
    public void assignInitialNoOfGoals(int initialGoals){
        for (int i = 0; i < numberOfGoals.length; i++) {
            numberOfGoals[i] = initialGoals;
        }
    }
    /**
    * @Method that counts game number
    * @since 20192301
    * @author MdAhsanul Hoque
    */
    public int countGameNumber(){
        int tempGameNo=0;
            for (int i = 0; i < gameNumber.length; i++) {
                if(gameNumber[i] != -1){
                tempGameNo++;
            }
        }
        return tempGameNo;
    }
    /**
    * @The method that calculate total goals number for the specific player 
    * @since 20192301
    * @author MdAhsanul Hoque
    */
    public int calculateTotalGoals(){
        int tempGoal = 0;
        for (int i = 0; i < numberOfGoals.length; i++) {
           if (numberOfGoals[i] != -1) {
                tempGoal += numberOfGoals[i];
            } 
        }
        return tempGoal;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the playerNumber
     */
    public int getPlayerNumber() {
        return playerNumber;
    }
}

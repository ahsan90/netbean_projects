
package hockeytracker;

/**
 * @Hockey Main class
 * @since 20192301
 * @author MdAhsanul Hoque
 */
public class HockeyMain {

    public static String[] player = new String[12];
    int[] playerNumber = new int[player.length];
    static HockeyPlayer[] players = new HockeyPlayer[12];
    
    public static final String EXIT = "X";
    
    private static final String MENU
            = "===========================\n"
            + "\n"
            + "Hockey Tracker\n"
            + "A-Add player\n"
            + "G-Add game details\n"
            + "S- Show Details\n"
            + "X-eXit\n"
            + "===========================\n";
    
    public static void main(String[] args) {

        //Add a loop below to continuously promput the user for their choice 
        //until they choose to exit.
        String option = "";

        do {
            option = CisUtility.getInputString(MENU);
            processMenuOption(option);
        } while (!option.equalsIgnoreCase(EXIT));
        
    }

    /**
     * This method will process the menu option specified in the input
     * parameter. It will call appropriate functionality based on its value.
     *
     * @param option The menu option
     * @since 20171102
     * @author cis1201b
     *
     */
    public static void processMenuOption(String option) {
        //Add a switch to process the option
        switch (option.toUpperCase()) {
            case "A":
                HockeyPlayer newPlayer = new HockeyPlayer();
                players[newPlayer.getPlayerNumber() - 1] = newPlayer;
                
                break;
            case "G":
                
                int foundPlayer = CisUtility.getInputInt("Enter player number: ");
                for (int i = 0; i < players.length; i++) {
                    if (players[foundPlayer-1] == null) {
                        CisUtility.display("No player found with this number");
                        break;
                    }else{
                        players[foundPlayer-1].addGameDetails();
                        break;
                    }
                }
                break;
            case "S":
                
                for (int i = 0; i < players.length; i++) {
                    if (players[i] != null) {
                        players[i].toString();
                    }
                }
                break;
            case "X":
                CisUtility.display("User picked x");
                break;
            default:
                CisUtility.display("Invalid entry");
        }
    }
}

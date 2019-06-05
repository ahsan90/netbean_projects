package assignment4;

/**
* Assignment 4
* @since 20190227
* @author Md Ahsanul Hoque
*/
public class Assignment4 {
    private static String[] userNameArray = {"John", "Steve", "Bonnie", "Kylie", "Logan", "Robert"};
    private static String[] passwordArray = {"1111", "2222", "3333", "4444", "5555", "6666"};
    
    private static Login login = new Login();
    public static final String EXIT = "Exit";
    
    private static final String MENU
            = "-------------------------\n"
            + "- CIS Menu\n"
            + "- Load\n"
            + "- Login\n"
            + "- Show\n"
            + "- Exit\n"
            + "-------------------------\n"
            + "Option-->";
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String option = "";

        do {
            option = CisUtility.getInputString(MENU);
            processMenuOption(option);
        } while (!option.equalsIgnoreCase(EXIT));
    }
    /**
     * This method will load the program menu.
     * @since 20190227
     * @author Md Ahsanul Hoque
     */
    public static void processMenuOption(String option) {
        //Add a switch to process the option
        
        switch (option.toUpperCase()) {
            case "LOAD":
                login.loadCredentials(userNameArray, passwordArray);
                break;
            case "LOGIN":
                login.login();
                break;
            case "SHOW":
                login.showAttempts();
                break;
            case "EXIT":
                CisUtility.display("User picked x");
                break;
            default:
                CisUtility.display("Invalid entry");
        }
    }
    
    
}

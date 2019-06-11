package roombooking;

import java.util.Scanner;

/**
 * Main class for assignment #5
 *
 * @author UPDATE
 * @since UPDATE
 */
public class UseHotelRoom {

    private static final String MENU
            = "-------------------------\n"
            + "- CIS Menu\n"
            + "- A-Add Hotel Room\n"
            + "- B-Add Suite\n"
            + "- C-Show all\n"
            + "- X-eXit\n"
            + "-------------------------\n"
            + "Option-->";

    public static void main(String[] args) {

        String option;
        do {
            option = getMenuOption(MENU);
            processMenuOption(option);
        } while (!option.equalsIgnoreCase("X"));
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
        switch (option) {
            case "A":
                System.out.println("User picked a");
                break;
            case "B":
                System.out.println("User picked b");
                break;
            case "C":
                System.out.println("User picked c");
                break;
            case "X":
                System.out.println("User picked x");
                break;
            default:
                System.out.println("Invalid entry");
        }
    }

    /**
     * This method will prompt the user based on the string passed in and return
     * their option.
     *
     * @param menu
     * @return
     */
    public static String getMenuOption(String menu) {
        System.out.print(MENU);
        Scanner input = new Scanner(System.in);
        String option = input.nextLine();
        option = option.toUpperCase();
        return option;
    }

}

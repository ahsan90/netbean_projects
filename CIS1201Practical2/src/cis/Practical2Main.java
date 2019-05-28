package cis;

import java.util.Scanner;

/**
 * This is the main class for cis1201 practical #2. Requirements provided in
 * SAM.
 *
 * @author bjmaclean
 * @since 20181115
 */
public class Practical2Main {

    public static final String EXIT = "X";

    private static final String MENU
            = "-------------------------\n"
            + "- CIS Menu\n"
            + "- A-Create a pizza order\n"
            + "- B-Show total of all pizzas\n"
            + "- X-eXit\n"
            + "-------------------------\n"
            + "Option-->";

    //attribute which can be used to hold total.
    private static double totalCost = 0;

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
     *
     */
    public static void processMenuOption(String option) {
        //Add a switch to process the option
        switch (option.toUpperCase()) {
            case "A":
                CisUtility.display("Add a pizza");

                Order pizza1 = new Order();
                pizza1.getInputFromUser();
                totalCost += pizza1.getCost();
                pizza1.display();

                break;
            case "B":
                CisUtility.display(String.format("The total of all orders is $%.2f", totalCost));
                break;
            case "X":
                CisUtility.display("Thanks for your order.");
                break;
            default:
                CisUtility.display("Invalid entry");
        }
    }

}

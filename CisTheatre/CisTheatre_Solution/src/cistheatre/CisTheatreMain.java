package cistheatre;

import java.util.ArrayList;
import java.util.*;

/**
 * This program will track ticket sales for the CIS Theatre Co.
 *
 * @author bjmaclean Updated by: Md Ahsanul Hoque
 * @since 20180208 Updated on: 20190221
 */
public class CisTheatreMain {

    private static final String MENU
            = "-------------------------\n"
            + "- CIS Theatre Co.\n"
            + "- A-Purchase a ticket\n"
            + "- B-Show all regular tickets\n"
            + "- C-Show all premium tickets\n"
            + "- D-Find a ticket by name and show ticket details \n"
            + "- E-Show summary \n"
            + "- X-eXit\n"
            + "-------------------------\n"
            + "Option-->";

    public static void main(String[] args) {
        ArrayList<Ticket> tickets = new ArrayList();
        
        
        //Add some test data for testing.
        addTestData(tickets);
        
        String option;
        do {
            option = getMenuOption(MENU);
            processMenuOption(option, tickets);
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
    public static void processMenuOption(String option, ArrayList<Ticket> tickets) {
        //Add a switch to process the option

        

        switch (option) {
            case "A":
                purchaseATicket(tickets);
                break;
            case "B":
                showAllRegularTickets(tickets);
                break;
            case "C":
                showAllPremiumTickets(tickets);
                break;
            case "D":
                findTicketByName(tickets);
                break;
            case "E":
                showSummary(tickets);
                break;
            case "X":
                break;
            default:
                System.out.println("Invalid entry");
        }
    }

    /**
     * This method will add a ticket to the tickets ArrayList.
     *
     * @author Md Ahsanul Hoque
     * @since 20190221
     * @param tickets ArrayList of tickets
     */
    private static void purchaseATicket(ArrayList<Ticket> tickets) {
        Ticket newTicket = new Ticket();
        tickets.add(newTicket);
    }

    /**
     * This method will show any regular tickets in the input tickets ArrayList.
     *
     * @author Md Ahsanul Hoque
     * @since 20190221
     * @param tickets ArrayList of tickets
     */
    private static void showAllRegularTickets(ArrayList<Ticket> tickets) {
        for ( Ticket aTicket : tickets) {
            if (aTicket.getType() == Ticket.CATEGORY_REGULAR) {
                System.out.println(aTicket.toString());
            }
        }
        
    }

    /**
     * This method will show any premium tickets in the input tickets ArrayList.
     *
     * @author Md Ahsanul Hoque
     * @since 20190221
     * @param tickets ArrayList of tickets
     */
             
    private static void showAllPremiumTickets(ArrayList<Ticket> tickets) {
        for ( Ticket aTicket : tickets) {
            if (aTicket.getType() == Ticket.CATEGORY_PREMIUM) {
                System.out.println(aTicket.toString());
            }
        }
    }

    /**
     * This method will ask the user for the name and find any tickets in the list 
     * that match that name.
     *
     * @author Md Ahsanul Hoque
     * @since 20190221
     * @param tickets ArrayList of tickets
     */
    private static void findTicketByName(ArrayList<Ticket> tickets) {
        String name = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Find ticket by name: ");
        name = input.nextLine();
        
        for ( Ticket aTicket : tickets) {
            if (name.equalsIgnoreCase(aTicket.getName())) {
                System.out.println(aTicket.toString());
            }
        }
    }

    /**
     * This method will show a summary.  It must show the following details:
     * Regular tickets: #    <-- # of regular tickets sold
     * Premium tickets: #    <-- # of premium tickets sold
     * Total Revenue: $      <-- Total revenue of regular and premium tickets
     * Names: ...             <-- List of names of ticket holders.  Note that  
     *                           one name could buy more than one ticket.  Do not 
     *                           expect to see the name twice!  So only show the 
     *                           distinct set of ticket names!
     *
     * @author Md Ahsanul Hoque
     * @since 20190221
     * @param tickets ArrayList of tickets
     */
    private static void showSummary(ArrayList<Ticket> tickets) {
        String summary = "";
        String names = "";
        double totalReqularCost = 0, totalPremiumCost = 0, revenue = 0;
        int countRegularTicket = 0, countPremiumTicket = 0;
        
        ArrayList<String> nameList = new ArrayList();
        
        for ( Ticket aTicket : tickets) {
            if (aTicket.getType() == Ticket.CATEGORY_PREMIUM) {
                totalPremiumCost += aTicket.getCost();
                countPremiumTicket++;
            }
        }
        
        for ( Ticket aTicket : tickets) {
            if (aTicket.getType() == Ticket.CATEGORY_REGULAR) {
                totalPremiumCost += aTicket.getCost();
                countRegularTicket++;
            }
        }
        
        revenue = totalReqularCost + totalPremiumCost;
        
        for (Ticket aTicket : tickets) {
            nameList.add(aTicket.getName());
        }
        
        //using set to remove duplicate
        Set<String> set = new HashSet<>(nameList);
        nameList.clear();
        nameList.addAll(set);
        
        for(String aName : nameList){
            names += aName +"\n";
        }
        summary = "Regular ticket: #" +countRegularTicket+
                "\nPremium ticket: #" +countPremiumTicket+
                "\nRevenue: $" +revenue +
                "\nNames: "
                +"\n" +names;
        
        System.out.println(summary);
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
    
    private static void addTestData(ArrayList<Ticket> tickets){
        tickets.add(new Ticket(1,"Will"));
        tickets.add(new Ticket(2,"George"));
        tickets.add(new Ticket(1,"Dave"));
        tickets.add(new Ticket(2,"Steve"));
        tickets.add(new Ticket(2,"Steve"));
        tickets.add(new Ticket(1,"Steve"));
        tickets.add(new Ticket(1,"Bob"));
        tickets.add(new Ticket(1,"Roger"));
        tickets.add(new Ticket(2,"John"));
        tickets.add(new Ticket(2,"Jill"));
        tickets.add(new Ticket(1,"Emily"));
        tickets.add(new Ticket(1,"Rosie"));
    }
}
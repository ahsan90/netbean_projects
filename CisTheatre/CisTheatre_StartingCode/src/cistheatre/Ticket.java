package cistheatre;

import java.util.Scanner;

/**
 * This class will represent tickets sold by the theatre.
 * @author bjmaclean Updated by:
 * @since 20180208 Updated on:
 */
public class Ticket {
    
    public static final double[] PRICES = {10.0, 15.5};
    public static final String[] CATEGORIES = {"REGULAR", "PREMIUM"};
    public static final int CATEGORY_REGULAR = 1;
    public static final int CATEGORY_PREMIUM = 2;
    private static int max;
    
    private int type;
    private String name;
    private int ticketNumber; //Derived based on static max attribute

    private static Scanner input = new Scanner(System.in);
    
    /**
     * Default constructor will prompt the user for values of type and name.
     * @author BJ MacLean
     * @since 20190211
     */
    
    public Ticket() {
        this.ticketNumber = ++max;
        System.out.print("Name-->");
        this.name = input.nextLine();
        System.out.println("Type (1=Regular 2=Premium)");
        this.type = input.nextInt();
        input.nextLine();
    }
    
    /**
     * Constructor which accepts name and type of ticket.
     * @author BJ MacLean
     * @param type Ticket Type
     * @param name Name of buyer
     * @since 20190211
     */
    
    public Ticket(int type, String name) {
        this.type = type;
        this.name = name;
        this.ticketNumber = ++max;
    }
    
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * This will return the cost associated with this ticket's type.
     * @return cost
     * @since 20180208
     * @author BJM
     */
    public double getCost(){
        return PRICES[type-1];
    }
    
    @Override
    public String toString() {
        return "Ticket#"+ticketNumber+" Name: "+name+" Type: "+CATEGORIES[type-1];
    }
    
    
    
    
}

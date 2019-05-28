package cis;

/**
 * This class will represent a pizza order. The cost for a pizza is based on the
 * fact that the user is a student, the number of premium ingredients, and the
 * number of regular ingredients.
 *
 * @author BJMacLean Modified by:
 * @since 20181122
 */
public class Order {

    private int numberOfRegularIngredients;
    private int numberOfPremiumIngredients;
    private int size;  //1,2,3 for small, medium, or large
    private boolean isStudent;

    public static final int COST_SMALL = 5;
    public static final int COST_MEDIUM = 7;
    public static final int COST_LARGE = 9;
    public static final double COST_REGULAR_INGREDIENT = 0.5;
    public static final double COST_PREMIUM_INGREDIENT = 1;
    public static final double DISCOUNT_STUDENT = 0.25;

    /**
     * Default constructor
     *
     * @since 20181122
     * @author BJM
     */
    public Order() {
        //No code needed
    }

    /**
     * The getInputFromUser method will ask the user for values of each
     * ingredient.
     *
     * @since 20181122
     *
     */
    public void getInputFromUser() {

        numberOfRegularIngredients = CisUtility.getInputInt("Enter the number of regular ingredients.");
        numberOfPremiumIngredients = CisUtility.getInputInt("Enter the number of premium ingredients.");
        size = CisUtility.getInputInt("Enter piza size (1) small, (2), medium, (3) large.");

        int isStudentTempInt = CisUtility.getInputInt("Are you a student 1=yes 2=no");

        if (isStudentTempInt == 1) {
            isStudent = true;
        } else {
            isStudent = false;
        }

    }

    /**
     * The getCost method will return the cost of a pizza order based on the
     * number of ingredients.
     *
     * @return The cost of the pizza
     * @since 20181122
     */
    public double getCost() {
        double cost = 0.0;

        switch (size) {
            case 1:
                cost += COST_SMALL;
                break;
            case 2:
                cost += COST_MEDIUM;
                break;
            case 3:
                cost += COST_LARGE;
                break;
        }

        cost += (numberOfRegularIngredients * COST_REGULAR_INGREDIENT)
                    + (numberOfPremiumIngredients * COST_PREMIUM_INGREDIENT);
        
        if (isStudent == true) {
            cost = cost *(1-DISCOUNT_STUDENT);
        }

        return cost;
    }
    //Do not need to change

    public String toString() {
        String studentIndicator = "No";
        if (isStudent) {
            studentIndicator = "Yes";
        }
        String output = String.format("CIS Pizza Order\n"
                + "Number of regular ingredients: %d\n"
                + "Number of premium ingredients: %d\n"
                + "Student: %s\n"
                + "Cost: $%.2f", numberOfRegularIngredients, numberOfPremiumIngredients, studentIndicator, getCost());
        return output;
    }

    public void display() {
        CisUtility.display(toString());
    }

}

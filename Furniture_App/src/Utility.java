
import java.util.Scanner;
/**
 * Utility class which contains some commonly used methods.
 * @author Ahsanul Hoque
 * @since 20181111
 */
public class Utility {
    private static Scanner input = new Scanner(System.in);
    
    /**
     * Display the string passed to the user.
     * @author Ahsanul Hoque
     * @since 20181111
     */
    public static void display(String output){
        System.out.println(output);
    }
    
     /**
     * Ask the user for an String value based on the input prompt
     * @author Ahsanul Hoque
     * @since 20181111
     */
    public static String getInputString(String prompt){
        System.out.println(prompt);
        return input.nextLine();
    }
    
    /**
     * Ask the user for an int value based on the input prompt
     * @param prompt
     * @return their answer
     * @author Ahsanul Hoque
     * @since 20181111
     */
    public static int getInputInt(String prompt){
        System.out.println(prompt);
        int entered = input.nextInt();
        input.nextLine();
        return entered;
    }
}

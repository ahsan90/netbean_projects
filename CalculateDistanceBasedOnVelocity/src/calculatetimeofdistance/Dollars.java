/*
 *  B. Write a class that calculates and displays the conversion of an entered number of dollars into currency denominations—20s, 10s, 5s, and 1s. Save the class as Dollars.java
 */
package calculatetimeofdistance;

import java.util.Scanner;

/**
 * This provide solution of currency denomination problem
 * @since Sep 26, 2018
 * @author Ahsan
 */
public class Dollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number :");
        //System.out.println();
        
        int dolar = input.nextInt();
        
        int number_of_20s = 0, number_of_10s = 0, 
            number_of_5s = 0, number_of_1s = 0, 
            reminder = 0;
        
        // Determine 20s
        number_of_20s = dolar/20;
        reminder = dolar % 20;
        
        // Determine 10s
        number_of_10s = reminder / 10;
        reminder = reminder % 10;
        
        //Determine 5s
        number_of_5s = reminder / 5;
        reminder = reminder % 5;
        
        //Determine 1s
        number_of_1s = reminder;
        
        //Output the results
        System.out.println(number_of_20s + " - 20s");
        System.out.println(number_of_10s + " - 10s");
        System.out.println(number_of_5s + " - 5s");
        System.out.println(number_of_1s + " - 1s");
    }
}

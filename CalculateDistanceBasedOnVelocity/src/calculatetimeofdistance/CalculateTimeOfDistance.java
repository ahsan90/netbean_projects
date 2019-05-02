/*
 *Write a program which will calculate the time it takes to arrive at a destination.
 *The user should enter the number of kilometers to the destination 
 *and the speed of the vehicle (km/h) .
 */

package calculatetimeofdistance;

import java.util.Scanner;

/**
 * This program will provide the time it needs to reach at the destination
 *
 * @since Sep 26, 2018
 * @author Md Ahsanul Hoque
 */

public class CalculateTimeOfDistance {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the distance to the destination (km): ");
        double distance = input.nextDouble();
        
        System.out.println("Please enter the speed (km/h): ");
        double speed = input.nextDouble();

        //Calculte the total time to travel the distance
        
        double time = (distance / speed) ;

        // print the required time

        System.out.println("It will take " + (int)time + " hours to arrive at the destination.");
    }
    
}

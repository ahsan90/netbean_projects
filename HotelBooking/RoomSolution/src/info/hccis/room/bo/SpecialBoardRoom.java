/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.hccis.room.bo;

import info.hccis.room.util.Util;
import java.util.*;

/**
 * 
 * Since: 20190326
 * @author Md Ahsanul Hoqoue
 */
public class SpecialBoardRoom extends BoardRoom{
    
    private int numberOfLazyBoys;
    private boolean hasCoffeeMaker;
    
    public SpecialBoardRoom(int roomNumber){
        super(roomNumber);
    }
    
    public void getRoomDetailsFromUser() {
        super.getRoomDetailsFromUser();
        Scanner input = new Scanner(System.in);
        numberOfLazyBoys = Util.getInputInt("Enter the number of coffe boys: ");
        System.out.print("Does this room have a coffee maker (y/n) ");
        hasCoffeeMaker = input.nextLine().equalsIgnoreCase("y");
        ;
    }
    
    
    
    @Override
    public String toString() {
        return super.toString() + "\nHas coffee maker: " + hasCoffeeMaker + "\nNumber of Lazy Boy Recliners " +numberOfLazyBoys;
    }
}

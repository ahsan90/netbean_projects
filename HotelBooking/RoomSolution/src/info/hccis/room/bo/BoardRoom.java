package info.hccis.room.bo;

import java.util.Scanner;

/**
 * BoardRoom is a type of room used for meetings
 *
 * @since 20170314
 * @author CIS1232
 */
public class BoardRoom extends Room {

    private boolean hasTeleconferencing;
    
    /**
     * Custom constructor which sets all attributes of the class
     *
     * @param hasTeleconferencing
     * @param roomNumber
     * @param numberOfSeats
     * @param reserved
     * @param hasSmartBoard
     * @author BJM
     * @since 20180313
     */
    
    public BoardRoom(boolean hasTeleconferencing, int roomNumber, int numberOfSeats, boolean reserved, boolean hasSmartBoard) {
        //super(roomNumber, numberOfSeats, reserved, hasSmartBoard);
        super(roomNumber);
        super.setNumberOfSeats(numberOfSeats);
        super.setReserved(reserved);
        super.setHasSmartBoard(hasSmartBoard);
        this.hasTeleconferencing = hasTeleconferencing;
    }
    
    /**
    * custom constructor that invokes room number
    * @param roomNumber 
    * @since 20190326
    * @author Ahsanul Hoque
    */
    public BoardRoom(int roomNumber){
        super(roomNumber);
    }

    public boolean isHasTeleconferencing() {
        return hasTeleconferencing;
    }

    public void setHasTeleconferencing(boolean hasTeleconferencing) {
        this.hasTeleconferencing = hasTeleconferencing;
    }

    public String toString() {
        return super.toString() + "\nHas teleconferencing: " + hasTeleconferencing;
    }

    /**
     * Get the details from the user about this class. This will invoke the
     * super method to get the base class attributes.
     *
     * @since 20170314
     * @author CIS1232
     */
    public void getRoomDetailsFromUser() {
        super.getRoomDetailsFromUser();
        Scanner input = new Scanner(System.in);
        System.out.print("Does this room have teleconferencing (y/n) ");
        hasTeleconferencing = input.nextLine().equalsIgnoreCase("y");
        ;
    }
}

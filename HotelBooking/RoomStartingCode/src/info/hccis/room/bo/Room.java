package info.hccis.room.bo;


import java.util.Scanner;

/**
 *
 * This is the base type of room. Has the basics for a class room but not much specialized
 * equipment.
 *
 * @since 20170314
 * @author CIS1232
 */
public class Room {

    Scanner input = new Scanner(System.in);
    private int roomNumber;
    private int numberOfSeats;
    private String reservedBy = "";
    private boolean reserved;
    private boolean hasSmartBoard;

    /**
     * Default constructor
     * @since 20180313
     * @author BJM
     */
    public Room() {
    }
    
    /**
     * Custom constructor that accepts all of the attributes of the class. 
     * @param roomNumber
     * @param numberOfSeats
     * @param reserved
     * @param hasSmartBoard 
     * @since 20180313
     * @author BJM
     */
    
    public Room(int roomNumber, int numberOfSeats, boolean reserved, boolean hasSmartBoard) {
        this.roomNumber = roomNumber;
        this.numberOfSeats = numberOfSeats;
        this.reserved = reserved;
        this.hasSmartBoard = hasSmartBoard;
    }

    
    
    
    
    /**
     * Get the attribute values from the user.
     *
     * @since 20170314
     * @author CIS1232
     */
    public void getRoomDetailsFromUser() {

        System.out.print("Enter number of seats: ");
        numberOfSeats = input.nextInt();
        input.nextLine();
        System.out.print("Does this classroom have a smart board? (y/n)");
        hasSmartBoard = input.nextLine().equalsIgnoreCase("y");

    }

    public boolean isHasSmartBoard() {
        return hasSmartBoard;
    }

    public void setHasSmartBoard(boolean hasSmartBoard) {
        this.hasSmartBoard = hasSmartBoard;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getReservedBy() {
        return reservedBy;
    }

    public void setReservedBy(String reservedBy) {
        this.reservedBy = reservedBy;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * Update the room to reserved and get the reserved by.
     *
     * @since 20170314
     * @author CIS1232
     */
    public void reserveThisRoom() {
        this.reserved = true;
        System.out.println("Enter the name of the person reserving this room: ");
        reservedBy = input.nextLine();
    }

    /**
     * Update the room to not reserved and clear the reserved by.
     *
     * @since 20170314
     * @author CIS1232
     */
    public void releaseThisRoom() {
        this.reserved = false;
        reservedBy = "";
        System.out.println("Room has been released\n");

    }

    public String toString() {
        String output = "\n"
                + "\nRoom Number: " + roomNumber
                + "\nNumber of Seats: " + numberOfSeats
                + "\nReserved By: " + reservedBy
                + "\nReserved: " + reserved
                + "\nSmart Board: " + hasSmartBoard;
        return output;
    }
}

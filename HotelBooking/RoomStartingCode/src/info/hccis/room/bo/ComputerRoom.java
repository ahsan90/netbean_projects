package info.hccis.room.bo;


import java.util.Scanner;

/**
 * Computer room is a room which is equipped with computer stations.
 *
 * @since 20170314
 * @author CIS1232
 */
public class ComputerRoom extends Room {

    int numberOfComputers;

    /**
     * Default constructor
     */
    public ComputerRoom() {
    }

    /**
     * Custom constructor that sets all of the class attributes.
     * 
     * @param numberOfComputers
     * @param roomNumber
     * @param numberOfSeats
     * @param reserved
     * @param hasSmartBoard 
     * @since 20180313
     * @author BJM
     */
    public ComputerRoom(int numberOfComputers, int roomNumber, int numberOfSeats, boolean reserved, boolean hasSmartBoard) {
        super(roomNumber, numberOfSeats, reserved, hasSmartBoard);
        this.numberOfComputers = numberOfComputers;
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
        System.out.print("Enter number of computers: ");
        numberOfComputers = input.nextInt();
        input.nextLine();
    }

    public int getNumberOfComputer() {
        return numberOfComputers;
    }

    public void setNumberOfComputer(int numberOfComputer) {
        this.numberOfComputers = numberOfComputer;
    }

    public String toString() {
        return super.toString() + "\nNumber of Computers" + numberOfComputers;
    }
}

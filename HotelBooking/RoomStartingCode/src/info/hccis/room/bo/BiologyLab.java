package info.hccis.room.bo;

import java.util.Scanner;

/**
 * Biology lab is equipped to allow working with biology.
 *
 * @since 20170314
 * @author CIS1232
 */
public class BiologyLab extends Room {

    private int numberOfMicroscopes;
    private boolean hasFumeHood;
    private boolean hasBunsonBurners;

    /**
     * default constructor
     *
     * @since 20180313
     * @author BJM
     */
    public BiologyLab() {
    }

    /**
     * Custom constructor that sets all attributes
     *
     * @param numberOfMicroscopes
     * @param hasFumeHood
     * @param hasBunsonBurners
     * @param roomNumber
     * @param numberOfSeats
     * @param reserved
     * @param hasSmartBoard
     * @since 20180313
     * @author BJM
     */
    public BiologyLab(int numberOfMicroscopes, boolean hasFumeHood, boolean hasBunsonBurners, int roomNumber, int numberOfSeats, boolean reserved, boolean hasSmartBoard) {
        super(roomNumber, numberOfSeats, reserved, hasSmartBoard);
        this.numberOfMicroscopes = numberOfMicroscopes;
        this.hasFumeHood = hasFumeHood;
        this.hasBunsonBurners = hasBunsonBurners;
    }

    public int getNumberOfMicroscopes() {
        return numberOfMicroscopes;
    }

    public void setNumberOfMicroscopes(int numberOfMicroscopes) {
        this.numberOfMicroscopes = numberOfMicroscopes;
    }

    public boolean isHasFumeHood() {
        return hasFumeHood;
    }

    public void setHasFumeHood(boolean hasFumeHood) {
        this.hasFumeHood = hasFumeHood;
    }

    public boolean isHasBunsonBurners() {
        return hasBunsonBurners;
    }

    public void setHasBunsonBurners(boolean hasBunsonBurners) {
        this.hasBunsonBurners = hasBunsonBurners;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumber of microscopes: " + numberOfMicroscopes + "\nHas fumehood: " + hasFumeHood + "\nHas Bunson burners: " + hasBunsonBurners;
    }

    /**
     * Get the details from the user about this class. This will invoke the
     * super method to get the base class attributes.
     *
     * @since 20170314
     * @author CIS1232
     */
    @Override
    public void getRoomDetailsFromUser() {
        super.getRoomDetailsFromUser();
        Scanner input = new Scanner(System.in);
        System.out.print("How many microscopes does this room have? ");
        numberOfMicroscopes = input.nextInt();
        input.nextLine();
        System.out.print("Does this lab have a fume hood (y/n)? ");
        hasFumeHood = input.nextLine().equalsIgnoreCase("y");
        System.out.print("Does this lab have bunson burners(y/n)? ");
        hasBunsonBurners = input.nextLine().equalsIgnoreCase("y");
    }
}

package roombooking;

public class Suite extends HotelRoom{

    //************************************************************
    //Note stub methods created.  Class to be modified as specified
    //in the requirements...
    //************************************************************
    private final static double SURCHARGE = 40; 
    public Suite(int roomNumber) {
        super(roomNumber);
        this.setRentalRate(this.getRentalRate()+SURCHARGE);
    }

    public double getRentalRate() {
        return super.getRentalRate();
    }

}

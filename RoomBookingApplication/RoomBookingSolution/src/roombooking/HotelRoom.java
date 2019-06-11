package roombooking;

public class HotelRoom {
    
    private final double FIXED_RENTAL_RATE_1 = 69.95;
    private final double FIXED_RENTAL_RATE_2 = 89.95;
    
    private int roomNumber;
    private double rentalRate;

    public HotelRoom(int roomNumber) {

        this.roomNumber = roomNumber;
        setRoomRateBasedOnRoomNumber(this.roomNumber);
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
    
    /**
    * This method will set rental rate based on the room number
    * @author Md Ahsanul Hoque
    * @since 20190311
    */
    public void setRoomRateBasedOnRoomNumber(int roomNumber){
        if (roomNumber<300) {
            this.setRentalRate(FIXED_RENTAL_RATE_1);
        }else{
            this.setRentalRate(FIXED_RENTAL_RATE_2);
        }
    }
}


import roombooking.Suite;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author BJMacLean
 */
public class SuiteTests {

    public SuiteTests() {
    }

    @Test
    public void testHotelRoomCreated() {

        Suite h1 = new Suite(1);
        double amount = h1.getRentalRate();
        Assert.assertEquals(amount, 109.95, 0.001);
    }

    @Test
    public void testHotelRoomCreated299() {

        Suite h1 = new Suite(299);
        double amount = h1.getRentalRate();
        Assert.assertEquals(amount, 69.95+40, 0.001);
    }

    @Test
    public void testHotelRoomCreated300() {
        Suite h1 = new Suite(300);
        double amount = h1.getRentalRate();
        Assert.assertEquals(amount, 89.95+40, 0.001);
    }
    @Test
    public void testHotelRoomCreated500() {
        Suite h1 = new Suite(500);
        double amount = h1.getRentalRate();
        Assert.assertEquals(amount, 89.95+40, 0.001);
    }

}

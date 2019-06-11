
import roombooking.HotelRoom;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author BJMacLean
 */
public class HotelRoomTests {

    public HotelRoomTests() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testHotelRoomCreated() {

        HotelRoom h1 = new HotelRoom(1);
        double amount = h1.getRentalRate();
        Assert.assertEquals(amount, 69.95, 0.001);
    }

    @Test
    public void testHotelRoomCreated299() {

        HotelRoom h1 = new HotelRoom(299);
        double amount = h1.getRentalRate();
        Assert.assertEquals(amount, 69.95, 0.001);
    }

    @Test
    public void testHotelRoomCreated300() {
        HotelRoom h1 = new HotelRoom(300);
        double amount = h1.getRentalRate();
        Assert.assertEquals(amount, 89.95, 0.001);
    }
    @Test
    public void testHotelRoomCreated500() {
        HotelRoom h1 = new HotelRoom(500);
        double amount = h1.getRentalRate();
        Assert.assertEquals(amount, 89.95, 0.001);
    }

}

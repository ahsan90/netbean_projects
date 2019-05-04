import CISTrip.Trip;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author bjmaclean
 */
public class Test1 {
    
    public Test1() {
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
     public void test100kmLitresused() {
         Trip trip1 = new Trip(100);
         Assert.assertEquals("100 km litres used error", trip1.getLitresUsed(), 100/14.0, 0.1);     
     }

    @Test
     public void test100kmCost() {
     
         Trip trip1 = new Trip(100);
         Assert.assertEquals("100 km cost error", trip1.getCost(), 100/14.0*1.29, 0.1);
     
     }
}

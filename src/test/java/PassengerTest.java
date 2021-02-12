import People.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Jane Austen", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Jane Austen", passenger.getName());
    }
    @Test
    public void hasNoOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }

}

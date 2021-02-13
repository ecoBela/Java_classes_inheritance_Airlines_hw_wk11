import People.Pilot;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;
    Rank rank;

    @Before
    public void before(){
        pilot = new Pilot("Blake Timpson", Rank.CAPTAIN, "KP2376Z");
    }

    @Test
    public void hasName(){
        assertEquals("Blake Timpson", pilot.getName());
    }
}

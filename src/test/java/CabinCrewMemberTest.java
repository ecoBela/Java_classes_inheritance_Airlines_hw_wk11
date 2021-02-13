import People.CabinCrewMember;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Maya Angelou", Rank.FLIGHT_ENGINEER);
    }

    @Test
    public void hasName(){
        assertEquals("Maya Angelou", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.FLIGHT_ENGINEER, cabinCrewMember.getRank());
    }


}

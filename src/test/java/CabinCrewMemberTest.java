import People.CabinCrewMember;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Maya Angelou", Rank.CAPTAIN);
    }

    @Test
    public void hasName(){
        assertEquals("Maya Angelou", cabinCrewMember.getName());
    }


}

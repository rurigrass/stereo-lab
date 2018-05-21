import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StationTest {

    Station station;

    @Before
    public void before(){
        station = new Station("Radio1", 97.7);
    }

    @Test
    public void getStationName(){
        assertEquals("Radio1", station.getStationName());
    }
}

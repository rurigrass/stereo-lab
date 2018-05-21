import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;
    Station station1;
    Station station2;

    @Before
    public void before(){
        radio = new Radio("Sony", "Super Radio");
        station1 = new Station("Radio1", 97.7);
        station2 = new Station("Radio2", 98.8);
    }

   @Test
    public void canCountStations(){
        assertEquals(0, radio.countStations());
   }

   @Test
    public void canAddStation(){
        radio.addStation(station1);
        assertEquals(1, radio.countStations());
   }

   @Test
    public void canRemoveStation(){
        radio.addStation(station1);
        radio.removeStation(station1);
        assertEquals(0, radio.countStations());
   }

   @Test
    public void getMake(){
        assertEquals("Sony", radio.getMake());
   }


}

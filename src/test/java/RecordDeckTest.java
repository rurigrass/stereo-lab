import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck("Sony","Record Player", 10);
    }

    @Test
    public void getPlaySpeed(){
        assertEquals(10, recordDeck.getPlaySpeed());
    }

}

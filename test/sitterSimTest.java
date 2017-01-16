import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Adam Howard on 1/14/2017.
 */
public class sitterSimTest {

    @Test
    public void testSitterSim() {

        sitterSim aSitter = new sitterSim();

        //invalid time window

       assertEquals("Sorry, sitting hours are limited to between 5:00 PM to 4:00 AM.", aSitter.scheduleAppt(4, "pm",  10, 2, "am"));

       //valid time window

        assertEquals("Sitting appointment complete, your pay is: $64.00.", aSitter.scheduleAppt(6, "pm",  10, 12, "am"));







    }


}
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Adam Howard on 1/14/2017.
 */
public class sitterSimTest {

    @Test
    public void testSitterSim() {

        sitterSim aSitter = new sitterSim();

        //pm invalid time window

       assertEquals("Sorry, sitting hours are limited to between 5:00 PM to 4:00 AM.", aSitter.scheduleAppt(4, "pm",  10, 2, "am"));

        //am invalid time window

        assertEquals("Sorry, sitting hours are limited to between 5:00 PM to 4:00 AM.", aSitter.scheduleAppt(4, "am",  10, 2, "am"));

        //invalid end time

        assertEquals("Sorry, sitting hours are limited to between 5:00 PM to 4:00 AM.", aSitter.scheduleAppt(5, "pm",  10, 5, "am"));

       //valid time window

        assertEquals("Sitting appointment complete, your pay is: $64.00.", aSitter.scheduleAppt(6, "pm",  10, 12, "am"));









    }


}
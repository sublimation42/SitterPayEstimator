import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Adam Howard on 1/14/2017.
 */
public class sitterSimTest {

    @Test
    public void testSitterSim() {

        sitterSim aSitter = new sitterSim();

       assertEquals("Sorry, sitting hours are limited to between 5:00 PM to 4:00 AM.", aSitter.scheduleAppt(4, 10, 2));



    }


}
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Adam Howard on 1/13/2017.
 */

public class payEstimatorTest {

    @Test
    public void testEstimatePay() {

        payEstimator totalFee = new payEstimator();

        /* Testing for accurate rates based on restrictions */

        //testing one hour at 12.00 rate between hours of 5 pm and 8 pm.
        assertEquals(12.00, totalFee.estimatePay(5,6), .001);

        //testing one hour at 8.00 rate between 8 pm and 12 am.
        assertEquals(8.00, totalFee.estimatePay(8,9), .001);

        //testing one hour at 16.00 rate between 12 am and 4 am.
        assertEquals(16.00, totalFee.estimatePay(12,1), .001);

        /* Testing accurate rate and hours worked */

        








    }

}

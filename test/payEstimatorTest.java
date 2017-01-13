import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Adam Howard on 1/13/2017.
 */

public class payEstimatorTest {

    @Test
    public void testEstimatePay() {

        payEstimator totalFee = new payEstimator();

        assertEquals(12.00, totalFee.estimatePay(5, "pm", 6, "pm"), .001);






    }

}

/**
 * Created by Adam Howard on 1/13/2017.
 */
public class payEstimator {
    public static Double estimatePay(Integer startTime, Integer endTime)
    {
        Double rate = 0.00;


        if (startTime >= 5 && startTime <8)
        {
            rate = 12.00;
        }

        return rate;
    }
}

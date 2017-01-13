/**
 * Created by Adam Howard on 1/13/2017.
 */
public class payEstimator {
    public static Double estimatePay(Integer startTime, Integer endTime)
    {
        Double rate = 0.00;

        /* determine rate */
        if (startTime >= 5 && startTime <8)
        {
            rate = 12.00;
        }
        else if (startTime >= 8 && startTime <12)
        {
            rate = 8.00;
        }
        else if (startTime >= 12 || startTime < 4)
        {
            rate = 16.00;
        }

        return rate;
    }

    /* calualte hours */
}

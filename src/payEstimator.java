/**
 * Pay estimator class
 * Calculates babysitter nightly fee based on varied rates
 * returns total fee for the appointment
 *
 * Created by Adam Howard on 1/13/2017.
 */
public class payEstimator {



    public static final Double normalRate = 12.00;
    public static final Double bedtimeRate = 8.00;
    public static final Double latenightRate = 16.00;

    public static Double estimatePay(Integer startTime, Integer bedTime, Integer endTime)
    {
        Double totalBill = 0.00;
        Integer normalHours = 0;
        Integer bedtimeHours = 0;
        Integer latenightHours = 0;

        if (endTime <= 4)
        {
            endTime = endTime + 12;
        }

        /* determine rate */
        if (endTime < bedTime)
        {
            normalHours = endTime - startTime;
            totalBill = normalHours * normalRate;

        }
        else
        {
            if (startTime < 12)
            {
                normalHours = bedTime - startTime;
            }
            if (endTime >= 12)
            {
                latenightHours = endTime - 12;
                if (startTime < 12)
                {
                    bedtimeHours = 12 - bedTime;
                }

            }
            else
            {
                bedtimeHours =  endTime - bedTime;
            }


            totalBill = normalHours * normalRate + bedtimeHours * bedtimeRate + latenightHours * latenightRate;
        }




        return totalBill;
    }



}

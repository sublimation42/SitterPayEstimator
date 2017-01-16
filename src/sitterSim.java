/**
 * Created by Adam Howard on 1/14/2017.
 */
public class sitterSim {

    public String scheduleAppt(Integer startTime, String stPeriod, Integer bedTime, Integer endTime, String etPeriod) {

        payEstimator totalFee = new payEstimator();

        if ((startTime < 5 && stPeriod.equalsIgnoreCase("pm")) ||
                ( endTime > 4 && etPeriod.equalsIgnoreCase("am")))
        {
            return "Sorry, sitting hours are limited to between 5:00 PM to 4:00 AM.";
        }
        return "Sitting appointment complete, your pay is: $" +
                totalFee.estimatePay(startTime, bedTime, endTime);



    }


}

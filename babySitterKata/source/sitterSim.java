/**
 * sitter sim class
 * simulates a babysitter by taking in a requested appointment time
 * obeying restrictions of no appt time between 4:00 AM and 5:00 PM
 * returns error or success based on times entered and the total fee for the appointment
 *
 * Created by Adam Howard on 1/14/2017.
 */
public class sitterSim {

    public String scheduleAppt(Integer startTime, String stPeriod, Integer bedTime, Integer endTime, String etPeriod) {

        payEstimator totalFee = new payEstimator();


        if(startTime < 5 && stPeriod.equalsIgnoreCase("pm"))
        {
            return "Sorry, sitting hours are limited to between 5:00 PM to 4:00 AM.";
        }

        if((endTime > 4 && endTime <12) && etPeriod.equalsIgnoreCase("am"))
        {
            return "Sorry, sitting hours are limited to between 5:00 PM to 4:00 AM.";
        }

        if((startTime >= 4 && startTime <12) && stPeriod.equalsIgnoreCase("am"))
        {
            return "Sorry, sitting hours are limited to between 5:00 PM to 4:00 AM.";
        }


        return "Sitting appointment complete, your pay is: $" +
               String.format("%.2f", totalFee.estimatePay(startTime, bedTime, endTime)) + ".";




    }


}

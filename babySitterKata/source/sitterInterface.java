import java.util.Scanner;

/**
 * sitter interface class
 * provides an interface and main to run the sitter sim program
 * Created by Adam Howard on 1/16/2017.
 */
public class sitterInterface {

    public static void main(String[] args) {
        String welcome = "Pleae enter the start time, bed time, and end time in the form:\n" +
                "start:am/pm:bedtime:end:am/pm example 5:pm:8:11:pm.\n";


        Scanner in = new Scanner(System.in);

        String[] line = null;
        boolean done = false;

        while(!done)
        {
            System.out.println(welcome);

            sitterSim aSitter = new sitterSim();

            line = in.nextLine().split(":");


            System.out.println("Appointment results:  ");
            System.out.println(aSitter.scheduleAppt(Integer.parseInt(line[0]), line[1], Integer.parseInt(line[2]),
                    Integer.parseInt(line[3]), line[4]) + "\n");

            System.out.println("Would you like to schedule another appointment?\n"
                     + "Type no to exit.\n");


            if (in.nextLine().equalsIgnoreCase("no"))
            {
                System.out.println("Thank you for choosing Sitter Sim 2000.");
                done = true;
            }




        }


    }
}

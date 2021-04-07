package russi;
import java.util.*;
public class FutureTuition {
    public static void main(String[] args) {
        //Tuition Fee
        double tuitionFee = 10_000;
        //Fixed Percentage that is increased each year
        final double PERCENTAGE_INCREASE = tuitionFee * 0.05;
        //Years Counter
        int year = 1;
        //Looping
        while (year <= 10) {
            //Iterated Display
            System.out.printf("\n%d) year tuition fee will be %.0f",year,tuitionFee);
            //Increment in tuition  fee
            tuitionFee += PERCENTAGE_INCREASE ;
            //Loop Controller
            year += 1;
        }
    }

}

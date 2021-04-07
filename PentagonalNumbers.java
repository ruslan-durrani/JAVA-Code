package russi;
import java.util.*;
public class PentagonalNumbers {
    public static void main(String[] args) {
        //Per line Constant
        final int PER_LINE = 10;
        //Loop
        int i = 1;
        while(i <= 100){
            //Caller function
            int pentagonalNumber = getPentagonalNumber(i);
            //Displaying returned Value
            System.out.printf("%10d",pentagonalNumber);

            //Per line Changer
            if (i % 10 == 0)
                System.out.println("\n");

            i++; //Counter Controller
        }
    }
    //Method for Pentagon Value Return
    public static int getPentagonalNumber(int n){
        //Results variable for return value to main method
        int results = 0;
        //Formulae
        results = n * ( 3 * n - 1 ) / 2;
        //return
        return results;
    }
}

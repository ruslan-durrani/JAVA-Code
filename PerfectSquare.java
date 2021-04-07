package russi;
import java.util.*;
public class PerfectSquare {
    public static void main(String[] args) {
        //Incrementer
        int i = 1;
        //While loop to start from 0 - 10_000
        while ( i <= 10_000){
            //Sum to check sum of number = number
            int sum = 0;
            // Loop
            for (int j = 1; j < i; j++)
                if (i % j == 0)
                    sum += j;
            //Conditional Expression to verify Perfect Square
            if (sum == i){
                System.out.println("Perfect Square: "+i);
            }
            sum = 0;
            i++;
        }
    }
}

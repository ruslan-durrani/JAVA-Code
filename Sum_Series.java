package russi;
import java.util.*;
public class Sum_Series {
    public static void main(String[] args) {
        System.out.println("*** Sum Series ***");
        int startSeries = 1;//Beginning
        double endSeries = 20;//End
        //Heading==========================
        System.out.println("i\t\t\tm(i)\n");
        for (int i = startSeries ; i <= endSeries ; i++) {
            System.out.print(i+"\t\t\t");
            System.out.println((int)(sumSeries(i)*100)/100.0);
        }
    }
    //Method to Sum of Series
    public static double sumSeries(double n ){
        // Double Type sum variable
        double sum = 0;
        //Loop
        for (double i = 1; i <= n ; i++) {
            sum += i / ( i+1 );
        }
        return sum;
    }
}

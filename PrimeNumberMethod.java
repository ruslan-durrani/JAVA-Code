package russi;
import java.util.*;
public class PrimeNumberMethod {
    public static void main(String[] args) {
        final int FIRST_100_PrimeNUmbers = 100;
        int numberPerline = 1;
        int number = 2;
        int counter = 1;

        while ( counter <= FIRST_100_PrimeNUmbers){
            if (isPrime(number)){
                System.out.printf("\t%d",number);
                if ( numberPerline % 10 == 0){
                    System.out.println();
                    numberPerline = 0;
                }
                numberPerline ++;
                counter ++;
            }
            number ++;
        }
    }
    public static boolean isPrime( int number ) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;

        }
        return true;
    }
}

package russi;
import java.util.*;
public class SumOfDigits_In_A_Number {
    public static void main(String[] args) {
        //Scanner Object
        Scanner input = new Scanner (System.in);
        //Fetching User Input
        System.out.print("Enter a number: ");
        long number = input.nextInt();
        //Method Calling
        System.out.println("The sum of Digits is: "+sumDigits(number));
    }
    // SumDigits Method
    public static int sumDigits(long n){
        //Results
        int results = 0;
        //String for latter length finding
        String string = ""+n;
        //Summing the digits in for loop
        for (int i = 0; i < string.length(); i++) {
            //Formula for digits separation
            results += n % 10;

            n /= 10;
        }
        //Resturn
        return results;
        
    }
}

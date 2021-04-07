package russi;
import java.util.*;
public class GCD_Method {
    public static void main(String[] args) {
        //Scanner Object
        Scanner input = new Scanner (System.in);
        //First number
        System.out.print("Enter first integer: ");
        int numberOne = input.nextInt();
        //Second number
        System.out.print("Enter second integer: ");
        int numberTwo = input.nextInt();
        //Display
        System.out.println("The Greatest Common Divisor is: "+ gcd(numberOne,numberTwo));//Method gcd called
    }
    //Method for GCD
    public static int gcd(int a , int b){
        int gcd = 1;
        int k = 2;
        while ( k <= a && k <= b){
            if ( a % k == 0  && b % k == 0)
                gcd = k;
            k++;
        }
        return gcd;//returnin g gcd calculted
    }
}

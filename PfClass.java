package russi;
import java.util.*;
public class PfClass {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();//number First
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();//number second
        int gcd = 1;//Atleast GCD
        int k = 2;//Possible GCD
        // Calculator
        while (k <= num1 && k <= num2){
            //Condition
            if ( num1 % k == 0  && num2 % k ==0){
                gcd = k ;
            }
            k ++;
        }
        System.out.println("The Greatest Common Divisor is: "+gcd);
    }
}

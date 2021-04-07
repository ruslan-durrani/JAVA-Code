package russi;
import java.util.*;
public class Optimal_GCD_Q_5_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Enter number One
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        //Enter number two
        System.out.print("Enter Second number: ");
        int secondNumber = input.nextInt();
        //GCD Optimized way
        int gcdDisplayed ;
        if ( firstNumber < secondNumber)
            gcdDisplayed = firstNumber;
        else
            gcdDisplayed = secondNumber;
        // Loop to encounter GCD
//        while ( (firstNumber % gcdDisplayed  != 0) || (secondNumber % gcdDisplayed != 0)){
//            gcdDisplayed--;
//        }
        while (gcdDisplayed >= 0){
            if (firstNumber % gcdDisplayed == 0 && secondNumber % gcdDisplayed == 0)
                break;
            else
                gcdDisplayed --;

        }
        System.out.println(gcdDisplayed);
    }
}


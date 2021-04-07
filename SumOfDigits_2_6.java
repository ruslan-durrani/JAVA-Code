package russi;

import java.util.Scanner;

public class SumOfDigits_2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter number between 0-1000: ");
        int number = input.nextInt();
        int num = number ;
        int sum = 0 ;
        sum += number % 10;
        number /= 10 ;
        sum += number % 10 ;
        number /= 10;
        sum += number ;
        System.out.println("The sum of Digits in number "+num+" is "+sum);
    }
}

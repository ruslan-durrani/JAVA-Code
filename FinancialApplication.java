package russi;

import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Input Balance InterestRate
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();
        //Interest Formulae
        double interest = balance * (interestRate / 1200);
        //Display
        System.out.printf("The interest is %.4f",interest);
    }
}

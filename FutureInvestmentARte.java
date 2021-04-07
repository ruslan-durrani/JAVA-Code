package russi;

import java.util.Scanner;

class FutureInvestmentRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Input Investment Amount
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        //Annual Interest Rate
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();
        //Number of Years
        System.out.print("Enter number of years: ");
        float year = input.nextFloat();
        //Monthly Interest
        double monthlyInterestRate = annualInterestRate / 1200 ;
        //Future Investment rate
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate,year*12);
        //Display
        System.out.printf("Accumulated value is $%.2f",futureInvestmentValue);
    }
}

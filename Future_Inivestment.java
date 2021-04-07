package russi;
import java.util.*;
public class Future_Inivestment {
    public static void main(String[] args) {

        //Scanner Object
        Scanner input = new Scanner(System.in);

        //User Input investment amount
        System.out.print("Enter future investment amount: ");
        double amount = input.nextInt();

        //User input annual interest
        System.out.print("Enter annual interest rate: ");
        double interestRate = input.nextInt();

        //Monthly interest rate
        double monthlyIntrestRate = interestRate / 1200.0;


        System.out.printf("%s\t\t%s","Year","Future Value\n");

        for (int i = 1; i <= 30; i++) {
            //Method caller
            double futureInvestment = futureInvestmentValue(amount,monthlyIntrestRate,i);
            System.out.println(i+"\t\t\t"+(int)(futureInvestment*100)/100.0);
        }
    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){

        // Formulae for Future investment rate
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

    }

}

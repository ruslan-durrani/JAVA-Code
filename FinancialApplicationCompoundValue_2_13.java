package russi;

import java.util.Scanner;

public class FinancialApplicationCompoundValue_2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter monthly saving amount: $");
        int amount = input.nextInt();
        double interestRate = (1 + 0.00417) ;
        double accountValue = 0 ;
        accountValue = (amount + accountValue) * interestRate ;
        accountValue = (amount + accountValue) * interestRate ;
        accountValue = (amount + accountValue) * interestRate ;
        accountValue = (amount + accountValue) * interestRate ;
        accountValue = (amount + accountValue) * interestRate ;
        accountValue = (amount + accountValue) * interestRate ;
        System.out.printf("After the sixth month, the account value is $%.2f",accountValue);

    }
}

package russi;

import java.util.Scanner;

public class IntegerReversed {
    public static void main(String[] args) {
        //Scanner Object
        Scanner input = new Scanner (System.in);
        //User Input
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        //Caller Function for reversing
        int reverseD = reverse(number);
        System.out.println("The reversed number is : "+reverseD);

    }
    public static int reverse(int number){
        String stringNum = "" + number;
        String reverseNumber = "";
        for (int i = 0; i < stringNum.length(); i++)
            reverseNumber = stringNum.charAt(i) + reverseNumber;

        int results = 0;
        results = Integer.parseInt(reverseNumber);
        return results;
    }
}

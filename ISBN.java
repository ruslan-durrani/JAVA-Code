package russi;
import java.util.*;
public class ISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nine integers: ");
        int userInput = input.nextInt();
        int code = userInput;
        int Digitno1 = code / 100000000;
        int remainingDigits = code % 100000000;
        int Digitno2 = remainingDigits / 10000000;
        remainingDigits %= 10000000;
        int Digitno3 = remainingDigits / 1000000;
        remainingDigits %= 1000000;
        int Digitno4 = remainingDigits / 100000;
        remainingDigits %= 100000;
        int Digitno5 = remainingDigits / 10000;
        remainingDigits %= 10000;
        int Digitno6 = remainingDigits / 1000;
        remainingDigits %= 1000;
        int Digitno7 = remainingDigits / 100;
        remainingDigits %= 100;
        int Digitno8 = remainingDigits / 10;
        remainingDigits %= 10;
        int Digitno9 = remainingDigits;
        int Digitno10 = (Digitno1  + Digitno2 * 2 + Digitno3 * 3 + Digitno4 * 4 + Digitno5 * 5
                + Digitno6 * 6 + Digitno7 * 7 + Digitno8 * 8 + Digitno9 * 9) % 11;
        System.out.println(Digitno10);
        if (Digitno10 == 10)
            System.out.println("The isbn number is " + userInput + "" + "X");
        else
            System.out.println("The isbn number is " + userInput + "" + Digitno10);

//        Scanner input = new Scanner(System.in);
//
//        // Prompt the user to enter the first 9 digits of a 10-digit ISBN
//        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
//        int isbn = input.nextInt();
//
//        // Extract the digits of the ISBN
//        int d1 = isbn / 100000000;
//        int remainingDigits = isbn % 100000000;
//        int d2 = remainingDigits / 10000000;
//        remainingDigits %= 10000000;
//        int d3 = remainingDigits / 1000000;
//        remainingDigits %= 1000000;
//        int d4 = remainingDigits / 100000;
//        remainingDigits %= 100000;
//        int d5 = remainingDigits / 10000;
//        remainingDigits %= 10000;
//        int d6 = remainingDigits / 1000;
//        remainingDigits %= 1000;
//        int d7 = remainingDigits / 100;
//        remainingDigits %= 100;
//        int d8 = remainingDigits / 10;
//        remainingDigits %= 10;
//        int d9 = remainingDigits;
//
//        // Compute d10
//        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5
//                + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
//
//        // Display the 10-digit ISBN
//        System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5
//                + d6 + d7 + d8 + d9);
//        if (d10 == 10)
//            System.out.println("X");
//        else
//            System.out.println(d10);
//

    }
}

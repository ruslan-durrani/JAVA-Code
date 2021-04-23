package Russi7kd;

import java.util.*;

public class Password_Validation_Nested_if {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("**** Password Validator ****");

        System.out.print("Enter password for validation:");

        String password = input.next();

        // Method Caller
        if (isValid(password))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
    // isValid method For password Validation
    public static boolean isValid(String passCode){

        boolean letters_Digits = true;

        int digit_counter = 0;

        for (int i = 0; i < passCode.length() ; i++) {

            if (!(Character.isLetter(passCode.charAt(i)) || Character.isDigit(passCode.charAt(i)))){

                letters_Digits = false;
                break;
            }
            if (Character.isDigit(passCode.charAt(i)))
                digit_counter ++;
        }
        // Length Finding
        if (passCode.length() >=8)
            // Only Containing Letters And Digits
            if (letters_Digits)
                // Atleast Digits
                if (digit_counter >=2)
                    return true;

        return false;
    }
}

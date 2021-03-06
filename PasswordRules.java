package russi;
import java.util.*;
public class PasswordRules {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("*** Website Password Validator ***");
        boolean x = true;
        int isValid = 1;
        String passcode = "";
        do {
            System.out.print("Enter password for validation: ");
            passcode= input.nextLine();
            if (passcode.contains(" "))
                System.out.println("Empty Spaces not allowed");
            else
                isValid = passwordValidator(passcode);
        }while (x == true && isValid == 1);


    }
    public static int passwordValidator(String passCode){
        boolean length = false;
        boolean isDigit = false;
        int digitCount = 0;
        boolean isLetter = false;
        boolean isSpecialChar = false;
        if ((passCode.length() >=8)){

            //Length determining
            length = true;
            for (int i = 0; i < passCode.length(); i++) {

                //Digits finding
                if ( Character.isDigit(passCode.charAt(i) )){
                    digitCount++;
                    isDigit = true;
                }

                //Letter Finding
                if ( Character.isLetter(passCode.charAt(i)))
                    isLetter = true;

                //Special Character
                if (!(Character.isDigit(passCode.charAt(i) ) || Character.isLetter(passCode.charAt(i))))
                    isSpecialChar = true;
            }
        }

        //Validating
        if (length && isDigit && isLetter && digitCount>=2 && isSpecialChar == false) {
            System.out.println("| Valid Password |");
            return 0;//returning 0 to be correct
        }
        else {
            System.out.println("| Invalid Password |");
            return 1;//returning 0 to be incorrect
        }

    }
}

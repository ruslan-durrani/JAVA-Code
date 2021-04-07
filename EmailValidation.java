package russi;
import java.util.*;
public class EmailValidation {
    public static void main(String[] args) {
        // Email Validator
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Email Address for Validation: ");
        String address = input.next();
        // Validator for @ symbol and numbers
        boolean isDigitSymbol = false;
        //
        for (int i = 0; i < address.length(); i++) {
            if (Character.isDigit(address.charAt(i)) && address.indexOf('@') >= 4){
                isDigitSymbol = true;
                break;
            }
        }
        // Steps to Verify
        //Com Validation
        if ( address.endsWith(".com")){
            // Digit and @ symbol Validation
            if ( isDigitSymbol )
                System.out.println("Valid Email Address for Commerce");
            //Symbole and digits if not available
            else
                System.out.println("Numbers or @ (symbole) should be included");
        }
        else// If not valid
            System.out.println("This is invalid email address");
    }
}

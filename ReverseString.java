package russi;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Scanner Object
        System.out.print("Enter String: ");
        String userString = input.next();
        //Stortoring data
        String reversedString = "";
        for (int i = userString.length()-1; i >=0 ; i--) {
            //Reversing a string
            reversedString += userString.charAt(i);
        }
        //Reversed String
        System.out.println(reversedString);
    }
}

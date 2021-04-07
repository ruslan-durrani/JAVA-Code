package russi;
import java.util.*;
public class Palendrome_Integer {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number to check Palindrome: ");
        int number = input.nextInt();
        boolean isPal = isPalindrome(number);
        if(isPal)
            System.out.println("The number: "+number+" is Palindrome");
        else
            System.out.println("The number: "+number+" is not Palindrome");
    }
    public static boolean isPalindrome(int number){
        if (number == reverse(number)) {
            return true;
        }
        return  false;
    }
    public static int reverse(int number){
        String stringNum = "" + number;
        String reverseNumber = "";
        for (int i = 0; i < stringNum.length(); i++)
            reverseNumber = stringNum.charAt(i) + reverseNumber;
        return (Integer.parseInt(reverseNumber));
    }
}

package Russi7kd;
import java.util.*;
public class LuhnCreditCardValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("■ 4 for Visa cards\n" +
                         "■ 5 for Master cards\n" +
                         "■ 37 for American Express cards\n" +
                         "■ 6 for Discover cards\nEnter:");
        long number = input.nextLong();
        if (isValid(number))
            System.out.println(number+" is a Valid Card Number");
        else
            System.out.println("Invalid");
    }
    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
        int length = getSize(number);
        if(!(length >=13 && length <= 16))
            return false;
        else if (!(prefixMatched(number)))
            return false;
        int sumOfDouble = sumOfDoubleEvenPlace(number);
        int sumOfOdd = sumOfOddPlace(number);
        if ((sumOfOdd + sumOfDouble) % 10 == 0)
            return true;
        return false;
    }
    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number){
        String numberLength = ""+number;
        int sum = 0;
        int check;
        for (int i = numberLength.length() -2; i >= 0 ; i = i-2) {
            String character = numberLength.substring(i,i+1);
            int subNumber = Integer.parseInt(character);
            check =  subNumber * 2;
            int res = 0;
            if (check >= 10 ){
                res = getDigit(check);
                sum += res;
            }
            else
                sum += check;
        }
        return sum;
    }
    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number){
        int j = 0 ;
        j = number % 10;
        j += number / 10;
        return j;
    }
    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number){
        String numberLength = ""+number;

        int sum = 0;
        int check;
        for (int i = numberLength.length() -1; i >= 0 ; i = i-2) {
            String character = numberLength.substring(i, i + 1);
            int subNumber = Integer.parseInt(character);
            sum += subNumber;
        }
        return sum;
    }
    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(long number){
        String numberString = ""+number;
//        String preFixSubstring = numberString.substring(0,2);
        if ((numberString.startsWith("4")) || (numberString.startsWith("5"))
                || (numberString.startsWith("6")) || (numberString.startsWith("37")))
            return true;
        return false;
    }
    /** Return the number of digits in d */
    public static int getSize(long d){
        String numberString = ""+d;
        return numberString.length();
    }
    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
//    public static long getPrefix(long number, int k){
//        return 0;
//    }
}

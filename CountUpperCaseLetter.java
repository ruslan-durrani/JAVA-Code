package russi;
import java.util.*;
public class CountUpperCaseLetter {
    public static void main(String[] args) {
        //Scanner object
        Scanner input = new Scanner(System.in);
        //Input from user
        System.out.print("Enter a String:; ");
        String stringSequence = input.nextLine();
        //Counter index
        int i = 0;
        //Counter of Capital letter
        int capitalLetterCounter= 0;
        //Loop for checking capital letters
        while (i < stringSequence.length()){
            if ( Character.isUpperCase(stringSequence.charAt(i))){
                capitalLetterCounter ++;
            }
            //Incrementer
            i++;
        }
        System.out.println("The number of uppercase letters is :"+capitalLetterCounter);
    }
}

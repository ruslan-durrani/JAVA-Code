package Russi7kd;
import java.util.*;
public class CountLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a string: ");
        String userString = input.nextLine();

        //Display
        System.out.printf("| %s |\nNumber of Letters: %d",userString,countLetters(userString));
    }
    public static int countLetters(String s){
        int length = 0;

        //Counter
        for (int i = 0; i < s.length(); i++)
            if (!(s.charAt(i) == ' '))
                length ++;

            //Returning length
        return length;
    }
}

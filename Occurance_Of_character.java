package Russi7kd;
import java.util.*;
public class Occurance_Of_character {
    public static void main(String[] args) {
        //Scanner Object-----------------------
        Scanner input = new Scanner (System.in);
        //String input------------------------
        System.out.print("Enter string: ");
        String userString = input.nextLine();
        //Character input---------------------
        System.out.print("Enter character: ");
        char userCharacter = input.next().charAt(0);
        //Display----------------------------
        System.out.println("\nCharacter\t\tCount");
        //Caller expression----------------------
        int count = count(userString,userCharacter);
        System.out.println(userCharacter+"\t\t\t\t"+count);
    }
    //Method for character calculation--------
    public static int count(String str, char a){
        int count = 0;//counter for character
        for (int i = 0; i < str.length(); i++)
            if(a == str.charAt(i))
                count ++;

        return count;
    }
}

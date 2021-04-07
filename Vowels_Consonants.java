package russi;
import java.util.*;
public class Vowels_Consonants {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        // Input String
        System.out.print("Enter a string: ");
        String userString = input.nextLine();
        // Vowel Counter
        int vowelCounter = 0;
        // Consonants Counter
        int consonantCounter = 0;
        //String Length
        int stringLength = userString.length();
        // Vowels And Consonants finding
        for (int i = 0; i < stringLength; i++) {
            switch ( userString.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': vowelCounter += 1;break;
                default:
                    if (Character.isAlphabetic(userString.charAt(i))){
                        consonantCounter += 1;
                    }
            }
        }
        System.out.println("Vowels in String are: "+vowelCounter);
        System.out.println("Consonants in String are: "+consonantCounter);
    }
}

package russi;
import java.util.*;
public class VowelConsonent {
    public static void main(String[] args) {
        System.out.println("***Vowel/Consonent***");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String characterString = input.nextLine().toUpperCase(Locale.ROOT);
        char character = characterString.charAt(0);
        switch ( character){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': System.out.println(character+" is Vowel");break;
            default: System.out.println(character+" is consonant");break;
        }

    }
}

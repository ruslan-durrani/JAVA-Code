package russi;
import java.util.*;
public class CharacterFromAscii {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter an Ascii code: ");
        int asciiCode = input.nextInt();
        System.out.printf("The character for ASCII code %d is %s",asciiCode,(char)asciiCode);
        //000000000000000
        System.out.print("\nEnter a character: ");
        String character = input.next();
        System.out.printf("The ASCII code for %s is %d",character,(int)character.charAt(0));

    }
}

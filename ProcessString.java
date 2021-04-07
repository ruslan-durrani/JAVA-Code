package russi;
import java.util.*;
public class ProcessString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String stringSequence = input.nextLine();
        for (int i = 0; i < stringSequence.length(); i += 2) {
            System.out.print(stringSequence.charAt(i));
        }
    }
}

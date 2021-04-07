package russi;
import java.util.*;
public class LongestSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String stringSequenceOne = input.nextLine();
        System.out.print("Enter a string: ");
        String stringSequenceTwo = input.nextLine();
        String lengthString = (stringSequenceOne.length() > stringSequenceTwo.length())? stringSequenceTwo:stringSequenceOne;
        String sequence = "";
        for (int i = 0; i < lengthString.length(); i++) {
            if (stringSequenceOne.charAt(i)==stringSequenceTwo.charAt(i)){
                sequence += stringSequenceOne.charAt(i);
            }
            else{
                sequence = "";
            }
        }
        if (sequence != "")
            System.out.println("The common prefix is :"+sequence);
        else
            System.out.println(stringSequenceOne+" and "+stringSequenceTwo+" have no common prefix");
    }
}

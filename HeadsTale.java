package russi;
import java.util.*;
public class HeadsTale {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int headesTales = (int) (Math.random() * 2);
        System.out.print("0: Heads\n1: Tales\nEnter your choice: ");
        int userInput = input.nextInt();
        String pcString = ( headesTales == 1 )? "Tales" : "Heads";
        String userString = ( userInput == 1 ) ? "Tales": "Heads";
        if (headesTales == userInput)
            System.out.println("Correct Guess");
        else
            System.out.println("Wrong Guess");
        System.out.println("Computer: "+pcString+"\nUser: "+userString);
    }
}

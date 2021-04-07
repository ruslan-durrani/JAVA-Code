package russi;
import java.util.*;
public class GuessNUmberHighLoW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberRandom  = (int)( 10 + (Math.random() * (20 - 10)) + 1);
        int UserGuess;
        do{
            System.out.print("Enter your Guess");
            UserGuess= input.nextInt();
           if (UserGuess == numberRandom)
               System.out.println("Correct Guess: "+numberRandom);
           else if ( UserGuess > numberRandom)
               System.out.println("You are too High");
           else if (UserGuess < numberRandom)
               System.out.println("You are Low: ");
        }while (numberRandom != UserGuess);
    }
}

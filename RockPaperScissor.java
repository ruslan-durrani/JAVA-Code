package russi;
import java.util.*;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("\nRock : 1\nPaper : 2\nScissor : 3\nEnter your choice: ");
        byte userInput = input.nextByte();
        Random randomObject = new Random();
        int randomNUmber = randomObject.nextInt(3) + 1;
        if (randomNUmber == userInput) {
            System.out.println("Its a Draw");
            System.exit(0);
        }
        switch ( userInput ){
            case 1 :
                if (randomNUmber == 2)
                    System.out.println("You Rock Computer Paper: You Lose");
                else if (randomNUmber == 3)
                    System.out.println("You Rock Computer Scissor: You Won");
                break;
            case 2 :
                if (randomNUmber == 1)
                    System.out.println("You Paper Computer Rock: You Won");
                else if (randomNUmber == 3)
                    System.out.println("You Paper Computer Scissor: You Lose");
                break;
            case 3 :
                if (randomNUmber == 2)
                    System.out.println("You Scissor Computer Paper: You Won");
                else if (randomNUmber == 1)
                    System.out.println("You Scissor Computer Rock: You Lose");
                break;
            }

    }
}

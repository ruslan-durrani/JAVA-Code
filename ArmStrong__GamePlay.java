package Russi7kd;
import java.util.*;
public class ArmStrong__GamePlay {
    public static void main(String[] args) {
        //Title
        System.out.println("\n**** Armstrong Game PLay ****");

        //Scanner object
        Scanner input = new Scanner (System.in);
        System.out.println("\nLet's get started.....");

        int playerOneScore = 0;

        int playerTwoScore = 0;

        String play = "yes";
        while( play.startsWith("y") ){

            //Input Player One
            System.out.print("Turn-Player 1:");
            int playerOne = input.nextInt();

            //Calling Armstrong Method
            if ( isArmstrong(playerOne) )
                playerOneScore += 5;

            //Input player two
            System.out.print("Turn-Player 2:");
            int playerTwo = input.nextInt();

            //Calling Armstrong Method
            if (isArmstrong(playerTwo))
                playerTwoScore += 5;

            System.out.print("Do you want to play again? ");
            play = input.next();
        }
        System.out.println("Player 1:\t\t\tPlayer 2:");
        System.out.println("Score:"+playerOneScore+"\t\t\t\t"+"Score"+playerTwoScore);
        if (playerOneScore>playerTwoScore)
            System.out.println("PLayer 1 win");
        else if (playerTwoScore > playerOneScore)
            System.out.println("PLayer 2 win");
        else
            System.out.println("Draw");

    }
    public static boolean isArmstrong( int number){

        int finalReturn = number;

        String string = ""+number;

        int length = string.length();

        int sumForArmStrong = 0;

        //Calculating ArmstrongSum
        while (number != 0){

            int digit = number % 10;

            sumForArmStrong += Math.pow(digit , length);

            number = number / 10;
        }
        //Checking
        if (sumForArmStrong == finalReturn)
            return true;
        return false;
    }
}

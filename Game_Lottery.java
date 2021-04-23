package Russi7kd;

import java.util.*;

public class Game_Lottery {

    public static void main(String[] args) {
        Random random = new Random();

        Scanner input = new Scanner(System.in);
        //-------------Lottery Number-----------------
        int lottery = 100 + random.nextInt(999 - 100);

        int randomLottery = lottery;
        int part3 = randomLottery %10;

        randomLottery  /= 10;
        int part2 = randomLottery % 10;

        randomLottery /= 10;
        int part1 = randomLottery;
        //---------------User Guess-----------------
        System.out.print("Enter three digit guess: ");

        int userGuess = input.nextInt();

        int userpart3 = userGuess %10;

        userGuess /= 10;

        int userpart2 = userGuess % 10;

        userGuess /= 10;

        int userpart1 = userGuess;
        //-------------------------------------------
        if (userGuess == lottery)

            System.out.println("Exact Match\n$10,000 awarded");

        else if ((userpart1==part2 || userpart1 ==part3 || userpart1 == part1) && (userpart2==part1 || userpart2==part3 || userpart2 == part2) && (userpart3==part1 || userpart3==part2 || userpart3 == part3) )

            System.out.println("All matches found\n&3000 awarded");

        else if ((userpart1==part2 || userpart1 ==part3 || userpart1 == part1) || (userpart2==part1 || userpart2==part3 || userpart2 == part2) || (userpart3==part1 || userpart3==part2 || userpart3 == part3) )

            System.out.println("One Match found\n$1000 awarded");

        else

            System.out.println("No Match found\nBetter luck next time");
    }
}

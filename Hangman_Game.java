package Russi7kd;

import java.util.*;

public class Hangman_Game {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char y = 'y';

        while(y == 'y'){

            char [] list = randomWord();

            playGame(list);

            System.out.print("Do you want to play again: ");

            String yesNo = input.next().toLowerCase();

            y = yesNo.charAt(0);
        }

    }

    public static void playGame(char[] list){

        Scanner input = new Scanner (System.in);

        System.out.println("******* Guess Word *******");

        char [] asterisks = new char[list.length];

        for (int i = 0; i < list.length; i++) {

            asterisks[i] = '*';

        }

        int count = 0;

        int missed = 0;

        while(count < list.length) {

            System.out.print("Enter guess: ");

            System.out.print(asterisks);

            System.out.print("->");

            char guess = input.next().charAt(0);

            boolean x = false;

            int index = 0;

            for (int i = 0; i < list.length; i++) {

                if (guess == list[i]) {

                    x = true;

                    index = i;

                }

            }

            if (x) {

                asterisks[index] = list[index];

                list[index] = '*';

                System.out.println(asterisks);

                count++;
            }

            else{

                System.out.println(guess+" is not part");

                missed ++;

            }

            if (count == list.length){


                System.out.println("The correct is: "+Arrays.toString(asterisks));

                System.out.println("You missed: "+missed);

                for (int i = 0; i < list.length; i++) {

                    list[i] = asterisks[i];

                    asterisks[i] = '*';

                }
            }
        }
    }

public static char[] randomWord() {

        char[] list1 = {'p', 'a', 'k', 'i', 's', 't', 'a', 'n'};
        char[] list2 = {'a', 'm', 'e', 'r', 'i', 'c', 'a'};
        char[] list3 = {'a', 'u', 's', 't', 'r','a', 'l', 'i', 'a'};
        char[] list4 = {'t', 'u', 'r', 'k', 'e', 'y'};
        int random = (int) (1 + (Math.random() * 3));
        switch (random) {

            case 1: return list1;

            case 2: return list2;

            case 3: return list3;

            case 4: return list4;
        }

    return list1;
    }
}

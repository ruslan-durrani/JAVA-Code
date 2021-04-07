package russi;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();

        switch ( (year % 12) + 1 ){
            case 1 : System.out.println("Monkey");break;
            case 2 : System.out.println("Rooster");break;
            case 3 : System.out.println("Dog");break;
            case 4 : System.out.println("Pig");break;
            case 5 : System.out.println("Rat");break;
            case 6 : System.out.println("Ox");break;
            case 7 : System.out.println("Tiger");break;
            case 8 : System.out.println("Rabbit");break;
            case 9 : System.out.println("Dragon");break;
            case 10 : System.out.println("Snake");break;
            case 11 : System.out.println("Horse");break;
            case 12 : System.out.println("Sheep");break;


        }

    }
}

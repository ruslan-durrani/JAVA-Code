package russi;
import java.util.*;

public class RandomLetters {
    public static void main(String[] args) {
        System.out.println("****** Random Numbers Letters Generator ******");
        Scanner input = new Scanner (System.in);
        System.out.print("Enter 1 for numbers \nEnter 2 for Letters\nEnter: ");
        int choice = input.nextInt();
        switch(choice){
            case 1 : {
                System.out.print("Enter first number: ");
                int num1 = input.nextInt();
                System.out.print("Enter second number: ");
                int num2 = input.nextInt();
                System.out.println("Random Generated: " + RandomNumber(num1, num2));
            }break;
            case 2 : {
                System.out.print("Enter first letter: ");
                char ch1 = input.next().charAt(0);
                System.out.print("Enter second letter: ");
                char ch2 = input.next().charAt(0);
                System.out.println("Random Generated: " + RandomLetter(ch1, ch2));
            }break;
            default: System.out.println("Wrong Input");break;
        }
    }
    public static char RandomLetter(char a , char b){

        return    (char)(a + (Math.random() * ( b - a ) + 1));
    }
    public static int RandomNumber(int a, int b){
        return    (int)(a + (Math.random() * ( b - a ) + 1));
    }
}

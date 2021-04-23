package Russi7kd;
import java.util.*;
public class RandomLettersClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int PER_Line = 20;
        String[] array = {"Small Letters","Capital Letters","Numbers 0-9"};
        int i = 1;
        System.out.println("Random Generation");
        for (String k: array) {
            System.out.println(i+" : "+k);
            i ++;
        }
        System.out.print("Enter: ");
        int a = input.nextInt();
        for (int j = 0; j < 175; j++) {
            if (j % PER_Line == 0)
                System.out.println();
            if (a == 1)
                System.out.print(RandomLetters.RandomCharacterLower());
            else if (a == 2)
                System.out.print(RandomLetters.RandomCharacterUpper());
            if (a == 3)
                System.out.print(RandomLetters.RandomNumber());

        }
    }
}
class RandomLetters{
    public static char Random(char ch1, char ch2){
        return  (char)(ch1 + Math.random()* ( ch2 - ch1 + 1));
    }
    public static char RandomNumber(){
        return  Random('0','9');
    }
    public static char RandomCharacterUpper(){
        return  Random('A','Z');
    }
    public static char RandomCharacterLower(){
        return  Random('a','z');
    }
}

package russi;
import java.util.*;
public class PerlineCharacters {
    public static void main(String[] args) {
        final int totalCharacters = 175;
        final int perline = 25;
        int i = 1;
        while (i<=175){
            char ch = RandomLetters.RandomLetter('a','z');
            if (i % perline == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
            i++;
        }
    }
}

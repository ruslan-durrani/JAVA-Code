package russi;
import java.util.*;
public class Generating_CharactersLettersNumbers {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10){
            char random = (char) ('a' + (Math.random()*('z'-'a'+1)));
            i ++;
            System.out.println(random);
        }
        i = 0;
        int random = '0';
        while (i < 10){
            random= (int) (20 + (Math.random()*(25-20)));
            i ++;
            System.out.println(random);
        }
        i = 0;
        char rand = '0';
        while (i < 10){
            rand = (char) (65 + (Math.random()*(91-65)));
            i ++;
            System.out.println(rand);
        }
        i = 0;
        int ran = '0';
        while (i < 10){
            ran = (int) ('A' + (Math.random()*('Z'-'A'+1)));
            i ++;
            System.out.println((char)ran);
        }
    }
    static int mainMeth(){
        System.out.println("Im main");
        return 0;
    }
}

package russi;
import java.util.*;
public class MathodPattern {
    public static void main(String[] args) {
        int i = 1;
        while ( i <= 6 ) {
            System.out.println();
            methodPattern(i, 2);
            i++;
        }
    }
    public static void methodPattern(int i , int num){
        for (int j = 1; j <= i; j++) {
            System.out.print(num+"-*-| ");
            num *= 2;
        }
    }

}

package russi;
import java.util.*;
public class Method {
    public static void main(String[] args) {
        int i = -100;
        if (ch(i) <0)
            System.out.println("negative");
        else if (ch(i)>0 )
            System.out.println("positive");
        else
            System.out.println("0");
    }
    public static int ch(int k){
        if (k > 0)
            return 1;
        else if(k < 0)
            return -1;
        return 0;
    }
}

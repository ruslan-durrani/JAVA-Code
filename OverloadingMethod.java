package russi;
import java.util.*;
public class OverloadingMethod {
    public static void main(String[] args) {
        System.out.println(max(9,8));
        System.out.println(max(23,2));
    }
    public static int max (int a , int b){
        return (a>b)? a: b;
    }
}

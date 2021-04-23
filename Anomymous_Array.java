package Russi7kd;
import java.util.*;
public class Anomymous_Array {
    public static void main(String[] args) {
        maX(1,2,3);

    }
    public static void maX(int... number){
        int max = number[0];
        for (int i = 0; i < number.length; i++)
            if(max < number[i])
                max = number[i];
        System.out.println(max);

    }
}

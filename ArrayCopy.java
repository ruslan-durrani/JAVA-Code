package Russi7kd;
import java.util.*;
public class ArrayCopy {
    public static void main(String[] args) {
        int[] source = {1,2,3,4,5};
        int [] target = new int[source.length];
        System.arraycopy(source, 0,target,0,source.length);
        for (int i = 0; i < target.length; i++) {
            System.out.print(" "+target[i]);
        }
    }
}

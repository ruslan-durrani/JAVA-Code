package Russi7kd;
import java.util.*;
public class ShiftingOneArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int temp = array[0];
        for (int i = 0; i < array.length - 1 ; i++) {
            array[i] = array[i + 1];
        }
        array[array.length-1] = temp;
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]);
        }
    }
}

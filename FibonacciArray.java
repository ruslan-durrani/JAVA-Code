package Russi7kd;
import java.util.*;
public class FibonacciArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;
        Scanner input = new Scanner(System.in);
        array [ 0 ] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array [i] = array[i - 2] + array [ i - 1];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

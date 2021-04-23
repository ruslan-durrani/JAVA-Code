package Russi7kd;
import java.util.*;
public class Prime_Efficient_Way {
    public static void main(String[] args) {
        int[] list = new int[50];
        int numberOfPrime = 50;
        int number = 2;
        for (int i = 0; i < numberOfPrime; i++) {
            if(isPrime(number))
                list[i] = number;
            else
                i --;
            number++;
        }
        for (int i = 0; i < list.length; i++) {
            if(i % 10 == 0)
                System.out.println();
            System.out.printf(" %3d ",list[i]);
        }
    }
    public static boolean isPrime(int i){
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0)
                return false;
        }
        return true;
    }
}

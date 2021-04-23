package Russi7kd;

import java.util.*;

public class AverageArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] list = new double[10];
        System.out.print("Enter list of data: ");
        for (int i = 0; i < list.length; i++)
            list[i] = input.nextDouble();
        System.out.println("Average: "+average(list));
    }
    public static int average(int[] array){
        int avg = 0 ;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }
        return avg/array.length;
    }
    public static double average(double[] array){
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }

        return avg/array.length;
    }
}

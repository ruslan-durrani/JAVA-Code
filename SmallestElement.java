package Russi7kd;

import java.util.*;
public class SmallestElement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] list = new double[10];
        System.out.print("Enter list of data: ");
        for (int i = 0; i < list.length; i++)
            list[i] = input.nextDouble();

        System.out.println("Minimum number is: "+ min(list));

    }
    public static double min (double[] array){
        double min = array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i] < min)
                min = array[i];
        }
        return min;
    }
}

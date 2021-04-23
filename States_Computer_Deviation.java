package Russi7kd;

import java.util.*;

public class States_Computer_Deviation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter ten values: ");

        double[] list = new double[10];

        for (int i = 0; i < list.length ; i++) {
            list[i] = input.nextDouble();
        }

        System.out.printf("\nThe mean is: %.2f",mean(list));

        System.out.printf("\nThe deviation is: %.2f",deviation(list));
    }
    /** Compute the deviation of double values */
    public static double deviation(double[] x){

        double deviation_Data = 0;

        double mean = mean(x);

        for (int i = 0; i < x.length; i++) {
            deviation_Data += Math.pow((x[i] - mean),2)  / (x.length - 1);
        }

        return Math.sqrt(deviation_Data);
    }
    /** Compute the mean of an array of double values */
    public static double mean(double[] x){

        double meanData = 0;

        for (int i = 0; i < x.length ; i++) {
            meanData += x[i];
        }

        return meanData / x.length;

    }
}

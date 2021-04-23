package Russi7kd;
import java.util.*;
public class Reversing_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] list = new double[10];
        System.out.print("Enter ten values: ");
        for (int i = 0; i < list.length; i++)list[i] = input.nextDouble();

        System.out.println("Ascending order: ");

        for (double i :list) System.out.print(" "+i);

        reverse(list);
        System.out.println("\nReversed: ");
        System.out.println(Arrays.toString(list));
    }
    public static double[] reverse(double[] list) {
        for (int i = 0,j = list.length-1; i < list.length/2; i++,j--){
            double temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }


        return list;
    }
}

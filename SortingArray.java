package Russi7kd;
import java.util.*;
public class SortingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of 10 values: ");
        double[] list = new double[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        sortingList(list);
        System.out.println("The Sorted Array is");
        for (double i: list) {
            System.out.print(" "+i);
        }
    }
    public static void sortingList(double[] list){
        for (int i = 0; i < list.length; i++) {
            double min = list[i];
            for (int j = i; j < list.length ; j++) {
                if(list[j]<min){
                    min = list[j];
                    list[j] = list[i];
                    list[i] = min;
                }
            }
        }
    }
}

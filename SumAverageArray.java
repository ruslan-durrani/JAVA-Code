package Russi7kd;
import java.util.*;
public class SumAverageArray {
    public static void main(String[] args) {
        System.out.print("Enter number of number: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        double[] numbers = new double[x];
        double sum = 0;
        double count = 0;
        System.out.print("Enter 10 values: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        double avg = sum / numbers.length ;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>avg){
                count ++;
            }
        }
        System.out.println("Average: "+avg);
        System.out.println("NUmber greater than average are: "+count);
    }
}

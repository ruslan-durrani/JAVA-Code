package russi;
import java.util.*;
public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers with spaces: ");
        double a = input.nextDouble(),b = input.nextDouble(),c = input.nextDouble();
        displaySortedNumbers(a, b, c);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3){
        if( num1 < num2 && num1 < num3){
            System.out.print(num1 + " ");
            if ((num2 < num3)) {
                System.out.print(num2 + " " + num3);
            } else {
                System.out.print(num3 + " " + num2);
            }
        }
        else if( num2 < num1 && num2< num3){
            System.out.print(num2+" ");
            if (num1 < num3)
                System.out.print(num1 + " " + num3);
            else
                System.out.print(num3 + " " + num1);
        }
        else if ( num3 < num2 && num3 < num1){
            System.out.print(num3 + " ");
            if (num2 < num1)
                System.out.print(num2 + " " + num1);
            else
                System.out.print(num1 + " " + num2);
        }
    }
}

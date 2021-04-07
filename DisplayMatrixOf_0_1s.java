package russi;
import java.util.*;
public class DisplayMatrixOf_0_1s {
    public static void main(String[] args) {
        //Display Header
        System.out.println("**** Random Generated Matrix 0-1 ****");
        //Scanner Object
        Scanner input = new Scanner(System.in);
        //User input
        System.out.print("Enter number for Matrix display: ");
        int number = input.nextInt();
        //Method Call
        printMatrix(number);
    }
    public static void printMatrix(int n){
        //Matrix Display
        System.out.println("Matrix:\n======");
        //For Loop
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                //Random number generating and display
                int randomZeroOne = (int)(Math.random() * 2);
                System.out.print(" "+randomZeroOne);
            }
            System.out.println();
        }
    }
}

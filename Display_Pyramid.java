package russi;
import java.util.*;
public class Display_Pyramid {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Ask user to enter integer to display Pyramid
        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();
        // Display pyramid********************************
        for (int rows = 1; rows <= numberOfLines; rows++) {
            // Create spaces in each row
            for (int s = numberOfLines - rows; s >= 1; s--) {
                System.out.print("  ");
            }
            // Create decending numbers in each row
            for (int l = rows; l >= 2; l--){
                System.out.print(l + " ");
            }
            // Create ascending number in each row
            for (int r = 1; r <= rows; r++) {
                System.out.print(r + " ");
            }
            //********************************
            // new Line
            System.out.println();
        }
    }
}

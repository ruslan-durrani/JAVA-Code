package russi;
import java.util.*;
public class DisplayPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        displayPattern(number);
    }
    public static void displayPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();

        }

    }
}

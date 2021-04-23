package Russi7kd;
import java.util.*;
public class CalculatorArgumetsPasser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculator:");
        System.out.print("Enter Data: ");
        String[] string = new String[3];
        for (int i = 0; i < string.length; i++) {
            string[i] = input.next();
        }
        Calculator.main(string);
    }
}

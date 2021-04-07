package russi;
import java.util.Scanner;
public class BitwiseOperator {
    public static void main(String[] args) {
        //Scanner object
        Scanner input = new Scanner(System.in);
        //INput from user
        System.out.print("Enter a number: ");
        short number = input.nextShort();
        //Binary String
        String binary = " ";
        //Loop for storing binary digits
        for (int i = 0; i < 16; i++) {
            //Stoding reminders
            binary = (number & 1) + binary ;
            //Shifting number forward by its half
            number = (short) (number >> 1);
        }
        System.out.println("The Binary are " + binary);
    }
}


package russi;
import java.util.*;
public class OccuranceOfMaxNumbers_Q_5_41 {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      // Input Frmo user
        System.out.print("Enter number: (0 to exit) ");
        int number = input.nextInt();
        // Occurance variable counter
        int occuranceOfNumber = 0;
        // Max number will be stored her
        int maximumNumber;
        // initially max has user input
        maximumNumber = number;
        // Calculations
        while (number != 0) {
            if (number > maximumNumber) {
                maximumNumber = number;
                occuranceOfNumber = 1;
            } else if (number == maximumNumber)
                occuranceOfNumber += 1;

            number = input.nextInt();
        }
        System.out.println("The largest number is: "+maximumNumber );
        System.out.println("The occurrence count of the largest number is: "+occuranceOfNumber);
    }
}
package russi;
import java.util.*;
public class ChapterFiveQuestion1 {
    public static void main(String[] args) {
        //Input Scanner Object
        Scanner input = new Scanner (System.in);

        int number = 1;//Dummy text in order to enter Loop
        int pCount = 0;//Positive number counter
        int nCount = 0;//Negative number counter
        int sum = 0;//Sum initializations
        //Display
        System.out.print("Enter numbers (positive / negative): ");
        while (number != 0) {
            number = input.nextInt();
            sum += number;
            //Selections for Positive and Negative number encountering
            if ( number > 0)
                pCount += 1;
            else if ( number < 0)
                nCount += 1;
        }
        // Final display
        if ( sum == 0) {// if Sum is Zero this means that the number in start was 0
            System.out.println("No numbers are entered except 0");System.exit(0);
        }
        // This is the final Display
        System.out.println("The positive numbers are: "+ pCount);
        System.out.println("The negative numbers are: "+ nCount);
        System.out.println("The Total is: "+ sum);
        System.out.println("The average is: " + (double) sum / (pCount+nCount) );
    }
}

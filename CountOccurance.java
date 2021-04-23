package Russi7kd;
import java.util.*;
public class CountOccurance {
    public static void main(String[] args) {
        //Scanner Object
        Scanner input = new Scanner(System.in);

        //Array declaration and creation
        int[] listOfNumber = new int[100];

        //Input from user
        System.out.print("Enter integers between 1-100: ");
        for (int i = 0 ; i < listOfNumber.length; i++){
            listOfNumber[i] = input.nextInt();
            if (listOfNumber[i] == 0)
                break;
        }
        //Method of occurance calling
        occurance_Value(listOfNumber);
    }
    // Method for Counting Occurance of Values
    public static void occurance_Value(int[] list){
        int counter;
        for (int i = 1; i < 101; i++) {
            counter = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[j] == i)
                    counter++;
            }
            if (counter>0)
                System.out.println(i+" occurs "+counter+((counter>1)?" times ":" time "));
        }
    }
}

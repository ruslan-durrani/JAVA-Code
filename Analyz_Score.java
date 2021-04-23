package Russi7kd;
import java.util.*;
public class Analyz_Score{
    public static void main(String[] args) {
        //Display Header
        System.out.print("Enter scores: ");

        //Array declaration and creation
        int[] list = new int[100];
        dataAnalysis(list);
    }
    // Data Analysis method
    public static void dataAnalysis(int[] data){
        Scanner input = new Scanner(System.in);

        //Average variable
        int avg = 0;
        //Counter for input counting
        int counter = 0;
        //Loop for fetching data
        for (int i = 0; i < data.length; i++) {
            int enter  = input.nextInt();

            //if negative terminate
            if (enter < 0)
                break;
            data[i] = enter;
            //Sum calculation
            avg += data[i];
            //Counter of input values
            counter ++;
        }
        avg /= counter;//average
        int below = 0;
        int above = 0;
        int equal = 0;
        for (int i = 0; i < counter; i++) {
            if (avg > data[i])
                below ++;
            else if (avg < data[i])
                above ++;
            else
                equal++;
        }
        System.out.println("Average is:"+avg+"\nAbove avg scores: "+above+"\nBelow avg score: "+below+"\nEqual Average: "+equal);
    }
}

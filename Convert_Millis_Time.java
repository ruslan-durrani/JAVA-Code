package Russi7kd;
import java.util.*;
public class Convert_Millis_Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //User input for milliseconds
        System.out.print("Enter Milli Seconds: ");
        long milliSeconds = input.nextLong();
        //Calling convertMillis Method for conversion
        String time = convertMillis(milliSeconds);
        //Displaying results
        System.out.println("Hours:Minutes:Seconds\n"+time);
    }
    //Method for Milliseconds Conversion with return type String
    public static String convertMillis(long millis){
        //String for time storing
        String time = "";
        //Conversion
        long totalSeconds = millis / 1000;   //Total seconds
        long remainingSeconds = totalSeconds % 60;  //Remaining Seconds
        long totalMinutes = totalSeconds / 60; // Total minutes
        long remainingMinutes = totalMinutes % 60;  //Remaining minutes
        long totalHours = totalMinutes / 60;  //Total Hours
        time += totalHours+"\t :\t"+remainingMinutes+"\t :\t"+remainingSeconds;

        //Returning String that holds time string
        return time;
    }
}

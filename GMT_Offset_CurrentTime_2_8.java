package russi;

import java.util.Scanner;

public class GMT_Offset_CurrentTime_2_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();
        long timeMilli = System.currentTimeMillis();
        long seconds = timeMilli / 1000;
        long remainingSeconds = seconds % 60;
        long minutes = seconds / 60;
        long remainingMinutes = minutes % 60;
        long hours = minutes / 60;
        long currentHour = hours % 24;
        System.out.println("The current time is "+(currentHour+offset)+" : "+remainingMinutes+" : "+remainingSeconds);

    }
}

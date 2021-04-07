package russi;

import java.util.Scanner;

public class FutureDateDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Monday:1\nTuesday:2\nWednesday:3\nThursday:4\nFriday:5\nSaturday:6\nSunday\nEnter today's day: ");
        byte toDay = input.nextByte();
        System.out.print("Enter the number of days elapsed since today: ");
        int futureDay = input.nextInt();
        int dayIs = (toDay + futureDay ) % 7;
        switch (dayIs){
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thursday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            case 0: System.out.println("Sunday");break;
        }

    }
}

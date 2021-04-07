package russi;
import java.util.*;
public class ZellersCongruence{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Input Year------------------------------
        System.out.print("Enter year: (e.g., 2021): ");
        int year = input.nextInt();
        //Input Month------------------------------
        System.out.print("Enter month: 1-12: ");
        int m = input.nextInt();
        //Special Case for January and February
        if (m == 1 || m == 2) {
            m = m + 12;
            year = year - 1;
        }
        //Input Month------------------------------
        System.out.print("Enter the day of the month: 1-31: ");
        int q = input.nextInt();
        //Year of Century------------------------------
        int k = year % 100;
        //Century------------------------------
        int j = year / 100;
        //Formulae for Day of month Calculations
        int h = (q + ( ( 26 * (m + 1) ) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        String day = "";
        switch (h) {
            case 2: day = "Monday";break;
            case 3: day = "Tuesday";break;
            case 4: day = "Wednesday";break;
            case 5: day = "Thursday";break;
            case 6: day = "Friday";break;
            case 0: day = "Saturday";break;
            case 1: day = "Sunday";break;
        }
        //Day displayed------------------------------
        System.out.println("Day of the week is " + day);
    }
}
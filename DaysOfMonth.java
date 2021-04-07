package russi;
import java.util.*;
public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("\nEnter Month: ");
        String month = input.next();
        String subString = month.substring(0,3).toUpperCase(Locale.ROOT);
        switch (subString){
            case "JAN": System.out.printf("%s %d has %d days",month,year,31);break;
            case "FEB":
                if ((year % 100 != 0 && year % 4 ==0 ) || (year % 400 == 0)) {
                    System.out.printf("%s %d has %d days", month, year, 29);
                }
                else
                    System.out.printf("%s %d has %d days", month, year, 28);
                break;
            case "MAR": System.out.printf("%s %d has %d days",month,year,31);break;
            case "APR": System.out.printf("%s %d has %d days",month,year,30);break;
            case "MAY": System.out.printf("%s %d has %d days",month,year,31);break;
            case "JUN": System.out.printf("%s %d has %d days",month,year,30);break;
            case "JUl": System.out.printf("%s %d has %d days",month,year,31);break;
            case "AUG": System.out.printf("%s %d has %d days",month,year,31);break;
            case "SEP": System.out.printf("%s %d has %d days",month,year,30);break;
            case "OCT": System.out.printf("%s %d has %d days",month,year,31);break;
            case "NOV": System.out.printf("%s %d has %d days",month,year,30);break;
            case "DEC": System.out.printf("%s %d has %d days",month,year,31);break;


        }


    }
}

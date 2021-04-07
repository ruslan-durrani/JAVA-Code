package russi;

import java.util.Scanner;

public class FindNumberOfYears_2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of minutes: ");
        long minutes = input.nextLong();
        long hours = minutes / 60 ;
        long days = hours / 24 ;
        long remainingDays = days % 365 ;
        long years = days / 365 ;
        System.out.printf("%d minutes has approximately %d years and %d days",minutes,years,remainingDays);
    }
}

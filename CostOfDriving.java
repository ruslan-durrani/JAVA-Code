package russi;

import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Distance Input
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        //Miles input
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        //Price per Gallon
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();
        //Cost Calculations
        double cost = (distance/milesPerGallon) * pricePerGallon ;
        System.out.printf("The cost of driving is $%.2f",cost);

    }
}

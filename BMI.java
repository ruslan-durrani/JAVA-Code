package russi;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Weight input
        System.out.print("Enter weight in pounds : ");
        double weightInPounds = input.nextDouble();
        //Height INput
        System.out.print("Enter height in Inches: ");
        double heightInInches = input.nextDouble();
        //Conversion
        double weightInKilograms = weightInPounds *  0.45359237 ;
        double heightInMeters = heightInInches *  0.0254 ;
        double BMI = weightInKilograms / (heightInMeters*heightInMeters);
        System.out.printf("BMI is %.4f",BMI);

    }
}

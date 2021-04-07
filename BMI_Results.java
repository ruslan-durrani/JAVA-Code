package russi;

import java.util.Scanner;

public class BMI_Results {
    public static void main(String[] args) {
        /**
         * BMI Interpretation
         * BMI < 18.5 Underweight
         * 18.5 ≤ BMI < 25.0 Normal
         * 25.0 ≤ BMI < 30.0 Overweight
         * 30.0 ≤ BMI Obese
         */
        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant

        Scanner input = new Scanner(System.in);
        System.out.println("**************  B  M  I  **************");
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        double weightKilograms = weight * KILOGRAMS_PER_POUND;
        double heightMeters = height * METERS_PER_INCH;
        double BMI = weightKilograms / ( heightMeters * heightMeters);
        System.out.println("Your BMI index is : "+BMI);
        if (BMI < 18.5)
            System.out.println("Underweight");
        else if ( BMI >= 18.5 )
            System.out.println(" Normal ");
        else if (BMI >= 25.0)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

    }
}

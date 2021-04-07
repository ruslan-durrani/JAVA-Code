package russi;

import java.util.Scanner;

public class PointInCircle {
    public static void main(String[] args) {

        // Taking input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter points (x,y): ");

        double x = input.nextDouble();
        double y = input.nextDouble();

        //Formulae
        double position = Math.pow((x * x) + (y * y),0.5);

        //Conditions
        if (position <= 10){
            System.out.printf("The point ( %f , %f) is inside the circle",x,y);
        }
        else{
            System.out.println("Point is outside the circle");
        }
    }
}

package Russi7kd;
import java.util.*;
public class MyTriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        // Prompt the user to enter three points
        System.out.print("Enter three points for a triangle: ");
        double x1 = input.nextDouble(),   y1 = input.nextDouble();
        double x2 = input.nextDouble(),   y2 = input.nextDouble();
        double x3 = input.nextDouble(),   y3 = input.nextDouble();

        // Compute the area of a triangle
        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
        if (isValid(side1,side2,side3))
            System.out.println("The Area of triangle is: "+(int)(area(side1,side2,side3)*100)/100.0);
        else
            System.out.println("Invalid points");

    }
    public static boolean isValid(double side1, double side2, double side3){
        if ((side1+side2>side3)&&(side2+side3>side1) &&(side3+side1>side2))
            return true;
        return false;
    }
    /** Return the area of the triangle. */
    public static double area(double side1, double side2, double side3){
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        return area;
    }
}

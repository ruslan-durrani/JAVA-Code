package russi;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        float x1 = input.nextFloat();
        float y1 = input.nextFloat();
        float x2 = input.nextFloat();
        float y2 = input.nextFloat();
        float x3 = input.nextFloat();
        float y3 = input.nextFloat();
        // Compute the area of a triangle
        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

        //S
        double s = (side1 + side2 + side3)/2;
        //Area of Triangle
        double area = Math.pow( s * (s - side1) * (s - side2) * (s-side3) , 0.5);
        System.out.printf("The area of the triangle is %.2f",area);
    }
}

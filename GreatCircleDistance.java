package russi;
import java.util.*;
public class GreatCircleDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("*** Great Circle ***");
        System.out.print("\nEnter Point 1 (Latitude & Longitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("\nEnter Point 2 (Latitude & Longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        //Formula
        final double radius = 6_378.1f;
        //Formulae;
        double d = radius * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) * Math.cos(Math.toRadians(x1))* Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));
        System.out.printf("The distance between the two point is: %.2f",d);
    }
}

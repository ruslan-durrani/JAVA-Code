package russi;
import java.util.*;
public class AreaOfPentagon {
    public static void main(String[] args) {
        System.out.println("*** Area of Pentagom ***");
        System.out.print("\nEnter length from the center of pentagon to vertex: ");
        Scanner input = new Scanner (System.in);
        double l = input.nextDouble();
        //Formulae
        double s = 2 * l * Math.sin((Math.PI/5));
        double area = (5 * Math.pow(s,2))/(4 * Math.tan((Math.PI/5)));
        System.out.println("The area of the pentagon is: "+area);
    }
}

package russi;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        //input
        Scanner input = new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0 ");
        System.out.print("Enter a, b, c : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double disc = Math.pow(b,2) - 4 * a * c ;
        double root1 = (- b + Math.pow(disc,0.5))/ ( 2 * a);
        double root2 = (- b - Math.pow(disc,0.5))/ ( 2 * a);
        if ( disc > 0 ){
            System.out.println("Root 1: "+root1);
            System.out.println("Root 2: "+root2);
        }
        else if ( disc < 0 ){
            System.out.println("No real Roots ");
        }
        else if ( disc == 0){

            System.out.println("Root is : "+root1);
        }
    }
}

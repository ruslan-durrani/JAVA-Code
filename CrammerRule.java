import java.util.*;
public class CrammerRule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double determinent = (a * d) - (b * c) ;
        if (determinent == 0 ){
            System.out.println("The Equation has no Solution");
        }
        else{
            double x = ((e * d) - (f * c)) / determinent ;
            double y = ((a * f) - (b * e)) / determinent ;
            System.out.println("X: "+x+"\nY: "+y);
        }

    }
}

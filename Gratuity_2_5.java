package russi;
import java.util.*;

public class Gratuity_2_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        int subTotal = input.nextInt();
        int gratuityRate = input.nextInt();
        double gratuity = subTotal * (gratuityRate/100.0);
        double total = subTotal + gratuity ;
        System.out.printf("The gratuity is $%.1f and total is $%.1f",gratuity,total);



    }
}

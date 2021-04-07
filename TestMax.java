package russi;
import java.util.*;
public class TestMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int numberOne = input.nextInt();
        System.out.print("Enter second number: ");
        int numberTwo = input.nextInt();
        System.out.println("The Max number is: "+max(numberOne,numberTwo));

    }
    public static int max( int a, int b){
        int result = (a > b)? a : b ;
        return result ;

    }
}

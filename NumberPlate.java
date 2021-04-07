package russi;
import java.util.*;
public class NumberPlate {
    public static void main(String[] args) {
        //Random Object
        Random ran = new Random();
        //Four Number Random Number
        int number = 1000 + ran.nextInt(9999-1000);
        //Random number first character
        int letterOne = 65 + ran.nextInt(90-65);
        //Random number for second character
        int letterTwo = 65 + ran.nextInt(90-65);
        //Random number of third character
        int letterThree = 65 + ran.nextInt(90-65);
        //Display
        System.out.println("Vehicle can have #plat : "+(char)letterOne+(char)letterThree+(char)letterTwo+"-"+number);
    }
}

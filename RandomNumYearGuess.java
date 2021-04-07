package russi;
import java.util.*;
public class RandomNumYearGuess {
    public static void main(String[] args) {
        Random ranNum = new Random();
        int number = ranNum.nextInt(12) + 1;
        System.out.println(number);
        String [] months = {"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
        System.out.println("Random number is :"+number+"\nMonth is: "+months[number-1]);
    }
}

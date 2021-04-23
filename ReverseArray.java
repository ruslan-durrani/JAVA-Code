package Russi7kd;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        //Scanner object for input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 values: ");

        int[] list = new int[10];
        //Input Values
        for (int i = 0; i < list.length; i++)
            list[i] = input.nextInt();

        //Reverse Method Calling
        reversed(list);

        //Displaying revered list
        System.out.println("Reversed: ");
        for (int k:list)
            System.out.print(k+" ");

    }
    //Reversed Method
    public static void reversed(int[] list){
        for (int i = 0,j = list.length-1 ;i < list.length/2; i++,j--) {
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }
}

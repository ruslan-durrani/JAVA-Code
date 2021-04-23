package Russi7kd;
import java.util.*;
public class Print_Table_Using_Arrays {
    public static void main(String[] args) {
        int[] list = new int[11];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Table number: ");
        int number = input.nextInt();
        table(list,number);
        for (int i = 0; i < list.length; i++) {
            System.out.println("2 x "+i+" = "+list[i]);
        }
    }
    public static int[] table(int[] tab , int num){
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i * num;
        }
        return tab;
    }
}
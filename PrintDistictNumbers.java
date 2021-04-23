package Russi7kd;
import java.util.*;
public class PrintDistictNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[10];
        int counter = 0;
        System.out.print("Enter values: ");
        for (int i = 0; i < list.length; i++) {
            int enter = input.nextInt();
            if (isDictinct(list , enter)){
                list[i] = enter;
                counter++;
            }
        }
        System.out.println("The count of distinct numbers is: "+counter);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < list.length; i++) {
            if (list[i] != 0)
                System.out.print(" "+list[i]);
        }

    }
    public static boolean isDictinct(int[] list , int val){
        for (int i = 0; i < list.length; i++) {
            if(val == list[i])
                return false;
        }
        return true;
    }
}
//        int[] list = new int[10];
//        inputData(list);
//    }
//    public static void inputData(int[] list){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter 10 values: ");
//        int counter = 0;
//        for (int i = 0; i < list.length; i++) {
//            list[i] = input.nextInt();
//        }
//        String st = " ";
//        for (int i = 0; i < list.length; i++) {
//            String chk = ""+list[i];
//            if (!(st.contains(chk))){
//                st += " "+list[i];
//                counter++;
//            }
//        }
//
//
//        System.out.println("The distinct numbers are: "+counter);
//        System.out.println("The distinct numbers are: "+st);
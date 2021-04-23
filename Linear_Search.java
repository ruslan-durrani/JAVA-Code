package Russi7kd;
import java.util.*;
public class Linear_Search {
    public static void main(String[] args) {
        String[] name = {"Ruslan","Arsalan","Zakriya","Durrani","Jahangir"};
        System.out.print("Enter name to find: ");
        Scanner input = new Scanner(System.in);
        String UserInput = input.next();
        int a = linearSearch(name,UserInput);
        if (a != -1)
            System.out.println("Key found at index: "+a+"\n"+name[a]);
        else
            System.out.println("Not found");
    }
    public static int linearSearch(String[] name, String s){
        for (int i = 0; i < name.length; i++) {
            if (s.equalsIgnoreCase(name[i])){
                return i;
            }
        }
        return -1;
    }
}

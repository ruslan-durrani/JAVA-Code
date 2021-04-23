package Russi7kd;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter Key: ");
        int key = input.nextInt();
        int low = 0;
        int high = list.length - 1;
        int x = 0;
        int mid = 0;
        while (high >= low) {
            mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid]){
                x = 1;
                break;
            }
            else
                low = mid + 1;
        }
        if ((x == 1))
            System.out.println("Found at index "+mid);
        else
            System.out.println("Not found");
    }
}

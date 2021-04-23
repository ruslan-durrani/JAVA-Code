package Russi7kd;

import java.util.*;

public class Eliminate_Duplicates {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten values: ");

        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {

            int inputNumber = input.nextInt();

            list[i] = duplicates_eliminiation(inputNumber , list);

        }

        for (int i: list) {
            if (i != 0)
                System.out.print(i + " ");
        }

    }
    public static int duplicates_eliminiation(int number , int[] list ){

        for (int i = 0; i < list.length; i++)
            if (number == list[i])
                return 0;
        return number;

    }
}

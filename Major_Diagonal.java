package Russi7kd;

import java.util.*;

public class Major_Diagonal {
    
    public static void main(String[] args) {

        double [][]  matrix = new double[4][4];

        System.out.println("\nEnter a 4-by-4 matrix row by row: ");
        
        getInput(matrix);  //Completing 2D list

        double results = sumMajorDiagonal(matrix); //Calculating sumMajorDiagonal

        System.out.println("\nSum of elements in major diagonal is: "+results);

    }
    //Method for getting input
    public static void getInput(double[][] matrix){

        Scanner input = new Scanner (System.in);

        for (int i = 0; i < matrix.length; i++) {

            System.out.print("\n"+(i+1)+": Complete row: ");

            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = input.nextDouble();

            }

        }
        
    }
    public static double sumMajorDiagonal(double[][] matrix){

        double sum = 0.0;

        //Calculating sum of major diagonal
        for (int i = 0; i < matrix.length; i++)

                sum += matrix[i][i];


        return sum;
    }
}

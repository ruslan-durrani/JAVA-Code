package Russi7kd;
import java.util.*;
public class Assign_Grades {
    public static void main(String[] args) {
        //Scanner Object for input
        Scanner input = new Scanner(System.in);

        //Number of Students
        System.out.print("Enter number of Students:");
        int x = input.nextInt();

        double[] listOfScore = new double[x];

        //Input Data Method Caller
        inputData(listOfScore);

        //Best Score
        double best = 0;
        for (int i = 0; i < listOfScore.length; i++)
            if (best < listOfScore[i])
                best = listOfScore[i];
            //------------------------------

        for (int i = 0; i < listOfScore.length; i++)
            //Assigning Grades
            assignGrades((int)listOfScore[i],best, i);

    }
    //Method for Score Input
    public static void inputData(double[] inputScore){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < inputScore.length; i++) {
            System.out.print("\n"+(i+1)+") Student marks: ");
            inputScore[i] = input.nextInt();
        }
    }
    //Method for Grades Display
    public static void assignGrades(int grades_Assigning_LIst, double best, int index){
        if (grades_Assigning_LIst >= (best - 10))
            System.out.printf("\nStudent %d Score is %d and Grade is A",index,grades_Assigning_LIst);
        else if (grades_Assigning_LIst >= (best - 20))
            System.out.printf("\nStudent %d Score is %d and Grade is B",index,grades_Assigning_LIst);
        else if (grades_Assigning_LIst >= (best - 30))
            System.out.printf("\nStudent %d Score is %d and Grade is C",index,grades_Assigning_LIst);
        else if (grades_Assigning_LIst >= (best - 40))
            System.out.printf("\nStudent %d Score is %d and Grade is D",index,grades_Assigning_LIst);
        else
            System.out.println("\nFail");
    }
}

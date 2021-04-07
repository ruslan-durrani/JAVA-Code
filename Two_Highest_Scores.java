package russi;
import java.util.*;
public class Two_Highest_Scores {
    public static void main(String[] args) {
        //Title Display
        System.out.println("***************Two High Scores***************\n");
        //Scanner Object
        Scanner input = new Scanner(System.in);
        // Strings To Hold The names of First And Second Highest Score Holder
        String firstHighestName = "";
        String secondHighestName = "";
        // Int Variables Holding The highest and Second highest Score holders
        int firstHighestScore = 0;
        int secondHighestScore = 0;
        System.out.print("Enter number of Students: ");
        int numberOfStudents = input.nextInt();
        //Loop to ask user Their Score AND NAMES
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print(i+")********\nEnter Name: ");
            String name = input.next();
            System.out.print("Enter Score: ");
            int studentsScore = input.nextInt();
            // Selections that Keeps on Swapping the Data for first and seconds High Achievers
            if (studentsScore >firstHighestScore){
                secondHighestScore = firstHighestScore;
                secondHighestName = firstHighestName.toUpperCase();
                firstHighestScore = studentsScore;
                firstHighestName = name.toUpperCase();
            }
            else if( studentsScore < firstHighestScore && studentsScore > secondHighestScore){
                secondHighestScore = studentsScore;
                secondHighestName = name.toUpperCase();
            }
        }
        //Display of final results
        System.out.println("The Student that is Topper is: "+firstHighestName);
        System.out.println("His Score is: "+firstHighestScore);
        System.out.println("The Student that is Second: "+secondHighestName);
        System.out.println("His Score is: "+secondHighestScore);
    }
}

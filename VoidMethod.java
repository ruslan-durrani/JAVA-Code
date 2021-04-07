package russi;
import java.util.*;
public class VoidMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int marks = 1;
        while ( marks != 0){
            System.out.print("Enter your Marks to Validate grades: ");
            marks = input.nextInt();
            grades(marks);
        }
    }
    public static void grades ( int marks){
        if (marks >=90)
            System.out.println("Grades is A");
        else if (marks >=80)
            System.out.println("Grades is B");
        else if (marks >=70)
            System.out.println("Grades is C");
        else if (marks >=60)
            System.out.println("Grades is D");
        else if (marks<60)
            System.out.println("Grades is F");
    }
}

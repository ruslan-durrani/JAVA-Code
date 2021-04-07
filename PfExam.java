package russi;
import java.util.*;
public class PfExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your department: ");
        byte department = input.nextByte();
        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();
        switch (department){
            case 11: case 22: salary += (salary * 0.02);break;
            case 33: salary += (salary * 0.15);break;
            default: System.out.println("Invalid department Code");
        }
        System.out.println("Sallry raised to: "+salary);

    }
}

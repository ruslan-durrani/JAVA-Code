package russi;
import java.util.*;
public class LabExams {
    public static void main(String[] args) {
        //Display
        System.out.println("****Welcome to CNIC Validator****");
        //Input Object
        Scanner input = new Scanner(System.in);
        boolean isTrue = true;
        while(isTrue){
            //User Input
            System.out.print("Enter your CNIC number:");
            String CNIC = input.nextLine();
            if (!( CNIC.contains("-"))){
                System.out.println("Hyphens not correctly placed\nThe formate should be ( 844799-752198-5 )");
                continue;
            }
            else if (CNIC.length()<10){
                System.out.println("CNIC is Short in length\nThe formate should be ( 844799-752198-5 )");
                continue;
            }
            //Index Finding of first hyphen

            int first_Hyphen = CNIC.indexOf("-");
            //Index finding of second hyphen
            int last_Hyphen = CNIC.lastIndexOf("-");

            //First Substring Part
            String firstSubstringPart = CNIC.substring(0,first_Hyphen);

            //Second Substring Part
            String secondSubstringPart = CNIC.substring(first_Hyphen+1,last_Hyphen);

            //Last Substring Part
            String lastSubstringPart = CNIC.substring(last_Hyphen+1);

            if(firstSubstringPart.length()==6 && secondSubstringPart.length()==6 && lastSubstringPart.length()==1){
                System.out.println("Your CNIC is Valid: "+CNIC+"\nThank You!");
                break;
            }
            else{
                System.out.println("Invalid CNIC format.\nThe formate should be ( 844799-752198-5 )");
            }

        }
    }
}

package russi;
import java.util.*;
public class SSN {
    public static void main(String[] args) {
        //Input Object
        Scanner input = new Scanner (System.in);
        //User Input
        System.out.println("Enter a SSN: ");
        String ssn = input.nextLine();
        //Verification of first Hyphen
        boolean x = ssn.contains("-");
        //Verification of second Hyphen
        String sub = ssn.substring(4);
        boolean j = sub.contains("-");
        //What happens when first Hyphen Available
        if(!x){
            System.out.println("Hyphens does not exists");
            System.exit(0);
        }
        //What happens when second Hyphen Available
        else if (!j){
            System.out.println("Second Hyphen Missing");
            System.exit(0);
        }
        //finding of index number of hyphens
        int hyphen = ssn.indexOf('-',0);
        //finding of index number of hyphens
        int Hy = ssn.indexOf('-',5);
        //1
        String firstPart = ssn.substring(0,hyphen);
        //2
        String secondPart = ssn.substring(hyphen+1,Hy);
        //3
        String thirdPart = ssn.substring(Hy+1);

        if ( firstPart.length() == 3 && secondPart.length() == 2 && thirdPart.length() == 4)
            if (hyphen == 3 && Hy == 6)
                System.out.println(ssn+" is valid");
            else
                System.out.println("Hyphenate missing");
        else
                System.out.println(ssn+" is invalid ");

    }
}

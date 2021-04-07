package russi;
import java.util.*;
public class LotteryCode {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int RAN = 1+ (int)(Math.random() * 12);
        switch(RAN){
            case 1: System.out.println("The coresponding month is January");break;
            case 2: System.out.println("The coresponding month is Feb");break;
            case 3: System.out.println("The coresponding month is march");break;
            case 4: System.out.println("The coresponding month is april");break;
            case 5: System.out.println("The coresponding month is may");break;
            case 6: System.out.println("The coresponding month is june");break;
            case 7: System.out.println("The coresponding month is july");break;
            case 8: System.out.println("The coresponding month is aug");break;
            case 9: System.out.println("The coresponding month is september");break;
            case 10: System.out.println("The coresponding month is octuber");break;
            case 11: System.out.println("The coresponding month is november");break;
            case 12: System.out.println("The coresponding month is december");break;
        }
        int output = 0;
        while(true){
            System.out.println("Enter an integer between1-99");
            int userInput = input.nextInt();
            if (userInput<0 || userInput>99){
                System.out.println("Out of Range input. Please Enter between 0-99");
                continue;
            }
            else {
                RAN += userInput;
                output = RAN % 12;
                break;
            }

        }
        switch(output){
            case 1: System.out.println("The  month is January");break;
            case 2: System.out.println("The  month is Feb");break;
            case 3: System.out.println("The  month is march");break;
            case 4: System.out.println("The coresponding month is april");break;
            case 5: System.out.println("The coresponding month is may");break;
            case 6: System.out.println("The coresponding month is june");break;
            case 7: System.out.println("The coresponding month is july");break;
            case 8: System.out.println("The coresponding month is aug");break;
            case 9: System.out.println("The coresponding month is september");break;
            case 10: System.out.println("The coresponding month is octuber");break;
            case 11: System.out.println("The coresponding month is november");break;
            case 12: System.out.println("The coresponding month is december");break;
        }
    }
}

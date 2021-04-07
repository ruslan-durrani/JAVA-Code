package russi;
import java.util.*;
public class SubtractionQuizAndResultsDisplayed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        String dataDisplay = "";
        int correctAnswers = 0, wrongAnswers = 0;
        long EndTime = 0,StartTime = 0;
        while (counter < 5){
            StartTime = System.currentTimeMillis()/1000;
            int numberOne = (int)(20 + Math.random() * (40 - 20)+1);
            int numberTwo = (int)(20 + Math.random() * (40 - 20)+1);
            int temp = 0;
            if (numberTwo > numberOne) {
                temp = numberTwo;
                numberTwo = numberOne;
                numberOne = temp;
            }
            System.out.printf("What is %d - %d =  ",numberOne,numberTwo);
            int answer = input.nextInt();
            System.out.print("You are: "+(numberOne-numberTwo == answer)+"\n");
            dataDisplay += numberOne + "-" + numberTwo +" = "+ answer + " is "+(numberOne-numberTwo==answer)+"\n";
            counter ++;
            correctAnswers += (numberOne-numberTwo==answer)? 1:0;
            wrongAnswers += (numberOne-numberTwo==answer)? 1:0;
            EndTime = System.currentTimeMillis()/1000;
        }
        System.out.println("Answers: "+correctAnswers);
        System.out.println(dataDisplay);
        System.out.println("Correct: "+correctAnswers+"\nWrong: "+wrongAnswers);
        System.out.println("Time Consumed: "+ (EndTime - StartTime));
    }
}

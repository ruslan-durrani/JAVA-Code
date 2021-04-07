package russi;
import java.util.*;
public class SubtractionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Random randNum = new Random();
        final int QUIZ_QUESTIONS = 5;
        int count = 0;
        // This will Store the Results of Questions
        String display = "";
        //----------------------------------------
        while (count < QUIZ_QUESTIONS) {
            int randomNumberOne = randNum.nextInt(10);
            int randomNumberTwo = randNum.nextInt(10);
            if (randomNumberOne < randomNumberTwo){
                int temp = randomNumberOne;
                randomNumberOne = randomNumberTwo;
                randomNumberTwo = temp;
            }
            System.out.printf("What is %d - %d = ",randomNumberOne,randomNumberTwo);
            int answer = input.nextInt();
            if (answer == (randomNumberOne - randomNumberTwo))
                System.out.println("Correct Answer");
            else if ( answer != randomNumberOne - randomNumberTwo)
                System.out.println("Wrong Answer");
            display += "\n" + randomNumberOne + " - "+ randomNumberOne+" = "+answer+" "+(answer == (randomNumberOne - randomNumberTwo)? " Correct ":" Incorrect ");

            count += 1;

        }
        System.out.println("Output: "+display);
    }
}

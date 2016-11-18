import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by raylinares on 11/16/16.
 */
public class HighLow {
    public static void main(String[] args) {
        Random rand = new Random();
        int userGuess;
        String userAnswer;
        Scanner guess = new Scanner(System.in);

        do {
            int randomNumber = rand.nextInt((99)+1); //random number 1-100

                System.out.print("A number between 1-100 has been generated. Please guess the number: ");
                    userGuess = guess.nextInt();

                    do {
                        if (userGuess > randomNumber) {
                            System.out.print("The number is LOWER. Guess again.");
                            userGuess = guess.nextInt();
                        }
                        if (userGuess < randomNumber) {
                            System.out.print("The number is HIGHER. Guess again. ");
                            userGuess = guess.nextInt();
                        }
                    }

            while (userGuess != randomNumber);
            System.out.println("Wow, you guessed it! Nice job!");
            System.out.print("Would you like play again? Y or N ");
            userAnswer = guess.next();

        }
        while (userAnswer.equals("Y"));
        System.out.println("Ok fine, I didn't want to play anymore anyway!");
    }
}

import java.util.Scanner;

/**
 * Created by raylinares on 11/14/16.
 */
public class Factorial {
    public static void main(String[] args) {
        long userNumber;
        String userAnswer;
        Scanner factorials = new Scanner(System.in);

        do {
            System.out.print("Please enter a number between 1 and 25: ");
            userNumber = factorials.nextLong();
            long factorialNumber = 1;

            if (userNumber < 1 || userNumber > 25) {
                System.out.print("Invalid number. You can only enter a number between 1 and 25.");
            } else {
                for (int i = 1; i <= userNumber; i++) {
                    factorialNumber = factorialNumber * i;
                }
                System.out.println("The factorial of " + userNumber + " is " + factorialNumber);
            }
            System.out.print("Would you like try again? Y or N ");
            userAnswer = factorials.next();
        }
        while (userAnswer.equals("Y"));
        System.out.println("Ok thanks, have a nice day!");
    }
}

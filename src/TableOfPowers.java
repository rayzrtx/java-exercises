import java.util.Scanner;

/**
 * Created by raylinares on 11/14/16.
 */
public class TableOfPowers {
    public static void main(String[] args){
        long userNumber;
        long squareNumber;
        long cubedNumber;
        String userAnswer;
        Scanner table = new Scanner (System.in);

        do {
            System.out.print("Please enter an integer: ");
            userNumber = table.nextLong();
            for (int i = 1; i <= userNumber; i++){
                squareNumber = i*i;
                cubedNumber = i*i*i;
                System.out.println("Number  Square  Cubed");
                System.out.println("  " + i + "      " + squareNumber + "      " + cubedNumber );
            }
            System.out.print("Would you like try again? Y or N ");
            userAnswer = table.next();

        }while (userAnswer.equals("Y"));
        System.out.println("Ok thanks, have a nice day!");
    }
}

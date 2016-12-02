import java.util.Random;
import java.util.Scanner;

/**
 * Created by raylinares on 12/1/16.
 */


public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String  playerName;
        int playerSelection;
        RoshamboChoice selection = RoshamboChoice.Rock;
        RoshamboChoice cpuChoice = RoshamboChoice.Rock;
        String playAgain;
        int cpuSelection;
        Random rand = new Random();

        System.out.println("Time for everybody's favorite game...Rock, Paper, Scissors!");
        System.out.println("It is you vs the computer to determine the ultimate champion!");
        System.out.println("What is your first name? ");
        playerName = input.next();
        System.out.println("Are you ready " + playerName + "? Great! Please choose wisely and good luck!");

        do {
            //HumanPlayer class
            System.out.println("1) Rock");  //generateRo() for human player in HumanPlayer class
            System.out.println("2) Paper");
            System.out.println("3) Scissors");
            System.out.println("What is your selection? ");
            playerSelection = input.nextInt();
            switch (playerSelection){
                case 1:
                    selection = RoshamboChoice.Rock;
                    break;
                case 2:
                    selection = RoshamboChoice.Paper;
                    break;
                case 3:
                    selection = RoshamboChoice.Scissors;
                    break;
            }
            //CPUPlayer class
            cpuSelection = rand.nextInt((3)+1);     //generateRo() for cpu in cpuplayer class
            switch (cpuSelection){
                case 1:
                    cpuChoice = RoshamboChoice.Rock;
                    break;
                case 2:
                    cpuChoice = RoshamboChoice.Paper;
                    break;
                case 3:
                    cpuChoice = RoshamboChoice.Scissors;
                    break;
            }


            System.out.println(playerName + ", you chose " + selection);
            System.out.println("The cpu has chosen " + cpuChoice);

            if (playerSelection == cpuSelection){
                System.out.println("It's a draw!");
            }else if (playerSelection == 1 && cpuSelection == 3){
                System.out.println("Rock smashes Scissors! You win, " + playerName);
            }else if (playerSelection == 1 && cpuSelection == 2){
                System.out.println("Paper covers Rock...CPU wins!");
            }else if (playerSelection == 2 && cpuSelection == 1){
                System.out.println("Paper covers Rock! You win, " + playerName);
            }else if (playerSelection == 2 && cpuSelection == 3){
                System.out.println("Scissors cut paper...You lose!");
            }else if (playerSelection == 3 && cpuSelection == 1){
                System.out.println("Rock destroys scissors...You lose!");
            }else if (playerSelection == 3 && cpuSelection == 2){
                System.out.println("Scissors cut paper! You win!!");
            }
            System.out.println("What do you say...wanna play again? (y/n) ");
            playAgain = input.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Cool, well that was fun. Have a great day!");
        input.close();


    }
}

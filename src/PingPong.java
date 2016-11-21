import java.util.Scanner;

/**
 * Created by raylinares on 11/16/16.
 */
public class PingPong {

    public static final int WINNING_SCORE = 7;

    public static void main(String[] args) {
        String playerSide;
        int cpuSide;
        int cpuPoint = 0;
        int playerPoint = 0;
        Scanner side = new Scanner(System.in);

        System.out.print("Hey, how's it going? Thanks for playing. What is your name? \n");
        String playersName = side.next();
        System.out.println("Nice to meet you, " + playersName + "! I'm PingPong Bot 5000 and I'll be your host. First to 7 wins. Let's get this party started! ");
        do {
            // run playersTurn
            System.out.print("Please choose a side to swing your paddle: Right or Left? \n");
            playerSide = side.next();

            int pingPongBall = getRandomNumber();
            String sideOfTable;
            if (pingPongBall == 1) {
                sideOfTable = "Right";
            } else {
                sideOfTable = "Left";
            }
            System.out.println("You chose the " + playerSide + " side and the ball was hit on the " + sideOfTable + " side. ");
            if (playerSide.equals(sideOfTable)) {
                System.out.println("You hit the ball back. Nice job! It is now the CPU's turn. The score is still CPU: " + cpuPoint + " " + playersName + ": " + playerPoint);
            } else {
                cpuPoint++;
                System.out.println("You missed! That's a point to the computer. The score is now CPU: " + cpuPoint + " " + playersName + ": " + playerPoint);
                if (cpuPoint == WINNING_SCORE){
                    System.out.println("Sorry " + playersName + " but the CPU just whooped that ass. You are a loser!");
                    break;
                }
            }
            //run cpuTurn
            pingPongBall = getRandomNumber();
            if (pingPongBall == 1) {
                sideOfTable = "Right";
            } else {
                sideOfTable = "Left";
            }

            cpuSide = getRandomNumber();
            String cpuSideOfTable;
            if (cpuSide == 1){
                cpuSideOfTable = "Right";
            }else {
                cpuSideOfTable = "Left";
            }
            System.out.println("The cpu chose the " + cpuSideOfTable + " side and the ball was hit on the " + sideOfTable + " side. \n");
            if (pingPongBall == cpuSide) {
                System.out.println("Looks like the CPU nailed it. No point for you but it is now your turn again. The score is still CPU: " + cpuPoint + " " + playersName + ": " + playerPoint);
            } else {
                playerPoint++;
                System.out.println("The CPU whiffs it. Point for you! The score is now CPU: " + cpuPoint + " " + playersName + ": " + playerPoint);
                if (playerPoint == WINNING_SCORE){
                    System.out.println("Congrats " + playersName + "! You won!! CPU can suck it!");
                    break;
                }
            }
        }while (playerPoint < WINNING_SCORE && cpuPoint < WINNING_SCORE);

    }
    private static int getRandomNumber() {
        return (int) Math.ceil(Math.random() * 2);
    }
}

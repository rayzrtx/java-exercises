import java.util.Random;
import java.util.Scanner;

/**
 * Created by raylinares on 11/16/16.
 */
public class PingPong {
    public static void main(String[] args) {
        String playerSide; //
        int playerSideNumber;
        //int pingPongBall; getRandomNumber()
        int cpuSide;

        int cpuPoint = 0;
        int playerPoint = 0;
        Scanner side = new Scanner(System.in);
        do {
            //playersTurn
            System.out.print("Please choose a side: Right or Left? \n");
            playerSide = side.next();

            int pingPongBall = getRandomNumber();  //getRandomNumber
            String sideOfTable;
            if (pingPongBall == 1) {
                sideOfTable = "Right";
            } else {
                sideOfTable = "Left";
            }
            System.out.println("You chose the " + playerSide + " side and the ball was hit on the " + sideOfTable + " side. ");
            if (playerSide.equals(sideOfTable)) {
                System.out.println("You hit the ball back. Nice job! It is now the CPU's turn. \n");
            } else {
                cpuPoint++;
                System.out.println("You missed! That's a point to the computer. The score is now CPU: " + cpuPoint + " You: " + playerPoint);
                if (cpuPoint == 7){
                    System.out.println("Sorry buddy but the CPU just whooped that ass. You are a loser!");
                    break;
                }
            } //run cpuTurn
            //getRandomNumber
            pingPongBall = getRandomNumber();
            System.out.println("ping pong ball number is " + pingPongBall);
            cpuSide = getRandomNumber();
            System.out.println("the cpu number is " + cpuSide);
            if (pingPongBall == cpuSide) {
                System.out.println("Looks like the CPU nailed it. No point for you but it is now your turn again. \n");
            } else {
                playerPoint++;
                System.out.println("The CPU whiffs it. Point for you! The score is now CPU: " + cpuPoint + " You: " + playerPoint);
                if (playerPoint == 7){
                    System.out.println("Congrats! You won!! CPU can suck it!");
                    break;
                }
            }
        }while (playerPoint < 7 && cpuPoint < 7);

    }
    private static int getRandomNumber() {
        return (int) Math.ceil(Math.random() * 2);
    }
}

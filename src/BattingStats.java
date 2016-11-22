import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by raylinares on 11/22/16.
 */
public class BattingStats {
    public static void main(String[] args) {
        double battingAverage, sluggingPercentage;
        int atBats = 0, totalHits = 0, totalBases = 0, atBatsCounter = 1, atBatResult;
        int [] atBatResults = new int[atBats];
        Scanner sc = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.000"); //to specify the number of decimals

        System.out.println("Hello! Please enter the total number of at bats there were: ");
        atBats = sc.nextInt();
        System.out.println("Ok, great! Now you will be asked to enter the result of each at-bat. \n0-Out \n1-Single\n2-Double\n3-Triple\n4-Home Run");
        do {
            System.out.println("Please enter the result of at-bat " + atBatsCounter + ": ");
            atBatResult = sc.nextInt();
            if (atBatResult < 0 || atBatResult > 4){
                System.out.println("That is an invalid entry.");
                break;
            }
            if (atBatResult > 0){
                totalHits++;
            }
            Arrays.fill(atBatResults, atBatResult);
            totalBases += atBatResult;
            atBatsCounter++;
        } while (atBatsCounter <= atBats);

        battingAverage = getAverage(atBats, totalHits);
        sluggingPercentage = getAverage(atBats, totalBases);
        System.out.println("Batters batting average is " + formatter.format(battingAverage));
        System.out.println("Batters slugging percentage is " + formatter.format(sluggingPercentage));

    }

    private static double getAverage(int atBats, double totalHits) {
        return totalHits /atBats;
    }
}

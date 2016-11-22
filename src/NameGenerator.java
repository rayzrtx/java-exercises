import java.util.Random;
import java.util.Scanner;

/**
 * Created by raylinares on 11/21/16.
 */
public class NameGenerator {
    public static void main(String[] args) {
        String [] adjectives = new String[10];
        String [] nouns = new String[10];

        adjectives[0]="Delicious";
        adjectives[1]="Quick";
        adjectives[2]="Sleepy";
        adjectives[3]="Puny";
        adjectives[4]="Fierce";
        adjectives[5]="Gigantic";
        adjectives[6]="Purple";
        adjectives[7]="Glamorous";
        adjectives[8]="Nervous";
        adjectives[9]="Filthy";
        nouns[0]="Bottle";
        nouns[1]="Brain";
        nouns[2]="Window";
        nouns[3]="Box";
        nouns[4]="Candy";
        nouns[5]="Fungus";
        nouns[6]="Bicycle";
        nouns[7]="Television";
        nouns[8]="Basketball";
        nouns[9]="Bat";
        Scanner sc = new Scanner(System.in);
        String anotherName;
        String randomAdjective;
        String randomNoun;
        do {
            int adjectiveRandomNumber = getRandomNumber();
            int nounRandomNumber = getRandomNumber();
            randomAdjective = adjectives[adjectiveRandomNumber];
            randomNoun = nouns[nounRandomNumber];
            System.out.println("An awesome server name has been generated for you. Your new server name is " + randomAdjective + " " + randomNoun);
            System.out.println("Would you like another awesome server name? ");
            anotherName = sc.next();
        } while (anotherName.equals("Yes"));
        System.out.println("Ok, hope you enjoy your new server name. Have a great day!");
        sc.close();
    }
    private static int getRandomNumber() {
        return new Random().nextInt(10);
    }
}

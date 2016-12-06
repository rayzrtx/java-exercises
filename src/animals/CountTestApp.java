package animals;

/**
 * Created by raylinares on 12/5/16.
 */
public class CountTestApp {
    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("Counting Alligators...");
        Countable alligator = new Alligator();
        CountUntil.count(alligator, 3);   //Will display alligator name 3 times

        System.out.println("Counting Sheep...");
        Sheep blackie = new Sheep("Blackie");
        CountUntil.count(blackie, 2);       //will display blackie name 2 times

        Sheep dolly = (Sheep) blackie.clone();
        dolly.setName("Dolly");
        CountUntil.count(dolly, 3);         //will display dolly name 3 times

        blackie.resetCount();
        CountUntil.count(blackie, 1);       //will display blackie name once with a reset counter
    }
}

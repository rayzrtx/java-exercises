package animals;

/**
 * Created by raylinares on 12/5/16.
 */
public class Alligator implements Countable {
    int count;

    public void incrementCount(){
        count++;
    }
    public void resetCount(){
        count = 0;
    }
    public int getCount(){
        return count;
    }
    public String getCountString(){
        return count + " alligator";
    }

}

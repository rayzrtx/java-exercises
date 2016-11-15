/**
 * Created by raylinares on 11/14/16.
 */
public class DoWhileLoop {
    public static void main(String[] args){
        int i = 0;
        do {
            System.out.println(i);
            i=i+2;
        } while (i <= 100);
        System.out.println("No more two's. On to the next example.");
        int i2 = 100;
                do {
                    System.out.println(i2);
                    i2 = i2 - 5;
                } while (i2 >= -10);
        System.out.println("No more fives's. On to the next example.");
        long i3 = 2;
        do {
            System.out.println(i3);
            i3 = i3*i3;
        }   while (i3 < 1000000);
        System.out.println("No more squared numbers. On to the next example.");
        for (int i4 = 0; i4<=100; i4=i4+2){
            System.out.println(i4);
        }
        System.out.println("End of first for loop. On to the next example.");
        for (int i5 = 100; i5 >= -10; i5=i5-5){
            System.out.println(i5);
        }
        System.out.println("End of second for loop. On to the next example.");
        for (long i6 = 2; i6 < 1000000; i6=i6*i6){
            System.out.println(i6);
        }
    }
}

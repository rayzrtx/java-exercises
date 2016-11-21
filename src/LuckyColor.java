

import java.util.Scanner;

/**
 * Created by raylinares on 11/21/16.
 */
public class LuckyColor {
    public static void main(String[] args) {
        double payment;
        double discountedPayment;
        String anotherCustomer;
        Color randomColor = Color.GREEN;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("Please enter the total payment of your bill: $");
            payment = sc.nextDouble();

            int randomNumber = getRandomNumber();
            switch (randomNumber) {
                case 1:
                    randomColor = Color.RED;
                    break;
                case 2:
                    randomColor = Color.BLUE;
                    break;
                case 3:
                    randomColor = Color.YELLOW;
                    break;
                case 4:
                    randomColor = Color.GREEN;
                    break;
                case 5:
                    randomColor = Color.PURPLE;
                    break;
                case 6:
                    randomColor = Color.PINK;
                    break;
            }
            discountedPayment = randomColor.applyDiscount(payment);
            System.out.println("Your random color is " + randomColor + " which means with the discount you pay $" + discountedPayment);
            System.out.println("Is there another customer? ");
            anotherCustomer = sc.next();
        }while (anotherCustomer.equals("Yes"));
        System.out.println("Ok thanks, have a great day!");
        sc.close();
    }
    private static int getRandomNumber() {
        return (int) Math.ceil(Math.random() * 6);
    }
}

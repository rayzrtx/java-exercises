import java.util.Scanner;

/**
 * Created by raylinares on 11/14/16.
 */
public class Methods {
    public static void main(String[] args) {
            long number1, number2;
            Scanner addition = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            number1 = addition.nextLong();
            System.out.print("Please enter a second number: ");
            number2 = addition.nextLong();
            System.out.println("The sum of both numbers is " + addNumber(number1, number2));

            long number3, number4;
            Scanner subtraction = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            number3 = subtraction.nextLong();
            System.out.print("Please enter a second number to subtract: ");
            number4 = subtraction.nextLong();
            System.out.println("The new number is " + subtractNumber(number3, number4));

            long number5, number6;
            Scanner multiplication = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            number5 = multiplication.nextLong();
            System.out.print("Please enter a second number to multiply by: ");
            number6 = multiplication.nextLong();
            System.out.println("The two numbers multiplied together is equal to " + multiplyNumber(number5, number6));

            double number7, number8;
            Scanner division = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            number7 = division.nextDouble();
            System.out.print("Please enter a second number to divide by: ");
            number8 = division.nextDouble();
            System.out.println("The two numbers divided is equals to " + divideNumber(number7, number8));

            long number9, number10;
        Scanner modulus = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        number9 = modulus.nextLong();
        System.out.print("Please enter a second number: ");
        number10 = modulus.nextLong();
        System.out.println("The modulus of the two numbers is: " + findModulus(number9, number10));
    }
    private static long addNumber(long a, long b){
        return a + b;
    }
    private static long subtractNumber(long a, long b){
        return a - b;
    }
    private static long multiplyNumber(long a, long b){
        return a * b;
    }
    private static double divideNumber(double a, double b){
        return a/b;
    }
    private static long findModulus(long a, long b){
        return a % b;
    }

}

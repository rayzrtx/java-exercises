import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Validator {
    // this is the class with useful validation methods

    public static int getInt(String prompt) {
        Scanner sc = new Scanner(System.in);
        int userInput;

        System.out.println(prompt);

        try {
            userInput = sc.nextInt();
            sc.close();
            return userInput;
        } catch (InputMismatchException e) {
            return getInt(prompt);
        }

    }

    public static double getDouble(String prompt) {
        Scanner sc = new Scanner(System.in);
        double userDouble;

        System.out.println(prompt);

        try {
            userDouble = sc.nextDouble();
            return userDouble;
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            return getDouble(prompt);
        }
    }

    public static int getIntWithinRange(String prompt, int min, int max) {
        int userInput = getInt(prompt);

        try {
            if(userInput < min || userInput > max) {
                throw new InputMismatchException();
            }
            return userInput;
        } catch (InputMismatchException e) {
            return getIntWithinRange(prompt, min, max);
        }

    }

    public double getDoubleWithinRange(String prompt, double min, double max) {
        double userInput = getDouble(prompt);

        try {
            if(userInput < min || userInput > max) {
                throw new InputMismatchException();
            }
            return userInput;
        } catch (InputMismatchException e) {
            return getDoubleWithinRange(prompt, min, max);
        }
    }

    public static double getPositiveDouble(String prompt) {
        double userInput = getDouble(prompt);

        try {
            if(userInput <= 0) {
                throw new InputMismatchException();
            }
            return userInput;

        } catch (InputMismatchException e) {
            return getPositiveDouble(prompt);
        }
    }

    public static String getString(String prompt) {
        Scanner sc = new Scanner(System.in);
        String userInput;
        System.out.println(prompt);

        try {
            userInput = sc.nextLine();
            return userInput;
        } catch (NoSuchElementException e) {
            return getString(prompt);
        }
    }
}
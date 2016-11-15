import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){

        String userInput1;
        String userInput2;
        String userInput3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter only three words: ");
        userInput1 = sc.next();
        userInput2 = sc.next();
        userInput3 = sc.next();
        System.out.println("You entered ");
        System.out.println(userInput1);
        System.out.println(userInput2);
        System.out.println(userInput3);

        double length;
        double width;
        double area;
        double perimeter;
        String userAnswer;
        Scanner rectangle = new Scanner(System.in);

        do {
            System.out.print("Please enter the length of the classroom: ");
            length = rectangle.nextDouble();
            System.out.print("Please enter the width of the classroom: ");
            width = rectangle.nextDouble();
            area = length * width;
            perimeter = ((length + width) * 2);
            System.out.println("The area of the classroom is " + area);
            System.out.println("The perimeter of the classroom is " + perimeter);
            System.out.print("Would you like to keep measuring rooms? Y or N ");
            userAnswer = rectangle.next();
        }
        while (userAnswer.equals("Y"));
            System.out.println("Ok thanks, have a nice day!");
        }


}

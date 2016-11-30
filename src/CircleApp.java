import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by raylinares on 11/30/16.
 */
public class CircleApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        String anotherCircle;
        NumberFormat formatter = new DecimalFormat("#0.00");



        do {
            System.out.println("Please enter the radius of a circle: ");
            radius = input.nextDouble();
            Circle circle = new Circle(radius);  //needed in order to call methods in Circle class; radius is a constructor
            if (radius < 0){
                System.out.println("That entry is invalid. Please enter a number greater than zero. ");
                break;
            }
            circumference = circle.getCircumference();
            System.out.println("The circumference of the circle is " + formatter.format(circumference));
            area = circle.getArea();
            System.out.println("The area of the circle is " + formatter.format(area));
            System.out.println("");
            anotherCircle = Validator.getString("Is there another circle? y/n "); //validating that a string is entered
        } while (anotherCircle.equalsIgnoreCase("y"));
        input.close();
        System.out.println("Ok, thanks for checking. You built " + Circle.getNumberOfCircles() + " circles. Have a great day!");
    }
}

/**
 * Created by raylinares on 11/30/16.
 */
public class Circle {
    double radius;
    private static int numberOfCircles = 0;


    public Circle(double radius) {
        this.radius = radius;
        numberOfCircles ++; //for each new Circle (object), number is incremented
    }

    public double getCircumference(){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public double getArea(){
        double area =  Math.PI * (radius*radius);
        return area;
    }
    public static int getNumberOfCircles(){
        return numberOfCircles;
    }

}

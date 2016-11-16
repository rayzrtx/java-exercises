import java.util.Scanner;

/**
 * Created by raylinares on 11/15/16.
 */
public class StudentInfo {
    public static void main(String[] args) {
        String student1Name = "Bob";
        String student2Name = "Lucy";
        String student3Name = "Jimmy";
        int student1Age = 25;
        int student2Age = 31;
        int student3Age = 29;
        String student1Bio = " wants to learn programming because he enjoys building things and it is challenging.";
        String student2Bio = " wants to learn programming because she likes figuring out puzzles and trying to piece things together.";
        String student3Bio = " wants to learn programming because he is very curious on how things work behind the scenes and wants to make more money";
        String userNameResponse;
        String userContinueAnswer;
        Scanner students = new Scanner(System.in);
    do {
        System.out.print("Please enter a student name to obtain age and brief bio: ");
        userNameResponse = students.next();

        if (userNameResponse.equals(student1Name)) {
            System.out.println(student1Name + " is " + student1Age + "years old. " + student1Name + student1Bio);
        }
        else if (userNameResponse.equals(student2Name)) {
            System.out.println(student2Name + " is " + student2Age + "years old. " + student2Name + student2Bio);
        }
        else if (userNameResponse.equals(student3Name)) {
            System.out.println(student3Name + " is " + student3Age + "years old. " + student3Name + student3Bio);
        }
        else {
            System.out.println("No student in the class by that name.");
        }
        System.out.print("Would you like to check on another student? Y or N ");
        userContinueAnswer = students.next();
    }
    while (userContinueAnswer.equals("Y"));
        System.out.println("Ok thanks, have a nice day!");
    }
}

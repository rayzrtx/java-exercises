import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by raylinares on 11/28/16.
 */
public class StudentScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName;
        String lastName;
        int score;
        String anotherStudent;
        ArrayList<Student> students = new ArrayList<>(); //used to store all of the students info

        do {
            System.out.println("Please enter the student's first name: ");
            firstName = sc.next();
            if (firstName.equals("")){
                System.out.println("That entry is invalid. Please enter a valid name. ");
                break;
            }

            System.out.println("Please enter the student's last name: ");
            lastName = sc.next();
            if (lastName.equals("")){
                System.out.println("That entry is invalid. Please enter a valid name. ");
                break;
            }

            System.out.println("Please enter the student's score: ");
            score = sc.nextInt();
            if (score > 100 || score < 0){
                System.out.println("That entry is invalid. Please enter a valid score. ");
                break;
            }
            Student newStudent = new Student(firstName, lastName, score);
            students.add(newStudent);
            System.out.println("Would you like to enter another student? ");
            anotherStudent = sc.next();
        } while (anotherStudent.equals("Y"));

        students.sort(new Comparator<Student>() { //sorting array list
            @Override
            public int compare(Student student1, Student student2) {
                return student1.compareTo(student2);
            }
        });

        for (Student student : students){
            System.out.println(student.firstName + " " + student.lastName + " " + student.score);
        }
        sc.close();


    }
}

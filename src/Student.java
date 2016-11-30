/**
 * Created by raylinares on 11/28/16.
 */
public class Student implements Comparable<Student> { //used to implement Comparable class to compare and sort array list
    String firstName;
    String lastName;
    int score;

    public Student(String firstName, String lastName, int score) {  //use command n to auto generate
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    @Override
    public int compareTo(Student another) { //can only return 1, -1, or 0
        int lastNameComparison = lastName.compareTo(another.lastName); //compares last names
        if (lastNameComparison != 0){   //if last names are not the same, sort by last name
            return lastNameComparison;
        }
        return firstName.compareTo(another.firstName);  //if last names are the same, sort by first name
    }
}

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by raylinares on 11/30/16.
 */
public class ListMovies {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int category;


        System.out.println("Here are the categories of movies to choose from:");
        System.out.println("1. Horror");
        System.out.println("2. Comedy");
        System.out.println("3. Action");
        System.out.println("4. Drama");
        category = Validator.getIntWithinRange("Please select a category and all movies from that category will be displayed. ", 1, 4);



    }
}


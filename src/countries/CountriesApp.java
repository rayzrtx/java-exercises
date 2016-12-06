package countries;


import java.util.Scanner;
import java.io.IOException;

/**
 * Created by raylinares on 12/5/16.
 */
public class CountriesApp {
    public static void main(String[] args) throws IOException{


        Scanner input = new Scanner(System.in);
        int customerSelection;

        System.out.println("Please make a selection below.");
        System.out.println("1) To print a list of countries currently in the database ");
        System.out.println("2) To enter a new country into the database ");
        System.out.println("3) Exit ");
        customerSelection = input.nextInt();

        if (customerSelection == 1){
            try{
                CountriesTextFile.showCountry();
            }catch (IOException e){
                e.printStackTrace();
            }
        }else
            if (customerSelection == 2){
                try{
                    CountriesTextFile.saveCountry(input);
                }catch (IOException e){
                    e.printStackTrace();
                }
            }else
                if (customerSelection == 3){
                    System.out.println("Thanks for checking. Have a great day!");
                    System.exit(0);
                }






    }
}

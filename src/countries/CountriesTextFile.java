package countries;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;


/**
 * Created by raylinares on 12/5/16.
 */
public class CountriesTextFile {

    static String folder = "files";
    static String fileString = "countries.txt";

    public static void saveCountry(Scanner input) throws IOException {  //class adding user inputted country to list

        Path folderPath = Paths.get(folder);            //create folder if it doesn't exist yet
        if (Files.notExists(folderPath)) {
            Files.createDirectory(folderPath);
        }

        Path filePath = Paths.get(folder, fileString);  //create file if it doesn't exist yet
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }

        File countryListFile = filePath.toFile();       //to append to list instead of replace

        try {
            PrintWriter output = new PrintWriter(countryListFile);
            System.out.println("What is the name of the country you would like to add? ");
            String country = input.next();
            output.append(country + "\n");              //adding the country entered on a new line
            output.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
        public static void showCountry() throws IOException{
        ArrayList<String> countries;
            countries = fileToArray();
            for (String country : countries){
                System.out.println(country);
    }
    }
    public static ArrayList<String> fileToArray(){
        ArrayList<String> countries = new ArrayList<>();
        Path path = Paths.get(folder, fileString);
        File fl = path.toFile();

        try {
            FileReader fr = new FileReader(fl);
            BufferedReader inputReader = new BufferedReader(fr);

            String line = inputReader.readLine();
            while (line != null){
                countries.add(line);
                line = inputReader.readLine();
            }
            fr.close();
            inputReader.close();

            return countries;
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}





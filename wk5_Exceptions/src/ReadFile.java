/**
 *
 * @author Martijn
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    private static BufferedReader inFile;

    public static void main(String[] args) {

        readFile("C:\\Users\\bgnmh\\IdeaProjects\\owe5a\\wk5_Exceptions\\src\\chr1_GL383518v1_alt.fa");
    }



    public static void readFile (String bestand) {


            String line;
            inFile = new BufferedReader(new FileReader(bestand));
            while ((line = inFile.readLine()) != null) {
                System.out.println(line);
            }
            inFile.close();

    }
}

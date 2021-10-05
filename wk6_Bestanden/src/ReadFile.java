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

    public static void main(String[] args)  {

        String bestand = "C:\\Users\\bgnmh\\Documents\\chr1_GL383518v1_alt.fa";


            String line;
            inFile = new BufferedReader(new FileReader(bestand));
            while ((line = inFile.readLine()) != null) {
                System.out.println(line + "\n");
            }
            inFile.close();

    }
}

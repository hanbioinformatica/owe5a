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

        String bestand = "/home/martijn/IdeaProjects/owe5a/wk6_Bestanden/src/chr1_GL383518v1_alt.fa";

        try {
            String line;
            inFile = new BufferedReader(new FileReader(bestand));
            while ((line = inFile.readLine()) != null) {
                System.out.println(line + "\n");
            }
            inFile.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Bestand niet gevonden");
        } catch (IOException ioe) {
            System.out.println("Kan niet lezen in bestand");
        } catch (Exception e) {
            System.out.println("Onbekende fout: raadpleeg uw systeembeheerder");
        }
    }
}

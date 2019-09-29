import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class PokemonList {

    private static final String naam = "https://gist.githubusercontent.com/armgilles/194bcff35001e7eb53a2a8b441e8b2c6/raw/92200bc0a673d5ce2110aaad4544ed6c4010f687/pokemon.csv";

    public static void readFile(String bestand) {
        try {
            URL url = new URL(bestand);
            try (BufferedReader read = new BufferedReader(
                    new InputStreamReader(url.openStream()))) {
                String i;
                while ((i = read.readLine()) != null) {
                    System.out.println(i.split(",")[1]);
                    System.out.println("Attack:" + i.split(",")[5]);
                    System.out.println("Defense:" + i.split(",")[6]);
                }
            }
        } catch (IOException ioe) {
            System.out.println("Leesfout");
        }
    }


    public static void main(String[] args) {
        readFile(naam);
    }
}

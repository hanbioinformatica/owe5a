import java.util.ArrayList;

public class PokemonGO {

    public static void main(String[] args) {


        Pokemon p1 = new Pokemon("Pidgeotto");
        Pokemon p2 = new Pokemon("Sandshrew");
        Pokemon p3 = new Pokemon("Bulbasaur");

        p1.setLengte(70);


        p2.setLengte("90 inch");

        p3.setLengte(70.89f);
        p1.printInfo();
        p2.printInfo();
        p3.printInfo();

        ArrayList<Pokemon> al = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            al.add(new Pokemon(" Pokemon Object: " + Integer.toString(i)));
        }

    }
}

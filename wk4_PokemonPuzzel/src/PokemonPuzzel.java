/**
 * PokemonPuzzel Java code voor Kahoot! Week 4 objecten
 */

public class PokemonPuzzel {

    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Ivysaur", 60, 62);
        Pokemon p2 = new Pokemon("Charizard", 78, 84);
        Pokemon p3 = new Pokemon("Charizard", 78, 130);
        System.out.println(" 1." + Pokemon.aantal);
        System.out.println(" 2." + p1.getNaam());
        System.out.println(" 3." + p2.getAttack());
        String s1 = new String("Charizard");
        System.out.println(" 4." + (p2.getNaam() == s1));
        System.out.println(" 5." + (p2.getAttack() == p3.getAttack()));
        Pokemon p4 = p1;
        System.out.println(" 6." + (p1 == p4));
        p4.setNaam("Sandslash");
        System.out.println(" 7." + p1.getNaam());
        System.out.println(" 8." + p1.getNaam());
        for (int i = 0; i < 10; i++) {
            new Pokemon();
        }
        System.out.println(" 9." + Pokemon.aantal);
        System.out.println("10." + p1.aantal);
    }
}

class Pokemon {

    public static int aantal = 0;
    private String naam;
    private int attack, defense;

    public Pokemon() {
        this("Bulbasaur", 45, 49);
    }

    public Pokemon(String n, int a, int d) {
        this.naam = n;
        this.attack = a;
        this.defense = d;
        aantal++;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getAttack() {
        return attack;
    }
}
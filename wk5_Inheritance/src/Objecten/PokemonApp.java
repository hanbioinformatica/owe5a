package Objecten;

public class PokemonApp {

    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        Pokemon p2 = new Pokemon("Sandflash", 82, 32);
        System.out.println(Pokemon.aantal);
    }

}


class Pokemon {

    // Globale variabelen, public van buiten de class benaderbaar en private alleen in de class benaderbaar
    public static int aantal = 0;  // class variabele - door static
    private String naam;  // instance variabelen
    private int id, attack, defense; // instance variabelen

    // constructor (overloading) die aangeroepen wordt als er geen parameters worden meegegeven
    public Pokemon() {
        this("Bulbasaur", 45, 49);
    }

    // constructor (overloading) die aangeroepen wordt als er wel parameters worden meegegeven
    public Pokemon(String n, int a, int d) {
        this.naam = n;
        this.setAttack(a);
        this.defense = d;
        aantal++;
        id = aantal;
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

    public void setAttack(int a){
        if (a > 1000) {
            this.attack = 1000;
        } else {
            this.attack = a;
        }
    }

    public int getId() {
        return id;
    }

}
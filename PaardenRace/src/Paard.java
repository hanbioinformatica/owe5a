/**
 * Paard class
 *
 * @author Martijn van der Bruggen
 * (c) Hogeschool van Arnhem en Nijmegen
 * @version alpha release
 */

import java.awt.*;
import java.util.Random;

public class Paard {

    private static int aantal = 0;  //totaal aantal paarden
    Random random = new Random();
    private int x, paardNummer; //te lezen als x en y positie
    private String naam;  //naam van het paard
    private Color kleur;  //kleur van de streep/paard
    private Image plaatje;


    /**
     * Constructor voor Paard, overloaded en zonder images
     * en een default kleur
     */
    Paard(String naam) {
        this.naam = naam;
        this.kleur = Color.orange;
        this.x = 0;
        this.paardNummer = ++aantal;
    }

    /* Constructor voor Paard overloaded*/
    Paard(String naam, Color kleur, Image plaatje) {
        this(naam);
        this.kleur = kleur;
        this.plaatje = plaatje;
    }

    public String getNaam() {
        return this.naam;
    }

    public int getAfstand() {
        return this.x;
    }

    public int getPaardNummer() {
        return this.paardNummer;
    }

    public Color getKleur() {
        return this.kleur;
    }

    public Image getImage() {
        return this.plaatje;
    }

    /**
     * Laat het paard een willekeurig aantal posities lopen
     * Verhoog de x met een waarde tussen 0 en 11
     */
    public void loop() {
        this.x = this.x + random.nextInt(11);
        System.out.println(this.naam + " is op positie " + this.x);
    }
}


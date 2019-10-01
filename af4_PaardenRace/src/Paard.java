/**
 * Paard class
 *
 * @author Martijn van der Bruggen
 * @version alpha release
 * (c) Hogeschool van Arnhem en Nijmegen
 */

import java.util.Random;

public class Paard {

    Random random = new Random();   // Instance voor willekeurig getal
    private static int aantal = 0;  // totaal aantal paarden
    private int x, paardNummer;     // te lezen als x en y positie
    private String naam;            // naam van het paard
    private Color kleur;            // kleur van de streep/paard
    private Image plaatje;


    /**
     * Constructor voor Paard, overloaded en zonder images
     * en een default kleur
     * @param naam van het paard
     */
    Paard(String naam) {
        this.naam = naam;
        this.kleur = Color.orange;
        this.x = 0;
        this.paardNummer = ++aantal;
    }

    /**
     * @param kleur de kleur afkomstig uit de Class Color
     * @param naam van het paard
     * @param plaatje image voor een paard van de Class Image
     * Constructor voor Paard overloaded*/
    Paard(String naam, Color kleur, Image plaatje) {
        this(naam);
        this.kleur = kleur;
        this.plaatje = plaatje;
    }

    /**
     * @return naam van het paard opgegeven bij constructie
     */
    public String getNaam() {
        return this.naam;
    }

    /**
     * @return afgelegde afstand in pixels
     */
    public int getAfstand() {
        return this.x;
    }

    /**
     * @return nummer van het paard
     */
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


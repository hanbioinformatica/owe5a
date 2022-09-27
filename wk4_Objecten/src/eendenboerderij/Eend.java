package eendenboerderij;

public class Eend {

//drie instance variabelen
    private String naam;
    private String kleur;
    private double gewicht;
    public static double maxGewicht = 70; // class variabele
    private static int aantalPoten = 2;  // class variabele

    // Constructor = aanmaken van het object
    // Exact de naam van de class en geen return-type
    public Eend(String n, double g, String k){
        setNaam(n);
        setGewicht(g);
        setKleur(k);
    }

    public Eend (String naam){
        this(naam,37,"UNKNOWN");
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double pgewicht) {
        if (pgewicht>maxGewicht){
            System.out.println("Deze eend is te zwaar!");
            gewicht = 70;
        } else {
        gewicht = pgewicht;
        }
    }

    public String toString(){
        return "Ik ben een eend en mijn naam is "+naam+ " mijn gewicht is " +gewicht+" en mijn kleur is "+kleur;
    }


}

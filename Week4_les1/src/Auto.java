public class Auto {

    public static final int MAXSNELHEID = 130;
    public static int aantalAutoos = 0;

    private String kleur;

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public String getEigenaar() {
        return eigenaar;
    }

    public void setEigenaar(String eigenaar) {
        this.eigenaar = eigenaar;
        aantalAutoos++;
    }

    private String eigenaar;
    private int snelheid;

    void setSnelheid(int i){
        if (i>MAXSNELHEID){
            System.out.println("Dat mag niet, limiet op 130");
            snelheid = MAXSNELHEID;
        } else {
        snelheid = i;
        }
    }

    int getSnelheid() {
        return snelheid;
    }

    void printAuto(){
        System.out.println(" Auto van "+eigenaar+" kleur "+kleur + " met een snelheid "+snelheid);
    }

}

package Kinderboerderij;

public abstract class Dier {


    private String naam; // private globale instance variabele
    private int stal; // private globale instance variabele

    public final String getNaam() {
        return naam;
    }


    public Dier(String naam, int stal) {
        this.naam = naam;
        this.stal = stal;
    }

    public Dier() {
        this.naam = "Dier";
        this.stal = 0;
    }


    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getStal() {
        return stal;
    }

    public void setStal(int stal) {
        this.stal = stal;
    }

    abstract void maakGeluid();

    @Override
    public String toString() {
        return "Dier{" +
                "naam='" + naam + '\'' +
                ", stal=" + stal +
                '}';
    }
}

// extends --> IS-EEN
public class Auto extends Voertuig {

    private String kenteken;

    public String getKenteken() {
        return kenteken;
    }

    public void setKenteken(String kenteken) {
        this.kenteken = kenteken;
    }

    public String toString() {
        return "Ik ben een auto " + kenteken + " met een snelheid van " + getSnelheid();
    }

    @Override
    public void setSnelheid(int snelheid) {

    }
}

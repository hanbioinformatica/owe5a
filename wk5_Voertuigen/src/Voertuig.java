public abstract class Voertuig {

    private static int maxSnelheid = 100;
    private int snelheid = 0;

    public static void setMaxSnelheid(int maxSnelheid) {
        Voertuig.maxSnelheid = maxSnelheid;
    }

    public int getSnelheid() {
        return snelheid;
    }

    ;

    public abstract void setSnelheid(int snelheid);


}

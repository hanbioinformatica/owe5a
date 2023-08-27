/**
 *
 */
public class Fiets extends Voertuig implements Stuurbaar {

    public Fiets() {
        setMaxSnelheid(50);
    }

    public int getSnelheid() {


        return super.getSnelheid();
    }


    /**
     *
     * @param snelheid dit is de snelheid in KM's
     */
    public void setSnelheid(int snelheid) {

    }

    /**
     * methode voor het sturen naar links
     */
    @Override
    public void naarLinks() {

    }

    /**
     *
     */
    @Override
    public void naarRechts() {

    }
}

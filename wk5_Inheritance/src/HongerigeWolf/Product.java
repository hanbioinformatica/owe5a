package HongerigeWolf;



/**
 * JavaDoc commentaar
 * @author MvdB
 * @Copyright rwhjre
 */
public abstract class Product {

    // vars private
    protected double prijs =0;
    protected String naam;
    public float datum;
    int grootte; //default access modifier of friendly


    /**
     *
     * @return rehirewhjrt4w5rtkjkjre
     */
    public String getNaam() {
        return naam;
    }

    /**
     *
     * @param naam dit zet de naam van de student
     */
    public void setNaam(String naam) {
        this.naam = naam;
    }

    /**
     *
     * @return is iets leverbaar
     */
    public Status getStatus(){
        return Status.Leverbaar;
    }

    /**
     *
     * @return de prijs van een product in euro
     */
    public double getPrijs() {
        return prijs;
    }
    // abstracte methode die afdwingt dat IEDER subclass een prijs MOET hebben

    /**
     *
     * @param prijs de prijs van een product
     */
    public abstract void setPrijs(double prijs);


}


package HongerigeWolf;

public abstract class Product {

    // vars private
    protected double prijs =0;
    protected String naam;
    public float datum;
    int grootte; //default access modifier of friendly
    public static final double PI = 3.1415;

    // methodes public
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getPrijs() {
        return prijs;
    }
    // abstracte methode die afdwingt dat IEDER subclass een prijs MOET hebben
    public abstract void setPrijs(double prijs);


}


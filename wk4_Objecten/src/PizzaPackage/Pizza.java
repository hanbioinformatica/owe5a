package PizzaPackage;

public class Pizza {

    // attributen (variabelen)
    private double prijs;
    private int diameter;
    private String naam;
    static int maxDiameter = 40;

    // constructor
    // default no-args do nothing
    public Pizza(){
        System.out.println("Call van constr");
    }

    public Pizza (String naam,double prijs, int diameter){
        setNaam(naam);
        setPrijs(prijs);
        setDiameter(diameter);
    }

    public double getPrijs() {
        return prijs;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        if (diameter>maxDiameter){
            this.diameter=maxDiameter;
        } else {
           this.diameter = diameter;}
        }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    // methodes (functies)
    // instance methode
    public void getInfo(){
        System.out.println("Ik ben een pizza: "
        +naam+" met een diameter "+diameter+
                "cm prijs "+prijs);
    }

    public void setPrijs(double p){
        if (p>20){
            System.out.println("Veel te duur!");
        } else {
            prijs = p;
        }
    }

}

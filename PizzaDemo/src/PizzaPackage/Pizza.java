package PizzaPackage;

import Product.Product;

public  class Pizza extends Product {

    // attributen (variabelen)

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
        try {
            setPrijs(prijs);
        } catch (ProductTeDuur e) {
            e.printStackTrace();
        }
        setDiameter(diameter);
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

    @Override
    public void setPrijs(double p) throws ProductTeDuur {

    }
}

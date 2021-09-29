package PizzaPackage;

public class Product {
    private double prijs;

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double p){
        if (p>20){
            System.out.println("Veel te duur!");
        } else {
            prijs = p;
        }
    }
}

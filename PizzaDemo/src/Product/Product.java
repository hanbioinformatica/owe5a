package Product;

import PizzaPackage.ProductTeDuur;

public abstract class Product {

    protected double prijs;

    public double getPrijs() {
        return prijs;
    }

    public abstract void setPrijs(double p) throws ProductTeDuur;

}

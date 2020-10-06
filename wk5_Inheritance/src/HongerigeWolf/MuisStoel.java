package HongerigeWolf;

public class MuisStoel extends Product {

    public void setPrijs(double prijs) {
        if (prijs > 1000) {
            this.prijs = prijs;
        } else {this.prijs = 1000;}
    }

}

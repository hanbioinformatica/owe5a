package HongerigeWolf;

public class MousePad extends Product {


    public void setPrijs(double prijs) {
        if (prijs > 10) {
            this.prijs = prijs;
        } else {this.prijs = 10;}

    }



}

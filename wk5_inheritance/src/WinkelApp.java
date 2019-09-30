public class WinkelApp {

    public static void main(String[] args) {
        Boek b1 = new Boek("Learning Java", 782);
        Laptop l1 = new Laptop("Dell Latitude", true);
        Boek b2 = new Boek("Starting C#", 7032);
        b1.setPrijs(70.89f);
        l1.setPrijs(1298.99f);
        System.out.println(b1);
        System.out.println(l1);
    }
}


class Product {

    private float prijs;
    protected String naam;
    private int levertijd;
    private static float MAXPRIJS = 1000f;

    public float getPrijs() {
        return prijs;
    }

    public void setPrijs(float prijs) {
        if (prijs > MAXPRIJS) {
            this.prijs = MAXPRIJS;

        } else {
            this.prijs = prijs;
        }
    }

    public String toString() {
        return "Propduct *" + naam + "* prijs: " + prijs;
    }
}

class Boek extends Product {

    public Boek(String naam, int bladzijden) {
        super.naam = naam;
        this.bladzijden = bladzijden;
    }

    private int bladzijden;
}

class Laptop extends Product {

    public Laptop(String naam, boolean HDD) {
        super.naam = naam;
        this.HDD = HDD;
    }

    public String toString(){
        return super.toString()+"Ik ben een laptop";

    }

    private boolean HDD;
}


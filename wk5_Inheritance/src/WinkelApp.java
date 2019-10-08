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

    public String toString(){
        return super.toString()+" Product "+this.naam+" met prijs "+this.prijs;
    }

}

class Boek extends Product {

    private int bladzijden;
    public Boek(String naam, int bladzijden) {
        super.naam = naam;
        this.bladzijden = bladzijden;
    }

    public String toString(){
        return super.toString()+"Ik ben een boek "+naam;
    }


}

class Laptop extends Product {
    private boolean HDD;

    public Laptop(String naam, boolean HDD) {
        super.naam = naam;
        this.HDD = HDD;
    }


}


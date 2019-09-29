public class Pokemon {

    String type;
    private String naam;
    private String lengte;

    private int leeftijd = 1000;

    // Constructor voor te maken object Pokemon
    public Pokemon(String n) {
        System.out.println("Object maken met de naam " + n);
        this.naam = n;
    }

    public String getLeeftijd() {
        if (leeftijd > 20) {
            return "oud";
        } else {
            return "Jong";
        }
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void printInfo() {
        System.out.println("Ik ben " + naam + " met een lengte van " + lengte);
    }


    public void setLengte(String l) {
        lengte = l;
    }

    // overloaded methode setLengte
    public void setLengte(int l) {
        if (l > 40 && l < 3000) {
            lengte = Integer.toString(l) + "cm";
        } else {
            System.out.println("Geen juiste lengte");
        }
    }

    // overloaded methode setLengte
    public void setLengte(float l) {
        if (l > 40 && l < 3000) {
            lengte = Float.toString(l) + " gebroken getal";
        } else {
            System.out.println("Geen juiste lengte");
        }
    }

}

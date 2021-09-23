package PizzaPackage;

public class PizzaApp {

    public static void main(String[] args) {
        Pizza p1;  // declaratie van een referentie
                   // aan een object Pizza
        p1 = new Pizza("Fungi",997.50,35);  //constructie/init
        Pizza p2 = new Pizza("Quattro Stagioni",7.50,15);
        Pizza p3 = new Pizza("Salami",8.80,9000);

        p1.getInfo();
        p2.getInfo();
        p3.getInfo();

        System.out.println(Pizza.maxDiameter);

    }

}

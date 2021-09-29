package PizzaPackage;

public class PizzaApp {

    public static void main(String[] args) {
        Pizza p1;  // declaratie van een referentie
        // aan een object Pizza
        p1 = new Pizza("Fungi", 997.50, 35);  //constructie/init
        Pizza p2 = new Pizza("Quattro Stagioni", 7.50, 15);
        Pizza p3 = new Pizza("Salami", 8.80, 9000);

        p1.getInfo();
        p2.getInfo();
        p3.getInfo();

        //System.out.println(Pizza.maxDiameter);
        //int array decl //initialisatie
        Pizza[] pizza_array = new Pizza[5];

        pizza_array[0]=p1;
        pizza_array[1]=p2;
        pizza_array[2]=p3;
        pizza_array[3]=new Pizza("Kaas",8.99,25);
        pizza_array[4]=new Pizza("Hawaii",9.99,35);


        for (int i=0;i<pizza_array.length;i++){
            pizza_array[i].getInfo();
        }

        for (Pizza i:pizza_array){
            i.getInfo();
        }






    }

}



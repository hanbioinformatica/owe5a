/**
 *  static vs. non static - class vs. instance
 *  public vs. private
 *
 *  constructor
 *  default no-args do nothing
 *  
 *  generate getters, setters and constructor
 *  array of primitive or objects
 */


public class Main {

    public static void main(String[] args) {

        Auto a1= new Auto();
        Auto a2 = new Auto();

        a1.setEigenaar("Cos");
        a1.setKleur("bruin");
        a1.setSnelheid(140);

        a2.setEigenaar("David");
        a2.setKleur("blauw");
        a2.setSnelheid(700);

        a1.printAuto();
        a2.printAuto();

        for (int i=0;i<100;i++){
            Auto a = new Auto();
            a.setEigenaar("rewhjrew");
        }
        System.out.println("Aantal auto's:"+Auto.aantalAutoos);

    }
}


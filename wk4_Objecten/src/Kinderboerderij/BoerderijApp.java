package Kinderboerderij;

public class BoerderijApp {


    public static void main(String[] args) {
        Eend e1 = new Eend("Kwik",1);
        Konijn k1 = new Konijn("Flappie",2);

        System.out.println(e1);
        System.out.println(k1);

        e1.maakGeluid();


    }


}

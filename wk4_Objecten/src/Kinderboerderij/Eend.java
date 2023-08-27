package Kinderboerderij;

public class Eend extends Dier {
    public Eend(String naam, int stal) {
        super(naam, stal);
    }


    @Override
    public void maakGeluid() {
        System.out.println("kwaak");
    }


}

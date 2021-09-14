package eenvoudigIfs;

public class BasisIf {
    public static void main(String[] args) {
        int i = 7;
        if (i == 7) {
            System.out.println("zeven");
        } else {
            System.out.println("Geen zeven");
        }
        System.out.println((i==7)?"zeven":"geen zeven");
    }


}

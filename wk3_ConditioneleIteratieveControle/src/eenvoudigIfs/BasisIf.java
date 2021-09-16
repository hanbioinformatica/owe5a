package eenvoudigIfs;

import java.util.Random;

public class BasisIf {

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int getal = random.nextInt(100);
            System.out.println(getal);
        }

    }

}



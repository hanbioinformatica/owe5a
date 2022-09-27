package eenvoudigIfs;

import javax.swing.*;
import java.util.Random;

public class Demo {

    public static void main(String[] args) {
        Random rand = new Random();
        int getal = rand.nextInt(100);
        System.out.println(getal);
        boolean eind = false;
        while (eind==false) {
            String bericht = JOptionPane.showInputDialog(null);
            System.out.println(bericht);
            int geraden = Integer.parseInt(bericht);
            if (getal == geraden) {
                JOptionPane.showMessageDialog(null, "Goed!");
                eind = true;
            } else if (geraden < getal) JOptionPane.showMessageDialog(null, "Hoger");
            else JOptionPane.showMessageDialog(null, "Lager");
        }
    }
}

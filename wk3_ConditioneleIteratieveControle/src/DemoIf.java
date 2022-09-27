import javax.swing.*;
import java.util.Random;

public class DemoIf {
    public static void main(String[] args) {
        Random rand = new Random();
        boolean doorgaan = true;
        while (doorgaan){
            int willekeurigGetal = rand.nextInt(100);
            System.out.println(willekeurigGetal);
            boolean geraden = false;
            while (geraden==false) {
                String strgetal = JOptionPane.showInputDialog(null);
                int i = Integer.parseInt(strgetal);
                if (i == willekeurigGetal) {
                    System.out.println("geraden!");
                    geraden = true;
                } else if (i > willekeurigGetal) {
                    System.out.println("Lager");
                } else {
                    System.out.println("Hoger");
                }
            }
            String wilJeDoorgaan = JOptionPane.showInputDialog("Wil je doorgaan?");
            if (wilJeDoorgaan.equals("nee")){
                doorgaan = false;
            }
        }
    }

}

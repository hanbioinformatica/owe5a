import javax.swing.*;

public class DemoGUI {

    static int i;  // globale variabele

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Geef wat tekst");
        System.out.println(s);
        System.out.println(iets());


        float f = 7.3F;
        double x = 7.3;
        boolean b = true;

        int r = 832243;
        byte z = -126;


    }

    public static String iets(){
        return "Hello";
    }

}

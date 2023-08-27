import javax.swing.*;

public class DemoEx {
    public static void main(String[] args) {
        try {
            System.out.println(getGetal());
        } catch (NumberFormatException nfe) {
        }
    }

    public static int getGetal() {
        int i = 0;
        boolean juistGetal = false;
        while (!juistGetal) {
            String s1 = JOptionPane.showInputDialog(null);
            i = Integer.parseInt(s1);
            juistGetal = true;

        }
        return i;
    }

}

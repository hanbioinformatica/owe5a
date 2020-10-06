import javax.swing.*;

public class FormGUI {
    private JPanel panel1;
    private JTextPane textPane1;
    private JSlider slider1;
    private JList list1;
    private JTree tree1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("FormGUI");
        frame.setContentPane(new FormGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

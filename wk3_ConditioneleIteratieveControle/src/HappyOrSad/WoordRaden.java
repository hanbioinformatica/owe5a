package HappyOrSad;

/**
 *
 * @author Martijn
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WoordRaden extends JFrame implements ActionListener {

    private JTextField field1;
    private JLabel label1;
    private JButton button1;

    public static void main(String[] args) {
        WoordRaden getalRaden = new WoordRaden();
        getalRaden.setSize(220, 150);
        getalRaden.createGUI();
        getalRaden.setVisible(true);
    }

    public void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        button1 = new JButton("klik");
        button1.addActionListener(this);
        label1 = new JLabel("Raad het juiste woord!");
        field1 = new JTextField(10);
        window.add(field1);
        window.add(button1);
        window.add(label1);

    }

    public void actionPerformed(ActionEvent event) {
        String woord = field1.getText();
        if ("hello"==woord) {
            JOptionPane.showMessageDialog(null, "Goed!");
        } else {
            JOptionPane.showMessageDialog(null, "Niet het goede woord!");
        }

    }
}

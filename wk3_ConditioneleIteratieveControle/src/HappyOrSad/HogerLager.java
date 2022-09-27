/*
 * (c) Martijn van der Bruggen
 * Hogeschool van Arnhem en Nijmegen
 */
package HappyOrSad;

/**
 *
 * @author Martijn van der Bruggen
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class HogerLager extends JFrame implements ActionListener {

    private Random random;
    private JTextField field1;
    private JLabel label1;
    private JButton button1;
    private int getal = 0;

    public static void main(String[] args) {
        HogerLager getalRaden = new HogerLager();
        getalRaden.setSize(120, 150);
        getalRaden.createGUI();
        getalRaden.setVisible(true);
    }

    public void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        button1 = new JButton("Hoger/Lager?");
        button1.addActionListener(this);
        label1 = new JLabel("Hoger of Lager!");
        field1 = new JTextField(10);
        window.add(field1);
        window.add(button1);
        window.add(label1);
        random = new Random();
        getal = random.nextInt(100) + 1;
    }

    public void actionPerformed(ActionEvent event) {
        int i = Integer.parseInt(field1.getText());

        if (i > getal) {
            label1.setText("Lager!");
        } else if (i < getal) {
            label1.setText("Hoger");
        } else {
            label1.setText("Goed!");
        }
    }
}

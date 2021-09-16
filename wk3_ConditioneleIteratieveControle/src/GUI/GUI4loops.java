package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI4loops extends JFrame implements ActionListener {

    JTextField field; //declaratie van een tekstveld
    JLabel label;
    JButton button1;  // declaratie van button
    JPanel panel; // declaratie van een panel om op te tekenen
    Container window;

    public static void main(String[] args) {
        GUI4loops frame = new GUI4loops();
        frame.setSize(400,400);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        window = getContentPane();
        window.setBackground(Color.CYAN);
        window.setLayout(new FlowLayout());

        field = new JTextField("Typ hier iets");  // initialisatie
        window.add(field); // plaatsen van het tekstveld in de container(window)
        field.setBackground(Color.magenta);

        button1 = new JButton("button1");  // init button
        window.add(button1);  // plaats op window
        button1.addActionListener(this); // koppelen actionlistener aan button

        label = new JLabel ("Invoer");
        window.add(label);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI4ifs extends JFrame implements ActionListener {

    int teller = 0;

    JTextField field; //declaratie van een tekstveld
    JLabel label;
    JButton button1, button2;  // declaratie van button
    JPanel panel; // declaratie van een panel om op te tekenen

    public static void main(String[] args) {
        GUI4ifs frame = new GUI4ifs();
        frame.setSize(400,400);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setBackground(Color.CYAN);
        window.setLayout(new FlowLayout());



        field = new JTextField("Typ hier iets");  // initialisatie
        window.add(field); // plaatsen van het tekstveld in de container(window)
        field.setBackground(Color.magenta);

        button1 = new JButton("button1");  // init button
        window.add(button1);  // plaats op window
        button1.addActionListener(this); // koppelen actionlistener aan button

        button2 = new JButton("button2");  // init button
        window.add(button2);  // plaats op window
        button2.addActionListener(this); // koppelen actionlistener aan button

        label = new JLabel ("Invoer");
        window.add(label);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        teller++;
        System.out.println(teller);
        System.out.println("Actie!");
        if (e.getSource()==button1){
            System.out.println("Button1");
            button1.setText("kruisje");
            button1.setEnabled(false);
        } else {
            System.out.println("Button2");
            if (field.getText().equals("hello")){
                System.out.println("Er staat hello");
            }
            else{
                System.out.println("Er staat geen hello");
            }
        }



    }
}

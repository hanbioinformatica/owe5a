import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUI extends JFrame implements ActionListener {

    JTextField field; //declaratie van een tekstveld
    JButton button;  // declaratie van button

    public static void main(String[] args) {
        MyGUI frame = new MyGUI();
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

        button = new JButton("Klik");  // init button
        window.add(button);  // plaats op window
        button.addActionListener(this); // koppelen actionlistener aan button

    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        field.setText("Hello World!");
        button.setBackground(Color.blue);
        System.out.println("Actie ");
    }
}

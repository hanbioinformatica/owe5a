import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUI extends JFrame implements ActionListener {

    JTextField field; //declaratie van een tekstveld
    JButton button;  // declaratie van button
    JPanel panel; // declaratie van een panel om op te tekenen

    public static void main(String[] args) {
        MyGUI frame = new MyGUI();
        frame.setSize(400, 400);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
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

        panel = new JPanel(); // init panel
        panel.setPreferredSize(new Dimension(300, 300));
        panel.setBackground(Color.YELLOW);
        window.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Graphics paper = panel.getGraphics();
        paper.setColor(Color.RED);
        paper.drawLine(10, 10, 100, 100);
        paper.setColor(Color.BLACK);
        paper.fillOval(200, 200, 20, 20);
        field.setText("Hello World!");
        button.setBackground(Color.blue);
        System.out.println("Actie ");

    }
}

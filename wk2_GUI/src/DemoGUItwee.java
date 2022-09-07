import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoGUItwee extends JFrame implements ActionListener {

    JTextField field1; //declaratie van een JTextField Object
    JButton button1;
    JPanel panel;

    public static void main(String[] args) {
        DemoGUItwee frame = new DemoGUItwee();
        frame.setSize(400, 400);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setBackground(Color.CYAN);
        window.setLayout(new FlowLayout());
        field1 = new JTextField("onzin");  // initialisatie van field1
        window.add(field1);  // toevoegen aan het window Object
        button1 = new JButton("Klik op mij!");
        button1.addActionListener(this);  //koppelen van button aan actionListener methode
        window.add(button1);
        panel = new JPanel(); //initialisatie van een panel
        panel.setPreferredSize(new Dimension(300,300));
        panel.setBackground(Color.GREEN);
        window.add(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Graphics paper = panel.getGraphics();
        paper.setColor(Color.red);
        paper.drawOval(100,100,50,50);
        paper.setColor(Color.PINK);
        paper.fillOval(200,200,70,70);

        field1.setText("Hello World!");
        field1.setBackground(Color.yellow);
        button1.setBackground(Color.BLUE);

    }
}

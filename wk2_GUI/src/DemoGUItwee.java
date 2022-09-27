import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoGUItwee extends JFrame implements ActionListener {

    JTextField field1; //declaratie van een JTextField Object
    JButton button1, button2;
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
        button2 = new JButton("Of klik op mij! Button2");
        button2.addActionListener(this);
        window.add(button1);
        window.add(button2);
        panel = new JPanel(); //initialisatie van een panel
        panel.setPreferredSize(new Dimension(300,300));
        panel.setBackground(Color.GREEN);
        window.add(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Graphics paper = panel.getGraphics();
        System.out.println(e.getSource());
        if (e.getSource()==button1) {
            paper.setColor(Color.red);
            paper.drawOval(100, 100, 50, 50);
            paper.setColor(Color.PINK);
            paper.fillOval(200, 200, 70, 70);

            field1.setText("Hello World!");
            field1.setBackground(Color.yellow);
            button1.setBackground(Color.BLUE);
        } else {
            paper.setColor(Color.blue);
            paper.drawOval(10, 70, 20, 50);
            paper.setColor(Color.green);
            paper.fillOval(20, 20, 7, 70);

            field1.setText("rehwrewhjrew!");
            field1.setBackground(Color.orange);
            button1.setBackground(Color.red);
        }

    }
}

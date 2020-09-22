package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUIbuttons extends JFrame implements ActionListener {

    private JTextField textField;
    private JButton button1, button2, button3;
    private JLabel label;


    public static void main(String[] args) {
        MyGUIbuttons frame = new MyGUIbuttons();
        frame.setSize(200, 200);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        window.setBackground(Color.LIGHT_GRAY);
        textField = new JTextField("Hello World!");
        window.add(textField);
        button1 = new JButton("Een");
        button2 = new JButton("Twee");
        button3 = new JButton("Derde button");

        label = new JLabel("Ik ben een label");
        label.setPreferredSize(new Dimension(100,100));
        label.setBackground(Color.GREEN);
        window.add(label);
        window.add(button1);
        window.add(button2);
        window.add(button3);
        button1.setPreferredSize(new Dimension(80, 80));
        button2.setPreferredSize(new Dimension(80, 80));
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button1) {
            label.setText("Button 1");
            textField.setBackground(Color.CYAN);
        } else if (actionEvent.getSource()== button2) {
            label.setText("Button 2");
            textField.setBackground(Color.BLUE);
        } else {
            label.setText("Button 3 is aangeklikt");
            textField.setBackground(Color.ORANGE);
        }

    }
}
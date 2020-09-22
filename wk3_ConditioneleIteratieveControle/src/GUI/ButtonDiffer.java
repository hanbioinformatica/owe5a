package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDiffer extends JFrame implements ActionListener {
    JButton button1;
    JLabel label;
    JTextField textField;

    public static void main(String[] args) {
        ButtonDiffer frame = new ButtonDiffer();
        frame.setSize(200, 200);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        window.setBackground(Color.LIGHT_GRAY);
        button1 = new JButton("Een");
        label = new JLabel("Ik ben een label");
        textField = new JTextField("hello");
        window.add(label);
        window.add(textField);
        window.add(button1);

        button1.setPreferredSize(new Dimension(80, 80));
        button1.addActionListener(this);


    }


    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button1) {
            label.setText("Button 1");
            String s1 = textField.getText();
            if (s1.equals("Hello")) {
                JOptionPane.showMessageDialog(this, "Ze zijn gelijk");
            } else {
                JOptionPane.showMessageDialog(this, "Ongelijk");
            }
        }

    }
}

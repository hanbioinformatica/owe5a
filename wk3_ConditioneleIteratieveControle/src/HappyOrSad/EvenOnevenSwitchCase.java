package HappyOrSad;

/**
 *
 * @author Martijn
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class EvenOnevenSwitchCase extends JFrame implements ActionListener {

    private JTextField field1;
    private JLabel label1;
    private JButton button1;

    public static void main(String[] args) {
        EvenOnevenSwitchCase getalRaden = new EvenOnevenSwitchCase();
        getalRaden.setSize(120, 150);
        getalRaden.createGUI();
        getalRaden.setVisible(true);
    }

    public void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        button1 = new JButton("Press me");
        button1.addActionListener(this);
        label1 = new JLabel("even of oneven");
        field1 = new JTextField(10);
        window.add(field1);
        window.add(button1);
        window.add(label1);

    }

    public void actionPerformed(ActionEvent event) {
        int i = Integer.parseInt(field1.getText());

        switch (i%2) {
            case 0:

                System.out.println("Even");
                label1.setText("Even");
                break;
            case 1:
                System.out.println("Oneven");
                label1.setText("Oneven");
                break;
                
        }


    }
}

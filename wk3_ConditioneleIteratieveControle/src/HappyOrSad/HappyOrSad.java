/*
 * (c) Martijn van der Bruggen
 * Hogeschool van Arnhem en Nijmegen
 */
package HappyOrSad;

// This program uses 2 graphics files
// These are referred to in the body of the program
// They must be at the root of the C drive
// Suitable files are present in this folder
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HappyOrSad extends JFrame implements ActionListener {

    private JButton happyButton, sadButton, extraButton;
    private JPanel panel;
    private ImageIcon happyImage, sadImage, javaImage;

    public static void main(String[] args) {
        HappyOrSad demo = new HappyOrSad();
        demo.setSize(250, 280);
        demo.createGUI();
        demo.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(Color.white);
        window.add(panel);

        happyButton = new JButton("happy");
        window.add(happyButton);
        happyButton.addActionListener(this);

        sadButton = new JButton("sad");
        window.add(sadButton);
        sadButton.addActionListener(this);
        extraButton = new JButton("extra");
        window.add(extraButton);
        extraButton.addActionListener(this);


        String p = "/home/martijn/IdeaProjects/owe5a/wk3_ConditioneleIteratieveControle/src/HappyOrSad/";
        happyImage = new ImageIcon(p + "happy.jpg");
        sadImage = new ImageIcon(p + "sad.jpg");
        javaImage = new ImageIcon (p + "Java.jpg");

    }

    public void actionPerformed(ActionEvent event) {
        System.out.println("Action");
        Graphics paper = panel.getGraphics();
        Object source = event.getSource();

        if (source == happyButton) {

            happyImage.paintIcon(this, paper, 0, 0);
        }

        if (source == sadButton) {
            sadImage.paintIcon(this, paper, 0, 0);
        }

        if (source == extraButton) {
            javaImage.paintIcon(this, paper, 0, 0);
        }

    }
}

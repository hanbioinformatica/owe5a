package Iteration;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DemoGUIloop extends JFrame implements ActionListener {

    private JButton button;
    private JPanel panel;

    public static void main(String[] args) {
        DemoGUIloop frame = new DemoGUIloop();
        frame.setSize(400,400);
        frame.createGUI();
        frame.setVisible(true);
    }

    public void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setBackground(Color.GREEN);
        window.setLayout(new FlowLayout());

        button = new JButton("Klik");



        button.addActionListener(this);
        window.add(button);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,300));
        panel.setBackground(Color.white);
        window.add(panel);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Graphics paper = panel.getGraphics();
        Random random = new Random();
        paper.setColor(Color.red);
        int count =0;
        while (count++ < 20) {
            int x, y, r;
            x = random.nextInt(300);
            y = random.nextInt(300);
            r = 5;
            paper.fillOval(x, y, r, r);
        }
        System.out.println("Action!");


    }
}

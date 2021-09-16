package Iteration;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DemoGUIloopsnake extends JFrame implements ActionListener {

    private JButton button;
    private JPanel panel;
    static int max_x=300; static int max_y=400;

    public static void main(String[] args) {
        DemoGUIloopsnake frame = new DemoGUIloopsnake();
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
        panel.setPreferredSize(new Dimension(max_x,max_y));
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
            x = random.nextInt(max_x);
            y = random.nextInt(max_y);
            r = 5;
            paper.fillOval(x, y, r, r);
        }
        System.out.println("Action!");

        boolean doorlopen = true;
        int x=0,y=0, x_move=1, y_move=1, r = 1;
        do {
            paper.fillOval(x, y, r, r);
            x +=x_move;
            y +=y_move;
            if (x<0||x>max_x) x_move = -x_move;
            if (y<0||y>max_y) y_move = -y_move;
        } while (doorlopen==true);


    }
}

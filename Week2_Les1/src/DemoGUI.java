import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoGUI extends JFrame implements ActionListener {

    JTextField text; // declareer text van het type textfield
    JButton button; // declaratie van een button
    JLabel label;
    JPanel panel;  //declaratie van een objectreferentie van het type JPanel

    public static void main(String[] args) {
        DemoGUI frame = new DemoGUI();
        frame.setSize(500, 500);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setBackground(Color.CYAN);
        window.setLayout(new FlowLayout());
        //label
        label = new JLabel("Geef invoer");
        window.add(label);
        //textfield
        text = new JTextField("Hello");  // instantieer object = object aanmaken
        text.setColumns(30);
        text.setBackground(Color.yellow);
        window.add(text);
        //button met actionlistener
        button = new JButton("Klik op mij");
        button.addActionListener(this);
        window.add(button);
        // panel
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 300));
        panel.setBackground(Color.LIGHT_GRAY);
        window.add(panel);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Graphics paper = panel.getGraphics();
        String s = text.getText();
        int y = 0;
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'A':
                    paper.setColor(Color.black);
                    break;
                case 'T':
                    paper.setColor(Color.blue);
                    break;
                case 'C':
                    paper.setColor(Color.yellow);
                    break;
                case 'G':
                    paper.setColor(Color.green);
                    break;
                default:
                    paper.setColor(Color.white);
            }
            if (i>10){
                y=1;
            }
            paper.drawString(String.valueOf(c), 40+i*10, 40+y*20);
            paper.fillRect(40+i*10, 40+y*20, 10, 10);
        }
    }


}

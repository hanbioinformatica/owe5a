import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoGUI_b extends JFrame implements ActionListener {

    JTextField text; // declareer text van het type textfield
    JButton button; // declaratie van een button
    JLabel label;
    JPanel panel;  //declaratie van een objectreferentie van het type JPanel
    public static void main(String[] args) {
        DemoGUI_b frame = new DemoGUI_b();
        frame.setSize(500,500);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI(){
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
        panel.setPreferredSize(new Dimension(300,300));
        panel.setBackground(Color.LIGHT_GRAY);
        window.add(panel);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Graphics paper = panel.getGraphics();
        String s = text.getText();
        System.out.println(s);
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            System.out.println(c);

            switch (s.charAt(i)) {
                case 'A':
                    paper.setColor(Color.blue);
                    break;
                case 'G':
                    paper.setColor(Color.red);
                    break;
                case 'C':
                    paper.setColor(Color.yellow);
                    break;
                case 'T':
                    paper.setColor(Color.green);
                    break;
                default:
                    paper.setColor(Color.black);
            }
            paper.fillRect(40+i*10, 40, 10, 10);
            paper.drawString(String.valueOf(s.charAt(i)), 40+i*10, 40);

        }

    }
}

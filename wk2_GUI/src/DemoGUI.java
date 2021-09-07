import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoGUI extends JFrame implements ActionListener {

    private JButton button;
    private JPanel panel;

    public static void main(String[] args) {
        DemoGUI frame = new DemoGUI();
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


    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("Bye!");

        Graphics paper = panel.getGraphics();
        paper.setColor(Color.red);
        paper.drawLine(0, 0, 100, 100);
        paper.drawOval(0, 0, 60, 60);
        paper.setColor(Color.blue);
        paper.fillOval(100, 100, 40, 40);
        System.out.println("Action!");

    }
}

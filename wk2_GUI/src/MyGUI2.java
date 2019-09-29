import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUI2 extends JFrame implements ActionListener {

    private JTextField textField;
    private JButton button;
    private JPanel panel;

    public static void main(String[] args) {
        MyGUI2 frame = new MyGUI2();
        frame.setSize(200, 200);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        window.setBackground(Color.BLUE);
        textField = new JTextField("Hello World!");
        window.add(textField);
        button = new JButton("klik op mij");
        window.add(button);
        button.addActionListener(this);
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 100));
        panel.setBackground(Color.YELLOW);
        window.add(panel);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Hello");
        Graphics paper = panel.getGraphics();
        paper.drawLine(10, 20, 50, 80);
    }
}

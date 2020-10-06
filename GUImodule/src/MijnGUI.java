import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MijnGUI {
    private JPanel MijnPanel;
    private JButton klikButton;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;

    public MijnGUI() {
        klikButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("Hello World");
            }
        });
        klikButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                klikButton.setBackground(Color.GREEN);
                super.mouseEntered(e);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                klikButton.setBackground(Color.BLUE);
                super.mouseExited(e);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("Dit is een andere button");
                textField1.setBackground(Color.CYAN);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("rejhwrewtejhbget");
                textField1.setCaretColor(Color.RED);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MijnGUI");
        frame.setContentPane(new MijnGUI().MijnPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

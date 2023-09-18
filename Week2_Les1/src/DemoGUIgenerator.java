import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DemoGUIgenerator {

    int i = 8;
    private JPanel Demo;
    private JTextField textField1;
    private JButton dwkjfekhrwaButton;
    private JTextArea textArea1;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JTextField textField2;

    public DemoGUIgenerator() {
        dwkjfekhrwaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setBackground(Color.cyan);
                textField1.setText("Poephond");
            }
        });
        dwkjfekhrwaButton.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                textField1.setText(String.valueOf(i++));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DemoGUIgenerator");
        frame.setContentPane(new DemoGUIgenerator().Demo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoWeek4 {
    private JPanel iets;
    private JTextField textField1;
    private JButton button1;

    public DemoWeek4() {
        button1.addActionListener(new ActionListener() {
            /**
             * @param actionEvent
             */
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DemoWeek4");
        frame.setContentPane(new DemoWeek4().iets);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

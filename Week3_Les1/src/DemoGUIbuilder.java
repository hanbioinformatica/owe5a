import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class DemoGUIbuilder {
    private JSlider slider1;
    private JButton button1;
    private JTextField textField1;
    private JPanel demo;
    private JButton klikButton;

    public DemoGUIbuilder() {
        demo.addComponentListener(new ComponentAdapter() {
        });
        button1.addActionListener(new ActionListener() {
            /**
             * @param actionEvent
             */
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText("Hello World");
            }
        });
        slider1.addChangeListener(new ChangeListener() {
            /**
             * @param changeEvent
             */
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                textField1.setText(String.valueOf(slider1.getValue()));

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DemoGUIbuilder");
        frame.setContentPane(new DemoGUIbuilder().demo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

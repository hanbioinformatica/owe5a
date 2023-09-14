import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class Demio {
    private JPanel Demo;
    private JButton button1;
    private JTextArea thsiTextArea;
    private JSlider slider1;

    public Demio() {

        button1.addActionListener(new ActionListener() {
            /**
             * @param actionEvent
             */
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                thsiTextArea.setBackground(Color.cyan);

            }
        });
        slider1.addComponentListener(new ComponentAdapter() {
            /**
             * @param e 
             */
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                System.out.println(slider1.getX());
            }
        });
        button1.addMouseMotionListener(new MouseMotionAdapter() {
            /**
             * @param e 
             */
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                thsiTextArea.append("A");
            }
        });
        slider1.addChangeListener(new ChangeListener() {
            /**
             * @param changeEvent
             */
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                thsiTextArea.setText(String.valueOf(slider1.getValue()));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Demio");
        frame.setContentPane(new Demio().Demo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setPreferredSize(new Dimension(500,500));
        frame.setBackground(Color.yellow);
        frame.setVisible(true);

    }
}

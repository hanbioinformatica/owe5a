package HappyOrSad;

/**
 *
 * @author Martijn
 */
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwitchCaseVoorbeeld extends JFrame implements ActionListener {

    private JTextField field1;
    private JLabel label1;
    private JButton button1;

    public static void main(String[] args) {
        SwitchCaseVoorbeeld sw = new SwitchCaseVoorbeeld();
        sw.setSize(120, 150);
        sw.createGUI();
        sw.setVisible(true);
    }

    public void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        button1 = new JButton("Klik");
        button1.addActionListener(this);
        label1 = new JLabel("Getal");
        field1 = new JTextField(10);
        window.add(field1);
        window.add(button1);
        window.add(label1);

    }

    public void actionPerformed(ActionEvent event) {
        int i = Integer.parseInt(field1.getText());

        switch (i) {
            case 0:
                label1.setText("Nul");
                System.out.println("Nul");
                break;
            case 1:
                label1.setText("Een");
                System.out.println("Een");
                break;
            case 2:
                label1.setText("Twee");
                System.out.println("Twee");
                break;
            case 3:
                label1.setText("Drie");
                System.out.println("Drie");
                break;
            case 4:
                label1.setText("Vier");
                System.out.println("Vier");
                break;
            default:
                label1.setText("Veel");
                System.out.println("Veel");

        }
        System.out.println("Eind switch case");

    }
}

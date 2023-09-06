import javax.swing.*;

public class DemoGUIgenerator {
    private JPanel Demo;
    private JTextField textField1;
    private JButton dwkjfekhrwaButton;
    private JTextArea textArea1;
    private JCheckBox checkBox1;
    private JTextField textField2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("DemoGUIgenerator");
        frame.setContentPane(new DemoGUIgenerator().Demo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
    }
}

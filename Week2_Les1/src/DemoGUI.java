import javax.swing.*;
import java.awt.*;

public class DemoGUI extends JFrame {
    public static void main(String[] args) {
        DemoGUI frame = new DemoGUI();
        frame.setSize(400,400);
        frame.createGUI();
        frame.setVisible(true);

    }

    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setBackground(Color.CYAN);
    }


}

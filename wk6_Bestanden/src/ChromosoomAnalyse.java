import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChromosoomAnalyse  {
    private JTextField textField1;
    private JButton browseButton;
    private JButton analyseButton;

    public ChromosoomAnalyse() {
        analyseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser fileChooser = new JFileChooser();
            }
        });
    }
}

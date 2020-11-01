package AntwoordModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GUI_BI5aK {
    private JTextField textField1;
    private JPanel panel1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton runButton;
    private JTextArea textArea1;
    private JTextField textField4;

    public GUI_BI5aK() {
        runButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String vnaam = textField1.getText();
                int lft=Integer.parseInt(textField2.getText());
                int stdnr = Integer.parseInt(textField3.getText());
                String ret = StudentInformatieSysteem.prints(vnaam,lft,stdnr);
                textArea1.setText(ret);

            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI_BI5aK");
        frame.setContentPane(new GUI_BI5aK().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

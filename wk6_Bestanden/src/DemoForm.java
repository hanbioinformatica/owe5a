import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class DemoForm {
    private JButton button1;
    private JPanel panel1;
    private JTextField textField1;
    private JTextArea textArea1;
    private JPanel panel2;
    private JList list1;
    private JFileChooser fileChooser;

    public DemoForm() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File selectedFile;
                fileChooser = new JFileChooser();
                int reply = fileChooser.showOpenDialog(null);
                if (reply == JFileChooser.APPROVE_OPTION) {
                    selectedFile = fileChooser.getSelectedFile();
                    textField1.setText(selectedFile.getAbsolutePath());
                    read();

                }
            }
        });
    }


    public void read(){
        BufferedReader inFile;
        String line;
        try {
            inFile = new BufferedReader(new FileReader(textField1.getText()));
            while ((line = inFile.readLine()) != null) {
                System.out.println(line + "\n");
                textArea1.append(line+"\n");
            }
            inFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        try {
            //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }
        JFrame frame = new JFrame("DemoForm");
        frame.setContentPane(new DemoForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

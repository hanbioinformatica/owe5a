import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MijnGUI {
    private JPanel MijnPanel;
    private JButton klikButton;
    private JTextField textField1;
    private JButton button1;
    private JTextArea textArea1;
    private JButton button2;


    public MijnGUI() {
        klikButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File selectedFile;
                JFileChooser fileChooser = new JFileChooser();
                int reply = fileChooser.showOpenDialog(null);
                if (reply == JFileChooser.APPROVE_OPTION) {
                    selectedFile = fileChooser.getSelectedFile();
                    textField1.setText(selectedFile.getAbsolutePath());
                } else {
                    textField1.setText("No file selected");
                    textField1.setBackground(Color.RED);
                }

            }
        });
        button1.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                readFile();
            }
        });
    }

    private void readFile(){
        String line;
        try {
            BufferedReader inFile = new BufferedReader(new FileReader(textField1.getText()));
            while ((line = inFile.readLine()) != null) {
                textArea1.append(line + "\n");
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
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        JFrame frame = new JFrame("MijnGUI");
        frame.setContentPane(new MijnGUI().MijnPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}

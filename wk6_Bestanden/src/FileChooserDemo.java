import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Programma voor het lezen van bestanden
 * @author Martijn
 * @Copyright 2021
 *
 */
public class FileChooserDemo extends JFrame
        implements ActionListener {

    private JButton openButton;
    private JFileChooser fileChooser;
    private JTextField nameField;
    private JTextArea textArea;
    private BufferedReader inFile;

    public static void main(String[] args) {
        try {
            //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }


        FileChooserDemo frame = new FileChooserDemo();
        frame.setSize(400, 350);
        frame.createGUI();
        frame.setVisible(true);
    }

    /**
     * Functie die blah
     */
    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        openButton = new JButton("open");
        window.add(openButton);
        openButton.addActionListener(this);

        nameField = new JTextField(25);
        window.add(nameField);

        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(200,200));

        window.add(textArea);
    }

    public void readFile() {

        try {
            inFile = new BufferedReader(new FileReader(nameField.getText()));
            textArea.setText("");
            String line;
            while ((line = inFile.readLine()) != null) {
                textArea.append(line + "\n");
            }
            inFile.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "File Error: " + e.toString());
        }
    }

    public void actionPerformed(ActionEvent event) {
        File selectedFile;
        int reply;
            fileChooser = new JFileChooser();
            reply = fileChooser.showOpenDialog(this);
            if (reply == 0) {
                selectedFile = fileChooser.getSelectedFile();
                nameField.setText(selectedFile.getAbsolutePath());
                readFile();
            }
            if (reply==1){
                textArea.setText("Geen bestand gekozen");
                textArea.setBackground(Color.RED);
            }
        }
    }





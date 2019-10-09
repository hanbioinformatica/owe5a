/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*; 
import java.io.*;

public class FileInputDemo extends JFrame
    implements  ActionListener {

    private JTextArea textArea;
    private JButton openButton;
    private BufferedReader inFile;
    private JTextField nameField;
    private JLabel nameLabel;

    public static void main (String [] args) {
        FileInputDemo frame = new FileInputDemo();

        frame.setSize(400, 300);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        nameLabel = new JLabel("File name:  ");
        window.add(nameLabel);

        nameField = new JTextField(20);
        window.add(nameField);
        nameField.addActionListener(this);

        textArea = new JTextArea("",10,30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        window.add(scrollPane);

        openButton = new JButton("open");
        window.add(openButton);
        openButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == openButton) {
            try {
                inFile = new BufferedReader(new FileReader(nameField.getText()));
                textArea.setText("");    // clear the input area
                String line;
                while ((line = inFile.readLine()) != null) {
                    textArea.append(line + "\n");
                }
                inFile.close();
            }
            catch (IOException e) {
                JOptionPane.showMessageDialog(null, 
                    "File Error: " + e.toString());
            }
        }
    }
}






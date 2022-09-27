/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package HappyOrSad;

/**
 *
 * @author Martijn
 */
import java.awt.*;
import javax.swing.*;

public class Determinatie extends JFrame {

  private JPanel pan1 = new DeterminatiePanel();

    public static void main(String[] args) {
        Determinatie demo = new Determinatie();
        demo.setSize(500,500);
        demo.createGUI();
        demo.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        window.add(pan1);


    }




}


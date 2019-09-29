import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacTry extends JFrame implements ActionListener {

    private int[] ticked = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    private JPanel panel;
    private Container window;
    private JLabel turnText;
    private int player1bool = 1;

    private JButton button_top_left;
    private JButton button_top_centre;
    private JButton button_top_right;
    private JButton button_middle_left;
    private JButton button_middle_centre;
    private JButton button_middle_right;
    private JButton button_bottom_left;
    private JButton button_bottom_centre;
    private JButton button_bottom_right;

    private JButton resetButton;
    private int i = 0;

    public static void main(String[] args) {
        TicTacTry frame = new TicTacTry();

        new TicTacTry();
        frame.setSize(500, 500);
        frame.createGUI();
        frame.setVisible(true);
        JPanel Left_panel = new JPanel((LayoutManager) Color.RED);
        JPanel Right_panel = new JPanel((LayoutManager) Color.BLUE);

        JLabel Title_label = new JLabel("Come play TicTacToe!");
        Title_label.setForeground(Color.ORANGE);
        Title_label.setFont(new Font("Century", Font.BOLD, 20));
        frame.add(Left_panel, JPanel.TOP_ALIGNMENT);
        frame.add(Title_label, JLabel.TOP);
        frame.add(Right_panel, JPanel.TOP_ALIGNMENT);
    }

    private void createGUI() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        window.setBackground(Color.WHITE);
//        JLabel Title_label = new JLabel("Come play TicTacToe!", JLabel.CENTER);
//        Title_label.setForeground(Color.ORANGE);
//        Title_label.setFont(new Font("Century", Font.BOLD , 20));
//        window.add(Title_label);

        button_top_left = new JButton(".");
        button_top_centre = new JButton(".");
        button_top_right = new JButton(".");
        window.add(button_top_left);
        window.add(button_top_centre);
        window.add(button_top_right);

        button_middle_left = new JButton(".");
        button_middle_centre = new JButton(".");
        button_middle_right = new JButton(".");
        window.add(button_middle_left);
        window.add(button_middle_centre);
        window.add(button_middle_right);

        button_bottom_left = new JButton(".");
        button_bottom_centre = new JButton(".");
        button_bottom_right = new JButton(".");
        window.add(button_bottom_left);
        window.add(button_bottom_centre);
        window.add(button_bottom_right);

        JLabel Title_label = new JLabel("TicTacToe!", JLabel.CENTER);
        Title_label.setForeground(Color.ORANGE);
        Title_label.setFont(new Font("Century", Font.BOLD, 20));
        window.add(Title_label);

        window.setLayout(new GridLayout(4, 2));

        button_top_left.addActionListener(this);
        button_top_centre.addActionListener(this);
        button_top_right.addActionListener(this);
        button_middle_left.addActionListener(this);
        button_middle_centre.addActionListener(this);
        button_middle_right.addActionListener(this);
        button_bottom_left.addActionListener(this);
        button_bottom_centre.addActionListener(this);
        button_bottom_right.addActionListener(this);


    }

    private void disableAllEvents() {
        button_middle_left.setEnabled(false);
        button_middle_centre.setEnabled(false);
        button_middle_right.setEnabled(false);
        button_top_left.setEnabled(false);
        button_top_centre.setEnabled(false);
        button_top_right.setEnabled(false);
        button_bottom_left.setEnabled(false);
        button_bottom_centre.setEnabled(false);
        button_bottom_right.setEnabled(false);
        setResetButton(new JButton());
        getResetButton().setPreferredSize(new Dimension(300, 50));
        getResetButton().addActionListener(this);
        getResetButton().setText("RESET");
        window.add(getResetButton());
    }

    private void resetAllButtons() {
        button_middle_left.setEnabled(true);
        button_middle_left.setBackground(null);
        button_middle_centre.setEnabled(true);
        button_middle_centre.setBackground(null);
        button_middle_right.setEnabled(true);
        button_middle_right.setBackground(null);
        button_top_left.setEnabled(true);
        button_top_left.setBackground(null);
        button_top_centre.setEnabled(true);
        button_top_centre.setBackground(null);
        button_top_right.setEnabled(true);
        button_top_right.setBackground(null);
        button_bottom_left.setEnabled(true);
        button_bottom_left.setBackground(null);
        button_bottom_centre.setEnabled(true);
        button_bottom_centre.setBackground(null);
        button_bottom_right.setEnabled(true);
        button_bottom_right.setBackground(null);
        ticked = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
        window.remove(resetButton);
    }


    @Override
    public void actionPerformed(ActionEvent mybutton) {
        System.out.println("am here");
        JButton button = (JButton) mybutton.getSource();
        if (player1bool == 1) {
            player1bool = 2;
            System.out.println("Speler 2 is nu");
        } else {
            player1bool = 1;
            System.out.println("Speler 1 is nu");
        }

        if (i % 2 == 0) {
            ((JButton) mybutton.getSource()).setText("X");

            i++;
            button.setBackground(Color.BLUE);
            button.setEnabled(false);
            System.out.println("dit is nu de waarde van i: " + i);
        } else {
            ((JButton) mybutton.getSource()).setText("O");
            i++;
            button.setBackground(Color.YELLOW);
            button.setEnabled(false);
            System.out.println("dit is nu mijn waarde bij i");
        }

        System.out.println("hier doe ik het nog");

        System.out.println(button_top_left.getText() + "*");
//                + button_top_left.getText()
//                + button_top_left.getText());
//
        if (button_top_left.getText().equals("")
                && button_top_centre.getText().equals("")
                && button_top_right.getText().equals("")) {
            System.out.println("X wint");
            System.out.println("hier doe ik het wellicht nog");

        }

        System.out.println("hier doe ik het ook nog");


//        if (mybutton.getSource() == button_top_left) {
//        	System.out.println("deze knop is gedrukt");
//            if (player1bool == 1) {
//                ticked[0] = 1;((JButton) mybutton.getSource()).setText("O");
//            } else {
//                ticked[0] = 2;((JButton) mybutton.getSource()).setText("X");
//            }
//        }
        if (mybutton.getSource() == resetButton) {
            resetAllButtons();
        }
    }

    private JButton getResetButton() {
        return resetButton;
    }

    private void setResetButton(JButton resetButton) {
        this.resetButton = resetButton;
    }
}
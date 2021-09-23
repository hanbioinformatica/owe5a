import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class MiniBrowser extends JFrame {

  private JEditorPane jep;

  public MiniBrowser(String startingUrl) {    setSize(400,300);    setDefaultCloseOperation(EXIT_ON_CLOSE);    JPanel urlPanel = new JPanel();    urlPanel.setLayout(new BorderLayout());
    JTextField urlField = new JTextField(startingUrl);
    urlPanel.add(new JLabel("WebPagina: "), BorderLayout.WEST);
    urlPanel.add(urlField, BorderLayout.CENTER);
    final JLabel statusBar = new JLabel(" ");
    jep = new JEditorPane();
    jep.setEditable(false);
    try {
      jep.setPage(startingUrl);
    }
    catch(Exception e) {
      statusBar.setText("Pagina onbereikbaar");
    }
    JScrollPane jsp = new JScrollPane(jep); 
    getContentPane().add(jsp, BorderLayout.CENTER);
    getContentPane().add(urlPanel, BorderLayout.NORTH);
    getContentPane().add(statusBar, BorderLayout.SOUTH);
    urlField.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        try {
          jep.setPage(ae.getActionCommand());
        }
        catch(Exception e) {
          statusBar.setText("Error: " + e.getMessage());
        }
      }
    }); 
    jep.addHyperlinkListener(new SimpleLinkListener(jep, urlField, statusBar));
  }

  public static void main(String args[]) {
    String url = "http://www.han.nl/";
    new MiniBrowser(url).setVisible(true);
  }
}

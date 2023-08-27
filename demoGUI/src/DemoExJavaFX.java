import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class DemoExJavaFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        int result = getGetal();

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Result");
        alert.setHeaderText(null);
        alert.setContentText("You entered: " + result);
        alert.showAndWait();

        primaryStage.close();
    }

    public static int getGetal() {
        int i = 0;
        boolean juistGetal = false;
        while (!juistGetal) {
            TextInputDialog dialog = new TextInputDialog();
            dialog.setTitle("Enter Number");
            dialog.setHeaderText(null);
            dialog.setContentText("Enter an integer:");

            try {
                String s1 = dialog.showAndWait().orElse("0");
                i = Integer.parseInt(s1);
                juistGetal = true;
            } catch (NumberFormatException nfe) {
                // Handle exception if necessary
            }
        }
        return i;
    }
}

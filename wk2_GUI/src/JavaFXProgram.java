import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXProgram extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create the JavaFX GUI components
        Label label = new Label("Hello, JavaFX!");

        // Create a layout pane and add the label to it
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Create a scene and add the layout pane to it
        Scene scene = new Scene(root, 300, 200);

        // Set the scene on the stage and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Program");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

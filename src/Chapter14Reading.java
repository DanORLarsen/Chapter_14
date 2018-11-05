import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class Chapter14Reading extends Application {
    @Override
    public void start(Stage PrimaryStage) {
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("OK"));
        pane.setRotate(180);
        Scene scene = new Scene(pane, 200, 50);
        PrimaryStage.setTitle("Button in pane");
        PrimaryStage.setScene(scene);
        PrimaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }
    }
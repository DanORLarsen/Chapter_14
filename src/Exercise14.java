import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise14 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        int i = 0;
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                i++;
                Rectangle r1 = new Rectangle(100, 100,100,100);
                if (i % 2 == 0)
                {r1.setFill(Color.WHITE);}
                pane.add(r1, c, r);
                i++;
            }
        }
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise 14");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
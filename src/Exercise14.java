import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise14 extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane(); //Using GridPane since it got an optimal layout for Checkers
        int i = 0;//Using i to decide if it should be Black (default) or white (changed)
        for (int r = 0; r < 8; r++) {
            i++; //So its doesn't start with the same color in each row/column
            for (int c = 0; c < 8; c++) {
                Rectangle r1 = new Rectangle(25,25,25,25);//Size 25, and placed 25 and 25 away from top and side (prev rectangle aswell)
                if (i % 2 == 0)
                {r1.setFill(Color.WHITE);} //BECOME WHITE
                pane.add(r1, c, r); //Add by row and column
                i++;
            }
        }
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise 14");
        primaryStage.setScene(scene);
        primaryStage.show();//CREATE SHOW AND EVERYTHING
    }

    public static void main(String[] args) {
        launch();//LAUNCH IT!
    }
}
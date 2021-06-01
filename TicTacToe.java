import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class TicTacToe extends Application {
    Parent buildScene() {
        Text text = new Text("Tic Tac Toe");
        BorderPane borderPane = new BorderPane();
        borderPane.setPrefSize(500, 400);
        GridPane gridPane = new GridPane();
        borderPane.setLeft(gridPane);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        gridPane.setPadding(new Insets(15));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button button = new Button();
                button.setMaxWidth(Double.MAX_VALUE);
                button.setMaxHeight(Double.MAX_VALUE);
                gridPane.add(button, i, j);
                GridPane.setHgrow(button, Priority.ALWAYS);
                GridPane.setVgrow(button, Priority.ALWAYS);
            }
        }

        VBox vBox = new VBox(20);
        Button startButton = new Button("Restart");
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(startButton);
        vBox.getChildren().addAll(text, gridPane, borderPane);
        VBox.setVgrow(gridPane, Priority.ALWAYS);
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(15));
        return vBox;
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(buildScene()));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

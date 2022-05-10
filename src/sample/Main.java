package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/sample.fxml"));
            GridPane pane = Loader.load();
            primaryStage.setTitle("World of Books");
            primaryStage.setScene(new Scene(pane, 678, 562));
            primaryStage.setResizable(false);
            primaryStage.show();
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }



    public static void main(String[] args) {
        launch(args);
    }
}

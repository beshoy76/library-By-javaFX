package controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Session1 extends Application implements Initializable {

    @FXML
    private AnchorPane section;

    Object obj;

    @FXML
    private ImageView romance1;

    @FXML
    private ImageView romance2;

    @FXML
    private ImageView img121;

    @FXML
    private ImageView img131;


//    @FXML
//    void go1(ActionEvent event) {
//        try {
//            Stage stage = new Stage();
//            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/category1.fxml"));
//            AnchorPane pane = Loader.load();
//            Scene scene = new Scene(pane);
//            stage.setScene(scene);
//            stage.show();
////            Home obj1 = (Home) Loader.getController();
////            obj1.toString();
////            System.out.println(obj1);
////            obj1.getHome().getChildren().setAll(pane);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    @FXML
    void romance1(MouseEvent event) {
        try {
            Stage stage = new Stage();
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
            AnchorPane pane = Loader.load();
            Romance obj1 = (Romance)Loader.getController();
            obj1.choose(1);
            Scene scene = new Scene(pane);
            stage.setScene(scene);
            stage.show();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void romance2(MouseEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @Override
    public void start(Stage stage) throws Exception {

    }
}

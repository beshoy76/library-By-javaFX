package controller;

import connection.sqlConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Signin implements Initializable {

    @FXML
    private AnchorPane signin;

    @FXML
    private TextField userName;

    @FXML
    private TextField Pass;

    @FXML
    private Button start;

    @FXML
    void signup(ActionEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/signup.fxml"));
            AnchorPane pane = Loader.load();
            signin.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void start(ActionEvent event) throws SQLException {
        Window window = start.getScene().getWindow();

        System.out.println(userName.getText());
        System.out.println(Pass.getText());

        if (userName.getText().isEmpty()){
            showAlert(Alert.AlertType.ERROR, window, "Form Error!", "Please enter your name");
            return;
        }

        if (Pass.getText().isEmpty()){
            showAlert(Alert.AlertType.ERROR, window, "Form Error!", "Please enter your password");
            return;
        }

        String username = userName.getText();
        String pass = Pass.getText();

        connection.sqlConnection object = new sqlConnection();
        Boolean test = object.compareRecord(username,pass);
        if (test){
            try {
                FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/home.fxml"));
                AnchorPane pane = Loader.load();
                signin.getChildren().setAll(pane);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

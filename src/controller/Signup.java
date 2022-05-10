package controller;

import connection.sqlConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class Signup implements Initializable {

    @FXML
    private AnchorPane signup;

    @FXML
    private TextField userName;

    @FXML
    private TextField Email;

    @FXML
    private PasswordField  Pass;

    @FXML
    private PasswordField  Confirm;

    @FXML
    private TextField Phone;

    @FXML
    private DatePicker Birth;

    @FXML
    private ToggleGroup gender;

    @FXML
    private Button start;

    @FXML
    private Text txt1;

    @FXML
    private Text txt2;

    @FXML
    private Text txt3;

    @FXML
    private Text txt4;

    @FXML
    private Text txt5;

    @FXML
    private Text txt6;

    @FXML
    private Text txt7;

    @FXML
    void signin(ActionEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/signin.fxml"));
            AnchorPane pane = Loader.load();
            signup.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void start(ActionEvent event) throws SQLException {
        Window window = start.getScene().getWindow();

        System.out.println(userName.getText());
        System.out.println(Email.getText());
        System.out.println(Pass.getText());
        System.out.println(Confirm.getText());
        System.out.println(Phone.getText());
        System.out.println(Birth.getValue());
        System.out.println(gender.getSelectedToggle());

        if (userName.getText().isEmpty()){
            txt1.setText("Please enter your name");
//            showAlert(Alert.AlertType.ERROR, window, "Form Error!", "Please enter your name");
//            return;
        }

        if (Email.getText().isEmpty()){
            showAlert(Alert.AlertType.ERROR, window, "Form Error!", "Please enter your e-mail");
            return;
        }

        if (Pass.getText().isEmpty()){
            showAlert(Alert.AlertType.ERROR, window, "Form Error!", "Please enter your password");
            return;
        }

        if (Confirm.getText().isEmpty()){
            showAlert(Alert.AlertType.ERROR, window, "Form Error!", "Please enter your password");
            return;
        }

        if (Phone.getText().isEmpty()){
            showAlert(Alert.AlertType.ERROR, window, "Form Error!", "Please enter your phone number");
            return;
        }

        if (Birth.getValue()==null){
            showAlert(Alert.AlertType.ERROR, window, "Form Error!", "Please enter your Birth");
            return;
        }

        if (gender.getSelectedToggle()==null){
            showAlert(Alert.AlertType.ERROR, window, "Form Error!", "Please select your gender");
            return;
        }

        if (!(Pass.getText().equals(Confirm.getText()))){
            showAlert(Alert.AlertType.ERROR, window, "Form Error!", "Your passwords do not match!");
            return;
        }

        if (Pass.getLength()<4){
            showAlert(Alert.AlertType.ERROR, window, "Form Error!", "Your password should be at least 4 characters");
            return;
        }

        String username = userName.getText();
        String email = Email.getText();
        String pass = Pass.getText();
        String phone = Phone.getText();
        LocalDate birth = Birth.getValue();
        RadioButton selected = (RadioButton) gender.getSelectedToggle();
        String Gender = selected.getText();

        connection.sqlConnection object = new sqlConnection();
        object.insertRecord(username,email,pass,phone,birth,Gender);

        showAlert(Alert.AlertType.CONFIRMATION, window, "Registration Successful!","Welcome " + userName.getText());

        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/intro.fxml"));
            AnchorPane pane = Loader.load();
            signup.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void showAlert(Alert.AlertType alertType, Window window, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(window);
        alert.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

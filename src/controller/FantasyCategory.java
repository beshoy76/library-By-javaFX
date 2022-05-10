package controller;
import connection.sqlConnection;
import javafx.application.Application;
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class FantasyCategory extends Application implements Initializable {

    String path = null;

    @FXML
    private AnchorPane book;

    @FXML
    private ImageView img;

    @FXML
    private Text txt4;

    @FXML
    private Text txt1;

    @FXML
    private Text txt3;

    @FXML
    private Text txt2;

    @FXML
    private Button start;

    connection.sqlConnection object = new sqlConnection();
    public void select(int x) throws SQLException {
        String[] result;
        System.out.println(img);
        if (x == 13){
            try {
                result = object.result(13);
                Image image=new Image("file:/D:\\university\\THIRDYEAR\\DRIVE2021\\java_project\\Books_Project\\src\\images\\3cdfe46be1b901417dcdbc540f68192a5311b311__300x0.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/D:\\university\\THIRDYEAR\\DRIVE2021\\java_project\\Books_Project\\src\\pdf\\a-gentleman-never-tells-regency-historical-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else if (x == 14){
            try {
                result = object.result(14);
                Image image = new Image("file:/D:\\university\\THIRDYEAR\\DRIVE2021\\java_project\\Books_Project\\src\\images\\290dfb95ff38b0be073b753736ab45f28aa541c6__300x0.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/D:\\university\\THIRDYEAR\\DRIVE2021\\java_project\\Books_Project\\src\\pdf\\a-gentleman-never-tells-regency-historical-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else if (x == 15){
            try {
                result = object.result(15);
                Image image = new Image("file:/D:\\university\\THIRDYEAR\\DRIVE2021\\java_project\\Books_Project\\src\\images\\45b67b02181cee4dd728ad602c6ecc9a9b137fbc__300x0.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/D:\\university\\THIRDYEAR\\DRIVE2021\\java_project\\Books_Project\\src\\pdf\\a-gentleman-never-tells-regency-historical-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else if (x == 16){
            try {
                result = object.result(16);
                Image image = new Image("file:/D:\\university\\THIRDYEAR\\DRIVE2021\\java_project\\Books_Project\\src\\images\\6e04107cbc4aa8ba9f562b275183c5b47aca7f3a__300x0.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/D:\\university\\THIRDYEAR\\DRIVE2021\\java_project\\Books_Project\\src\\pdf\\a-gentleman-never-tells-regency-historical-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else if (x == 17){
            try {
                result = object.result(17);
                Image image = new Image("file:/D:\\university\\THIRDYEAR\\DRIVE2021\\java_project\\Books_Project\\src\\images\\a55787b4abfbc3ce9d70e5af4ee6937c15e728e6__300x0.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/D:\\university\\THIRDYEAR\\DRIVE2021\\java_project\\Books_Project\\src\\pdf\\a-gentleman-never-tells-regency-historical-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else if (x == 18){
            try {
                result = object.result(18);
                Image image = new Image("file:/D:\\university\\THIRDYEAR\\DRIVE2021\\java_project\\Books_Project\\src\\images\\3d0c5f15f82d30821baabe18cce790d0c9b17ac1__300x0.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/D:\\university\\THIRDYEAR\\DRIVE2021\\java_project\\Books_Project\\src\\pdf\\a-gentleman-never-tells-regency-historical-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else if (x == 19){
            try {
                result = object.result(19);
                Image image = new Image("file:/D:\\university\\THIRDYEAR\\DRIVE2021\\java_project\\Books_Project\\src\\images\\3b95fc0465aca937701b775cd869f344389a2b9c__300x0.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/D:\\university\\THIRDYEAR\\DRIVE2021\\java_project\\Books_Project\\src\\pdf\\a-gentleman-never-tells-regency-historical-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else if (x == 20){
            try {
                result = object.result(20);
                Image image = new Image("file:/D:\\university\\THIRDYEAR\\DRIVE2021\\java_project\\Books_Project\\src\\images\\14ece54b34df7766ad455acc93485b05f82142f7__300x0.jpg");
                img.setImage(image);
                txt1.setText(result[0]);
                txt2.setText(result[1]);
                txt3.setText(result[2]);
                txt4.setText(result[3]);
                path = "file:/D:\\university\\THIRDYEAR\\DRIVE2021\\java_project\\Books_Project\\src\\pdf\\a-gentleman-never-tells-regency-historical-romance.pdf";
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


    }

    @FXML
    void start(ActionEvent event) {
        HostServices hs = getHostServices();
        hs.showDocument(path);
        System.out.println(path);
    }

    @FXML
    void back(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/category2.fxml"));
            AnchorPane pane = Loader.load();
            book.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void start(Stage stage) throws Exception {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}

package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Category1 implements Initializable {

    @FXML
    private AnchorPane category1;

    @FXML
    private ImageView img1;

    @FXML
    private ImageView img2;

    @FXML
    private ImageView img3;

    @FXML
    private ImageView img4;

    @FXML
    private ImageView img5;

    @FXML
    private ImageView img7;

    @FXML
    private ImageView img6;

    @FXML
    private ImageView img8;

    @FXML
    void back(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/home.fxml"));
            AnchorPane pane = Loader.load();
            category1.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void signout(ActionEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/sample.fxml"));
            GridPane pane = Loader.load();
            category1.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click1(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance_category.fxml"));
            AnchorPane pane = Loader.load();
            RomanceCategory obj1 = (RomanceCategory) Loader.getController();
            obj1.select(1);
            category1.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click2(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance_category.fxml"));
            AnchorPane pane = Loader.load();
            RomanceCategory obj1 = (RomanceCategory) Loader.getController();
            obj1.select(2);
            System.out.println(category1);
            category1.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click3(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance_category.fxml"));
            AnchorPane pane = Loader.load();
            RomanceCategory obj1 = (RomanceCategory) Loader.getController();
            obj1.select(3);
            System.out.println(category1);
            category1.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click4(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance_category.fxml"));
            AnchorPane pane = Loader.load();
            RomanceCategory obj1 = (RomanceCategory) Loader.getController();
            obj1.select(4);
            System.out.println(category1);
            category1.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click5(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance_category.fxml"));
            AnchorPane pane = Loader.load();
            RomanceCategory obj1 = (RomanceCategory) Loader.getController();
            obj1.select(5);
            System.out.println(category1);
            category1.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click6(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance_category.fxml"));
            AnchorPane pane = Loader.load();
            RomanceCategory obj1 = (RomanceCategory) Loader.getController();
            obj1.select(6);
            System.out.println(category1);
            category1.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click7(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance_category.fxml"));
            AnchorPane pane = Loader.load();
            RomanceCategory obj1 =  (RomanceCategory) Loader.getController();
            obj1.select(7);
            System.out.println(category1);
            category1.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click8(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance_category.fxml"));
            AnchorPane pane = Loader.load();
            RomanceCategory obj1 = (RomanceCategory) Loader.getController();
            obj1.select(8);
            System.out.println(category1);
            category1.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize (URL url, ResourceBundle resourceBundle) {
    }
}

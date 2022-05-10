package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.sql.SQLException;

public class Category2 {

    @FXML
    private AnchorPane category2;

    @FXML
    private ImageView img5;

    @FXML
    private ImageView img4;

    @FXML
    private ImageView img7;

    @FXML
    private ImageView img2;

    @FXML
    private ImageView img1;

    @FXML
    private ImageView img6;

    @FXML
    private ImageView img3;

    @FXML
    private ImageView img8;

    @FXML
    void back(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/home.fxml"));
            AnchorPane pane = Loader.load();
            category2.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click1(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/fantasy_category.fxml"));
            AnchorPane pane = Loader.load();
            FantasyCategory obj1 = (FantasyCategory) Loader.getController();
            obj1.select(13);
            category2.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click2(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/fantasy_category.fxml"));
            AnchorPane pane = Loader.load();
            FantasyCategory obj1 = (FantasyCategory) Loader.getController();
            obj1.select(14);
            category2.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click3(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/fantasy_category.fxml"));
            AnchorPane pane = Loader.load();
            FantasyCategory obj1 = (FantasyCategory) Loader.getController();
            obj1.select(15);
            category2.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click4(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/fantasy_category.fxml"));
            AnchorPane pane = Loader.load();
            FantasyCategory obj1 = (FantasyCategory) Loader.getController();
            obj1.select(16);
            category2.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click5(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/fantasy_category.fxml"));
            AnchorPane pane = Loader.load();
            FantasyCategory obj1 = (FantasyCategory) Loader.getController();
            obj1.select(17);
            category2.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click6(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/fantasy_category.fxml"));
            AnchorPane pane = Loader.load();
            FantasyCategory obj1 = (FantasyCategory) Loader.getController();
            obj1.select(18);
            category2.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click7(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/fantasy_category.fxml"));
            AnchorPane pane = Loader.load();
            FantasyCategory obj1 = (FantasyCategory) Loader.getController();
            obj1.select(19);
            category2.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void click8(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/fantasy_category.fxml"));
            AnchorPane pane = Loader.load();
            FantasyCategory obj1 = (FantasyCategory) Loader.getController();
            obj1.select(20);
            category2.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void signout(ActionEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/sample.fxml"));
            GridPane pane = Loader.load();
            category2.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }







}

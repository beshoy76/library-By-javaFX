package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sample.Main;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Home implements Initializable {

    @FXML
    private AnchorPane home;

    @FXML
    private Pane section1;

    @FXML
    private Pane section2;

    @FXML
    private Pane section3;

    @FXML
    private TextField textfield;

    @FXML
    private Pane t1;

    @FXML
    private Text t4;

    @FXML
    private Text t5;

    @FXML
    private Text t6;

    @FXML
    private Text t7;

    @FXML
    private ImageView romance1;

    @FXML
    private ImageView romance2;

    @FXML
    private ImageView img121;

    @FXML
    private ImageView img131;


    @FXML
    void field(KeyEvent event) {
        String x = textfield.getText();
        if (x.equals("romance")){
            section1.setLayoutY(95);
            t1.setVisible(false);
            section2.setVisible(false);
            section3.setVisible(false);
            t4.setVisible(false);
            t5.setVisible(false);
            t6.setVisible(false);
            t7.setVisible(false);
        }else if(x.equals("fantasy")){
            section2.setLayoutY(95);
            t1.setVisible(false);
            section1.setVisible(false);
            section3.setVisible(false);
            t4.setVisible(false);
            t5.setVisible(false);
            t6.setVisible(false);
            t7.setVisible(false);
        }else if(x.equals("detective")){
            section3.setLayoutY(95);
            t1.setVisible(false);
            section1.setVisible(false);
            section2.setVisible(false);
            t4.setVisible(false);
            t5.setVisible(false);
            t6.setVisible(false);
            t7.setVisible(false);
        }else if (x.equals("")){
            section1.setLayoutY(355);
            section2.setLayoutY(660);
            section3.setLayoutY(964);
            t1.setVisible(true);
            section1.setVisible(true);
            section2.setVisible(true);
            section3.setVisible(true);
            t4.setVisible(true);
            t5.setVisible(true);
            t6.setVisible(true);
            t7.setVisible(true);
        }
    }



    @FXML
    void romance1(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
            AnchorPane pane = Loader.load();
            Romance obj1 = (Romance)Loader.getController();
            obj1.choose(1);
            System.out.println(home);
            home.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void romance2(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
            AnchorPane pane = Loader.load();
            Romance obj1 = (Romance)Loader.getController();
            obj1.choose(2);
            System.out.println(home);
            home.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void romance3(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
            AnchorPane pane = Loader.load();
            Romance obj1 = (Romance)Loader.getController();
            obj1.choose(3);
            System.out.println(home);
            home.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void romance4(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
            AnchorPane pane = Loader.load();
            Romance obj1 = (Romance)Loader.getController();
            obj1.choose(4);
            System.out.println(home);
            home.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void fantasy1(MouseEvent event) {

        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
            AnchorPane pane = Loader.load();
            Romance obj1 = (Romance)Loader.getController();
            obj1.choose(13);
            System.out.println(home);
            home.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void fantasy2(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
            AnchorPane pane = Loader.load();
            Romance obj1 = (Romance)Loader.getController();
            obj1.choose(14);
            System.out.println(home);
            home.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void fantasy3(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
            AnchorPane pane = Loader.load();
            Romance obj1 = (Romance)Loader.getController();
            obj1.choose(15);
            System.out.println(home);
            home.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void fantasy4(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
            AnchorPane pane = Loader.load();
            Romance obj1 = (Romance)Loader.getController();
            obj1.choose(16);
            System.out.println(home);
            home.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void d_and_m1(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
            AnchorPane pane = Loader.load();
            Romance obj1 = (Romance)Loader.getController();
            obj1.choose(21);
            System.out.println(home);
            home.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void d_and_m2(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
            AnchorPane pane = Loader.load();
            Romance obj1 = (Romance)Loader.getController();
            obj1.choose(22);
            System.out.println(home);
            home.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void d_and_m3(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
            AnchorPane pane = Loader.load();
            Romance obj1 = (Romance)Loader.getController();
            obj1.choose(23);
            System.out.println(home);
            home.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void d_and_m4(MouseEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
            AnchorPane pane = Loader.load();
            Romance obj1 = (Romance)Loader.getController();
            obj1.choose(24);
            System.out.println(home);
            home.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }




    @FXML
    void go1(ActionEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/category1.fxml"));
            AnchorPane pane = Loader.load();
            home.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void go2(ActionEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/category2.fxml"));
            AnchorPane pane = Loader.load();
            home.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void go3(ActionEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/category3.fxml"));
            AnchorPane pane = Loader.load();
            home.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void signout(ActionEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/sample.fxml"));
            GridPane pane = Loader.load();
            home.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void top1(MouseEvent event) {

        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
            AnchorPane pane = Loader.load();
            Romance obj1 = (Romance)Loader.getController();
            obj1.choose(22);
            System.out.println(home);
            home.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }


    }


    @FXML
    void top2(MouseEvent event) {

        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
            AnchorPane pane = Loader.load();
            Romance obj1 = (Romance)Loader.getController();
            obj1.choose(17);
            System.out.println(home);
            home.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }


    }





    @FXML
    void top3(MouseEvent event) {

        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
            AnchorPane pane = Loader.load();
            Romance obj1 = (Romance)Loader.getController();
            obj1.choose(21);
            System.out.println(home);
            home.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }


    }


    @FXML
    void top4(MouseEvent event) {

        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
            AnchorPane pane = Loader.load();
            Romance obj1 = (Romance)Loader.getController();
            obj1.choose(8);
            System.out.println(home);
            home.getChildren().setAll(pane);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

//        img11.setOnMouseClicked(event ->{
//            try {
//                FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
//                AnchorPane pane = Loader.load();
//                Romance obj1 = (Romance)Loader.getController();
//                obj1.choose(1);
//                home.getChildren().setAll(pane);
//            } catch (IOException | SQLException e) {
//                e.printStackTrace();
//            }
//        });
//
//        img111.setOnMouseClicked(event ->{
//            try {
//                FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
//                AnchorPane pane = Loader.load();
//                Romance obj1 = (Romance)Loader.getController();
//                obj1.choose(2);
//                home.getChildren().setAll(pane);
//            } catch (IOException | SQLException e) {
//                e.printStackTrace();
//            }
//        });


//        @FXML
//        void romance2(MouseEvent event) {
//            try {
//                obj1.choose(2);
//            } catch (SQLException throwables) {
//                throwables.printStackTrace();
//            }
//            try {
//                FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
//                AnchorPane pane = Loader.load();
//                home.getChildren().setAll(pane);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        @FXML
//        void romance3(MouseEvent event) {
//            try {
//                obj1.choose(3);
//            } catch (SQLException throwables) {
//                throwables.printStackTrace();
//            }
//            try {
//                FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
//                AnchorPane pane = Loader.load();
//                home.getChildren().setAll(pane);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        @FXML
//        void romance4(MouseEvent event) {
//            try {
//                obj1.choose(4);
//            } catch (SQLException throwables) {
//                throwables.printStackTrace();
//            }
//            try {
//                FXMLLoader Loader = new FXMLLoader(getClass().getResource("../fxml/romance.fxml"));
//                AnchorPane pane = Loader.load();
//                home.getChildren().setAll(pane);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}

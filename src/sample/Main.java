package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
JavaFX 2.0 c использованием CSS
http://devcolibri.com/2954
http://code.makery.ch/library/javafx-8-tutorial/ru/part4/

 */

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 380, 275));
        primaryStage.getScene().getStylesheets().add("css/JMetroDarkTheme.css");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

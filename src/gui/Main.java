package gui;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import logic.Compuerta;

public class Main extends Application  {

    Button button;

    public static void main (String[] args) {
        launch (args);
    }

    @Override
    public void start (javafx.stage.Stage primaryStage) throws Exception {
        primaryStage.setTitle ("Circuit Designer");

        button = new Button ();

    }

}

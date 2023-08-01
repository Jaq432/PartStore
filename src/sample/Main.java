package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        // Start up the main screen
        Parent parent = FXMLLoader.load(getClass().getResource("FinalMainScreen.fxml"));
        Scene scene = new Scene(parent);
        stage.setTitle("Inventory Management System");
        stage.setScene(scene);
        stage.show();

    }

}
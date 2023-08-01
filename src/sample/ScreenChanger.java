package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;


public class ScreenChanger {
    public Stage stage = new Stage();


    public void changeToScreen(ActionEvent event) throws Exception{

        // Change screens
        Parent addPartParent = FXMLLoader.load(getClass().getResource("FinalMainScreen.fxml"));
        Scene addParentScene = new Scene(addPartParent);
        // Acquire scene information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        // Set and show stage
        window.setScene(addParentScene);
        window.show();
    }

}

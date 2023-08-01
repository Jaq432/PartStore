package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

import java.io.File;
import java.net.URL;

public class ControllerMainScreen {

    // Define all relevant FXML objects here
    @FXML private static TableView partsTable;
    @FXML private static TableView productsTable;

    @FXML
    public static void initialize(){
        partsTable.getItems().addAll(Inventory.getAllParts());
        productsTable.getItems().addAll(Inventory.getAllProducts());
    }

    public void mainAddPartButtonPushed(ActionEvent event) throws Exception{

        // Change screens
        Parent addPartParent = FXMLLoader.load(getClass().getResource("FinalAddPart.fxml"));
        Scene addParentScene = new Scene(addPartParent);
        // Acquire scene information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        // Set and show stage
        window.setScene(addParentScene);
        window.show();
    }

    public void mainModifyPartButtonPushed(ActionEvent event) throws Exception{

        // Change screens
        Parent addPartParent = FXMLLoader.load(getClass().getResource("FinalModifyPart.fxml"));
        Scene addParentScene = new Scene(addPartParent);
        // Acquire scene information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        // Set and show stage
        window.setScene(addParentScene);
        window.show();
    }

    public void mainDeletePartButtonPushed(ActionEvent event) throws Exception{

    }

    public void mainAddProductButtonPushed(ActionEvent event) throws Exception{

        // Change screens
        Parent addPartParent = FXMLLoader.load(getClass().getResource("FinalAddProduct.fxml"));
        Scene addParentScene = new Scene(addPartParent);
        // Acquire scene information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        // Set and show stage
        window.setScene(addParentScene);
        window.show();
    }

    public void mainModifyProductButtonPushed(ActionEvent event) throws Exception{

        // Change screens
        Parent addPartParent = FXMLLoader.load(getClass().getResource("FinalModifyProduct.fxml"));
        Scene addParentScene = new Scene(addPartParent);
        // Acquire scene information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        // Set and show stage
        window.setScene(addParentScene);
        window.show();
    }

    public void mainDeleteProductButtonPushed(ActionEvent event) throws Exception{

    }

    public void mainExitButtonPushed(){
        System.out.println("mainExitButton Pressed");
        System.exit(0);
    }
}
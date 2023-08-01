package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControllerModifyPartScreen {

    public void modifyPartScreenSaveButtonPushed(ActionEvent event) throws Exception{

        // TODO
        // Add code here for adding the part to the array

        // Change screens
        Parent addPartParent = FXMLLoader.load(getClass().getResource("FinalMainScreen.fxml"));
        Scene addParentScene = new Scene(addPartParent);
        // Acquire scene information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        // Set and show stage
        window.setScene(addParentScene);
        window.show();
    }

    public void modifyPartScreenCancelButtonPushed(ActionEvent event) throws Exception{

        // Change screens
        Parent addPartParent = FXMLLoader.load(getClass().getResource("FinalMainScreen.fxml"));
        Scene addParentScene = new Scene(addPartParent);
        // Acquire scene information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        // Set and show stage
        window.setScene(addParentScene);
        window.show();
    }

    public void mainExitButton(){
        System.out.println("mainExitButton Pressed");
        System.exit(0);
    }

    public void mainAddPart(){
        System.out.println("mainAddPart Pressed");
    }

    public void mainRemovePart(){
        System.out.println("mainRemovePart Pressed");
    }

    public void mainDeletePart(){
        System.out.println("mainDeletePart Pressed");
    }

    public void mainAddProduct(){
        System.out.println("mainAddProduct Pressed");
    }

    public void mainRemoveProduct(){
        System.out.println("mainRemoveProduct Pressed");
    }

    public void mainDeleteProduct(){
        System.out.println("mainDeleteProduct Pressed");
    }
}
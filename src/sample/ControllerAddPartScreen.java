package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
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
import javafx.scene.control.RadioButton;
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
import javax.swing.*;

public class ControllerAddPartScreen {

    private Scene secondScene;

    // Define all relevant FXML objects
    @FXML private RadioButton inHouseButton;
    @FXML private RadioButton outsourcedButton;
    @FXML private TextField addPartId;
    @FXML private TextField addPartName;
    @FXML private TextField addPartInventory;
    @FXML private TextField addPartPriceCost;
    @FXML private TextField addPartMax;
    @FXML private TextField addPartMin;
    // This variable is addPartMachineId but for simplicity, we are going to also have it as companyName for outsourced
    @FXML private TextField addPartMachineId;
    @FXML private Label addPartMachineIdLabel;

    public void addPartRadioButtonSwitch(ActionEvent event) throws Exception{
        if (inHouseButton.isSelected()){
            addPartMachineIdLabel.setText("Machine ID");
        }
        else{
            addPartMachineIdLabel.setText("Company Name");
        }
    }

    public void addPartScreenSaveButtonPushed(ActionEvent event) throws Exception{

        // Determine the type of object to create depending on the state of a radio button group
        if (inHouseButton.isSelected()){
            for (int i = 0; i <= Inventory.getAllParts().size(); i++) {
                if (Inventory.lookupPart(i).getName().equals(addPartName)){
                    // Alert the user that the part already exists
                    JFrame frame = new JFrame("");
                    JOptionPane.showMessageDialog(frame, "The part already exists, please modify the part instead.");
                }
                else{
                    // Add the part to the inventory
                    Inventory.addPart(new InHouse(i,
                            addPartName.getText(),
                            Double.parseDouble(addPartPriceCost.getText()),
                            Integer.parseInt(addPartInventory.getText()),
                            Integer.parseInt(addPartMin.getText()),
                            Integer.parseInt(addPartMax.getText()),
                            Integer.parseInt(addPartMachineId.getText())));
                }

            }
        }
        else{
            for (int i = 0; i <= Inventory.getAllParts().size(); i++) {
                if (Inventory.lookupPart(i).getName().equals(addPartName)){
                    // Alert the user that the part already exists
                    JFrame frame = new JFrame("");
                    JOptionPane.showMessageDialog(frame, "The part already exists, please modify the part instead.");
                }
                else{
                    // Add the part to the inventory
                    Inventory.addPart(new Outsourced(i,
                            addPartName.getText(),
                            Double.parseDouble(addPartPriceCost.getText()),
                            Integer.parseInt(addPartInventory.getText()),
                            Integer.parseInt(addPartMin.getText()),
                            Integer.parseInt(addPartMax.getText()),
                            addPartMachineId.getText()));
                }

            }
        }

        // Change screens to the main screen
        Parent addPartParent = FXMLLoader.load(getClass().getResource("FinalMainScreen.fxml"));
        Scene addParentScene = new Scene(addPartParent);
        // Acquire scene information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        // Set and show stage
        window.setScene(addParentScene);
        window.show();
    }

    public void addPartScreenCancelButtonPushed(ActionEvent event) throws Exception{

        // Change screens to the main screen
        Parent addPartParent = FXMLLoader.load(getClass().getResource("FinalMainScreen.fxml"));
        Scene addParentScene = new Scene(addPartParent);
        // Acquire scene information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        // Set and show stage
        window.setScene(addParentScene);
        window.show();
    }
}
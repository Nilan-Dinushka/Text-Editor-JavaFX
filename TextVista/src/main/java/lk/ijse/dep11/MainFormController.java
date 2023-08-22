package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public AnchorPane root;
    public MenuItem mnNew;
    public MenuItem mnExit;
    public MenuItem mnUserGuide;
    public MenuItem mnAboutUs;

    public void mnNewOnAction(ActionEvent actionEvent) throws Exception{
        try {
            // Load the new scene's FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/MainForm.fxml"));
            Parent newSceneRoot = loader.load();

            // Get the stage from the menu item's context
            Stage currentStage = (Stage) mnNew.getParentPopup().getOwnerWindow();

            // Set the new scene
            Scene newScene = new Scene(newSceneRoot);
            currentStage.setScene(newScene);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void mnExitOnAction(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void mnUserGuideOnAction(ActionEvent actionEvent) {
    }

    public void mnAboutUsOnAction(ActionEvent actionEvent) {
    }
}

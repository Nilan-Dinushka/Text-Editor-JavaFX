package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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

    public void mnAboutUsOnAction(ActionEvent actionEvent) throws Exception{
        AnchorPane scene1Root = FXMLLoader.load(getClass().getResource("/view/AboutUs.fxml"));
        Scene scene1 = new Scene(scene1Root);

        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(root.getScene().getWindow());
        stage.initStyle(StageStyle.TRANSPARENT);
        //splashRoot.setBackground(Background.fill(Color.TRANSPARENT));
        scene1.setFill(Color.TRANSPARENT);
        stage.setScene(scene1);
        stage.setTitle("About Us");
        stage.show();
    }
}

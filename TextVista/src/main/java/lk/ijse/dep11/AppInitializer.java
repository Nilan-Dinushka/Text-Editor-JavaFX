package lk.ijse.dep11;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent splashRoot = FXMLLoader.load(getClass().getResource("/view/SceneLoading.fxml"));
        Scene splashScene = new Scene(splashRoot);

        // Create an undecorated stage for splash screen
        Stage splashStage = new Stage();
        //splashStage.initStyle(StageStyle.UNDECORATED);
        splashStage.initStyle(StageStyle.TRANSPARENT);
        //splashRoot.setBackground(Background.fill(Color.TRANSPARENT));
        splashScene.setFill(Color.TRANSPARENT);
        splashStage.setScene(splashScene);
        splashStage.show();

        // Set up a pause transition for splash screen duration
        PauseTransition pause = new PauseTransition(Duration.seconds(2));
        pause.setOnFinished(event -> {
            try {
                // Close the splash screen stage
                splashStage.close();

                // Load main window
                Parent mainRoot = FXMLLoader.load(getClass().getResource("/view/MainForm.fxml"));
                Scene mainScene = new Scene(mainRoot);

                // Create a decorated stage for the main window
                Stage mainStage = new Stage();
                mainStage.setScene(mainScene);
                mainStage.setTitle("Test Vista");
                mainStage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        pause.play();


    }
}

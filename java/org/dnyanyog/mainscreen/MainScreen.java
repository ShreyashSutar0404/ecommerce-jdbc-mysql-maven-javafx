package org.dnyanyog.mainscreen;

import org.dnyanyog.common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;

public class MainScreen {

    public void show() {
        StageFactory.getStage().setTitle("Main Page");
        try {
            // Load MainPage.fxml
            Parent actorGroup = FXMLLoader.load(getClass().getResource("/MainPage.fxml"));
            Scene scene = new Scene(actorGroup, 600, 400);
            StageFactory.getStage().setScene(scene);
            StageFactory.getStage().show();
        } catch (IOException e) {
            System.out.println("Error while opening MainPage.fxml. Closing application.");
            e.printStackTrace();
            System.exit(0);
        }
    }
}
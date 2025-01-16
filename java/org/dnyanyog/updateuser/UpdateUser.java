package org.dnyanyog.updateuser;

import java.io.IOException;

import org.dnyanyog.common.StageFactory;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class UpdateUser {
	public void show() {
        StageFactory.getStage().setTitle("Main Page");
        try {
            Parent actorGroup = FXMLLoader.load(getClass().getResource("/UpdateUser.fxml"));
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

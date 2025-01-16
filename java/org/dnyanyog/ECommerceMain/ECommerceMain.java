package org.dnyanyog.ECommerceMain;


import org.dnyanyog.common.StageFactory;
import org.dnyanyog.login.LoginScreen;
import javafx.application.Application;
import javafx.stage.Stage;

public class ECommerceMain extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Set the primary stage to StageFactory
        StageFactory.setStage(primaryStage);
        // Show the Login Screen
        new LoginScreen().show();
    }
}
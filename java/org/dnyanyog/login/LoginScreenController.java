package org.dnyanyog.login;

import org.dnyanyog.mainscreen.MainScreen;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginScreenController {

    @FXML
    private TextField password;

    @FXML
    private TextField loginName;

    @FXML
    private Label errorMessage;

    public void loginButtonClick() {
        System.out.println("Username: " + loginName.getText());
        System.out.println("Password: " + password.getText());

        
        if (loginName.getText().equals("Shreyash") && password.getText().equals("SHRE2004")) {
            
            errorMessage.setText("Login Successfull!/n Redirecting to the main page");
            
            new MainScreen().show();
        } else {
            
            errorMessage.setText("Invalid username or password!");
        }
    }
}
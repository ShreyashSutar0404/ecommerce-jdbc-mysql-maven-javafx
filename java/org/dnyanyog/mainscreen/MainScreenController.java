package org.dnyanyog.mainscreen;

import java.io.IOException;

import org.dnyanyog.login.LoginScreen;
import org.dnyanyog.productmanagement.ProductManagement;
import org.dnyanyog.usermanagement.UserManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainScreenController {
	
	@FXML
	Button productButton;
	@FXML
	Button userButton;
	@FXML
	Button quitButton;
	@FXML
	Button backButton;
	
	@FXML
	public void productButtonClick() throws Exception{
		new ProductManagement().show();
	}
	
	@FXML
	public void userButtonClick() throws Exception {
		new UserManagement().show();
	}
	
	@FXML
	public void quitButtonClick() {
		System.exit(0);
	}
	
	@FXML
	public void backButtonClick() throws IOException {
		new LoginScreen().show();
	}
}

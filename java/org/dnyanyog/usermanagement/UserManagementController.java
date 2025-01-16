package org.dnyanyog.usermanagement;

import org.dnyanyog.adduser.AddUser;
import org.dnyanyog.deleteuser.DeleteUser;
import org.dnyanyog.mainscreen.MainScreen;
import org.dnyanyog.searchuser.SearchUser;
import org.dnyanyog.updateuser.UpdateUser;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class UserManagementController {
	@FXML
	Button addButton;
	@FXML
	Button updateButton;
	@FXML
	Button searchButton;
	@FXML
	Button backButton;
	
	@FXML
	public void addButtonClick() {
		new AddUser().show();
		
	}
	@FXML
	public void updateButtonClick() {
		new UpdateUser().show();
		
	}
	@FXML
	public void searchButtonClick() {
		new SearchUser().show();
		
	}
	
	@FXML
	public void deleteButtonClick() {
		new DeleteUser().show();
	}
	
	@FXML
	public void backButtonClick() {
		new MainScreen().show();
	}


}

package org.dnyanyog.updateuser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.dnyanyog.productmanagement.ProductManagement;
import org.dnyanyog.usermanagement.UserManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UpdateUserController {
	
	String url = "jdbc:mysql://localhost:3306/e_commerce_db_3";
	String userName = "root";
	String password = "S@ngl!#10@";
	
	@FXML
	TextField updateName;
	@FXML
	TextField newPassword;
	@FXML
	TextField newEmail;
	@FXML
	Button updateButton;
	@FXML
	Button backButton;
	@FXML
	Label errorLabel;
	
	@FXML
	public void updateButtonClick() throws SQLException {
		
		Connection connection = DriverManager.getConnection(url, userName, password);
		Statement statement = (Statement) connection.createStatement();
		
		statement.execute("UPDATE users SET username = '" 
			    + updateName.getText() + "', email = '" 
			    + newEmail.getText() + "', password = '" 
			    + newPassword.getText() + "' WHERE username = '" 
			    + updateName.getText() + "';");
		
			errorLabel.setText("User Updated Successfully!");
			
	}
	
		@FXML
		public void backButtonClick() {
			new UserManagement().show();
		}
}

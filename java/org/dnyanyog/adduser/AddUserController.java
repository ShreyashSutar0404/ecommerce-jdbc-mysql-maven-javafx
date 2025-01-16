package org.dnyanyog.adduser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.dnyanyog.productmanagement.ProductManagement;
import org.dnyanyog.usermanagement.UserManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddUserController {
	
	String url = "jdbc:mysql://localhost:3306/e_commerce_db_3";
	String userName = "root";
	String password = "S@ngl!#10@";
	
	@FXML
	TextField userName1;
	@FXML
	TextField email;
	@FXML
	TextField password1;
	@FXML
	Button addUser;
	@FXML
	Button backButton;
	@FXML
	Label errorLabel;
	
	@FXML
	public void addButtonClick() throws Exception {
	
		Connection connection = DriverManager.getConnection(url, userName, password);
		Statement statement = (Statement) connection.createStatement();

		statement.execute("INSERT INTO users(username,email,password) VALUES ('"
				+ userName1.getText() + "', '" + email.getText() + "', '" + password1.getText() + "');");
		
		errorLabel.setText("User Added Successfully!");
}

@FXML
public void backButtonClick() {
	new UserManagement().show();
}

}

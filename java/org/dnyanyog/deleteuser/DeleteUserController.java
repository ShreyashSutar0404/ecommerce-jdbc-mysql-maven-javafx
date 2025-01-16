package org.dnyanyog.deleteuser;

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

public class DeleteUserController {
	String url = "jdbc:mysql://localhost:3306/e_commerce_db_3";
	String userName = "root";
	String password = "S@ngl!#10@";
	
	@FXML
	TextField deleteUser;
	@FXML
	Button deleteButton;
	@FXML
	Label errorLabel;
	
	@FXML
	public void deleteButtonClick() throws SQLException {
		
		Connection connection = DriverManager.getConnection(url, userName, password);
		 Statement statement = (Statement) connection.createStatement();
	
		 String Query = ("DELETE FROM users WHERE username = '" +deleteUser.getText() + "';");
		statement.execute(Query);
		errorLabel.setText("User Deleted Successfully!");
	}
	
	@FXML
	public void backButtonClick() {
		new UserManagement().show();
	}
	

}

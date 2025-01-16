package org.dnyanyog.searchuser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.dnyanyog.usermanagement.UserManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SearchUserController {
	String url = "jdbc:mysql://localhost:3306/e_commerce_db_3";
	String userName = "root";
	String password = "S@ngl!#10@";
	
	@FXML
	TextField searchName;
	@FXML
	TextField userNameShow;
	@FXML
	TextField emailShow;
	@FXML
	TextField passwordShow;
	@FXML
	Button searchButton;
	@FXML
	Label errorLabel;
	
	@FXML
	public void searchButtonClick() throws SQLException {
		
		Connection connection = DriverManager.getConnection(url, userName, password);
		 Statement statement = connection.createStatement();
		 
		 String query = "SELECT username, email, password FROM users WHERE username = '" 
                 + searchName.getText() + "';";
		 
		 ResultSet resultSet = statement.executeQuery(query);
		 
		 if(resultSet.next()) {
			 String name = resultSet.getString("username");
			 String email = resultSet.getString("email");
			 String password = resultSet.getString("password");
			 errorLabel.setText("User Found Successfully!");
			 
			 userNameShow.setText(name);
			 emailShow.setText(email);
			 passwordShow.setText(password);
			 
		 }else {
			 errorLabel.setText("User Not Found!");
		 }
		 }
	@FXML
	public void backButtonClick() {
		new UserManagement().show();
	}
	}
	



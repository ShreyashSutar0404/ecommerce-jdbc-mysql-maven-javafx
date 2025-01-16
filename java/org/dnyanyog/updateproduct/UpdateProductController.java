package org.dnyanyog.updateproduct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.dnyanyog.productmanagement.ProductManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UpdateProductController {
	
	String url = "jdbc:mysql://localhost:3306/e_commerce_db_3";
	String userName = "root";
	String password = "S@ngl!#10@";
	
	@FXML
	TextField updateName;
	@FXML
	TextField newQuantity;
	@FXML
	TextField newPrice;
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
		
		statement.execute("UPDATE products SET name = '" 
			    + updateName.getText() + "', price = '" 
			    + newPrice.getText() + "', quantity = '" 
			    + newQuantity.getText() + "' WHERE name = '" 
			    + updateName.getText() + "';");
		
			errorLabel.setText("Product Updated Successfully!");
			
	}
	
		@FXML
		public void backButtonClick() {
			new ProductManagement().show();
		}

}

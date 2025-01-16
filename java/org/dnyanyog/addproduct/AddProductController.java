package org.dnyanyog.addproduct;

import java.sql.Statement;

import org.dnyanyog.productmanagement.ProductManagement;

import java.sql.Connection;
import java.sql.DriverManager;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddProductController {
	
	String url = "jdbc:mysql://localhost:3306/e_commerce_db_3";
	String userName = "root";
	String password = "S@ngl!#10@";

	
	@FXML
	TextField addProduct;
	@FXML
	TextField price;
	@FXML
	TextField quantity;
	@FXML
	Button addProductButton;
	@FXML
	Button backButton;
	@FXML
	Label errorLabel;
	
	@FXML
		public void addButtonClick() throws Exception {
		
			Connection connection = DriverManager.getConnection(url, userName, password);
			Statement statement = (Statement) connection.createStatement();

			statement.execute("INSERT INTO products(name,price,quantity) VALUES ('"
					+ addProduct.getText() + "', '" + price.getText() + "', '" + quantity.getText() + "');");
			
			errorLabel.setText("Product Added Successfully!");
	}
	
	@FXML
	public void backButtonClick() {
		new ProductManagement().show();
	}
	

}

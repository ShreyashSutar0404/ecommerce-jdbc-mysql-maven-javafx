package org.dnyanyog.deleteproduct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.dnyanyog.productmanagement.ProductManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DeleteProductController {
	
	String url = "jdbc:mysql://localhost:3306/e_commerce_db_3";
	String userName = "root";
	String password = "S@ngl!#10@";
	
	@FXML
	TextField deleteProduct;
	@FXML
	Button deleteButton;
	@FXML
	Label errorLabel;
	
	@FXML
	public void deleteButtonClick() throws SQLException {
		
		Connection connection = DriverManager.getConnection(url, userName, password);
		 Statement statement = (Statement) connection.createStatement();
	
		 String Query = ("DELETE FROM products WHERE name = '" +deleteProduct.getText() + "';");
		statement.execute(Query);
		errorLabel.setText("Product Deleted Successfully!");
	}
	
	@FXML
	public void backButtonClick() {
		new ProductManagement().show();
	}

}
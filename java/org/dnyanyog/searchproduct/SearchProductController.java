package org.dnyanyog.searchproduct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.dnyanyog.productmanagement.ProductManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SearchProductController {
	
	String url = "jdbc:mysql://localhost:3306/e_commerce_db_3";
	String userName = "root";
	String password = "S@ngl!#10@";
	
	@FXML
	TextField prodNameShow;
	@FXML
	TextField priceShow;
	@FXML
	TextField quanShow;
	@FXML
	TextField searchProduct;
	@FXML
	Button searchButton;
	@FXML
	Label errorLabel;
	
	@FXML
	public void searchButtonClick() throws SQLException {
		
		Connection connection = DriverManager.getConnection(url, userName, password);
		 Statement statement = connection.createStatement();

         String query = "SELECT name, price, quantity FROM products WHERE name = '" 
                 + searchProduct.getText() + "';";
         
         ResultSet resultSet = statement.executeQuery(query);
         
         if (resultSet.next()) {
        	 
             String name = resultSet.getString("name");
             String price = resultSet.getString("price");
             String quantity = resultSet.getString("quantity");
             
             errorLabel.setText("Product Found!");

             prodNameShow.setText(name);       
             priceShow.setText(price);     
             quanShow.setText(quantity); 
             
         } else {
        	 errorLabel.setText("Product Not Found!");
		
         }
	}
	@FXML
	public void backButtonClick() {
		new ProductManagement().show();
	}
	}

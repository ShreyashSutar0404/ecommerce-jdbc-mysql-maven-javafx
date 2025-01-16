package org.dnyanyog.productmanagement;


import org.dnyanyog.addproduct.AddProduct;
import org.dnyanyog.deleteproduct.DeleteProduct;
import org.dnyanyog.mainscreen.MainScreen;
import org.dnyanyog.searchproduct.SearchProduct;
import org.dnyanyog.updateproduct.UpdateProduct;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ProductManagementController {
	
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
		new AddProduct().show();
		
	}
	@FXML
	public void updateButtonClick() {
		new UpdateProduct().show();
		
	}
	@FXML
	public void searchButtonClick() {
		new SearchProduct().show();
		
	}
	
	@FXML
	public void deleteButtonClick() {
		new DeleteProduct().show();
	}
	
	@FXML
	public void backButtonClick() {
		new MainScreen().show();
	}

}

package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DiscountController {

    @FXML
    private TextField price;

    @FXML
    private TextField txt;

    @FXML
    private TextField discount;
    @FXML
    private Button Menu;

    @FXML
    void calculate(ActionEvent event) {
    	double p=Double.parseDouble(price.getText());
    	double d=Double.parseDouble(discount.getText());
    	double ammount1=(p*d)/100;
    	p-=ammount1;
    	
    	txt.setText(Double.toString(p));
    	
    }
    public void BacktoMenu() throws Exception{
    	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("menu.fxml"));
    	Stage window=(Stage)Menu.getScene().getWindow();
    	window.setScene(new Scene(root,520,480));
    }


}

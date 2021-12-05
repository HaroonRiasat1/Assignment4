package application;


import java.time.LocalDate;
import java.time.Period;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;

import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class CurrencyController {
	 
	  

	    @FXML
	    private Button Menu;
	    @FXML
	    private TextField txt;
	    @FXML
	    private TextField txt1;
	  
	    @FXML
	    public void Dollar(ActionEvent ae) throws Exception
	    {
	    		String a=txt1.getText();
	    		double dollar=Double.parseDouble(a)*0.0057;
	    		txt.setText(Double.toString(dollar));
	    }
	    @FXML
	    public void Euro(ActionEvent ae) throws Exception
	    {
	    		String a=txt1.getText();
	    		double dollar=Double.parseDouble(a)*0.0050;
	    		txt.setText(Double.toString(dollar));
	    }
	    @FXML
	    public void Inr(ActionEvent ae) throws Exception
	    {
	    		String a=txt1.getText();
	    		double dollar=Double.parseDouble(a)*0.43;
	    		txt.setText(Double.toString(dollar));
	    }
	    @FXML
	    public void AED(ActionEvent ae) throws Exception
	    {
	    		String a=txt1.getText();
	    		double dollar=Double.parseDouble(a)*0.021;
	    		txt.setText(Double.toString(dollar));
	    }
	    @FXML
	    public void Pound(ActionEvent ae) throws Exception
	    {
	    		String a=txt1.getText();
	    		double dollar=Double.parseDouble(a)*0.0043;
	    		txt.setText(Double.toString(dollar));
	    }
	    @FXML
	    public void TRY(ActionEvent ae) throws Exception
	    {
	    		String a=txt1.getText();
	    		double dollar=Double.parseDouble(a)*0.078;
	    		txt.setText(Double.toString(dollar));
	    }
	    public void BacktoMenu() throws Exception{
	    	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("menu.fxml"));
	    	Stage window=(Stage)Menu.getScene().getWindow();
	    	window.setScene(new Scene(root,520,480));
	    }

	    
 
}

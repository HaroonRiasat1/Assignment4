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



public class DateofBirthController {
	  @FXML
	    private Button calculate;

	    @FXML
	    private DatePicker dateofbirth;

	    @FXML
	    private DatePicker tilldate;

	    @FXML
	    private Button Menu;
	    @FXML
	    private TextField txt;
	    @FXML
	    private TextField txt1;
	    @FXML
	    private TextField txt2;
	    @FXML
	    public void calculate(ActionEvent ae) throws Exception
	    {
	    	LocalDate localDate = dateofbirth.getValue();
	    	LocalDate localDate1 = tilldate.getValue();
	    	Period period = Period.between(localDate, localDate1);
	    	txt.setText(Integer.toString(period.getMonths()));
	    	txt1.setText(Integer.toString(period.getDays()));
	    	txt2.setText(Integer.toString(period.getYears()));
	  
	    }
	    public void BacktoMenu() throws Exception{
	    	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("menu.fxml"));
	    	Stage window=(Stage)Menu.getScene().getWindow();
	    	window.setScene(new Scene(root,520,480));
	    }

	    
 
}

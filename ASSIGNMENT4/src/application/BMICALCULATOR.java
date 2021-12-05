package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BMICALCULATOR {

    @FXML
    private TextField height;

    @FXML
    private TextField txt;

    @FXML
    private TextField weight;
    @FXML
    private Button Menu;

    @FXML
    void calculate(ActionEvent event) {
    	double h=Double.parseDouble(height.getText());
    	double w=Double.parseDouble(weight.getText());
    	double BMI=w/(h*h);
    	txt.setText(Double.toString(BMI));
    	
    }
    public void BacktoMenu() throws Exception{
    	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("menu.fxml"));
    	Stage window=(Stage)Menu.getScene().getWindow();
    	window.setScene(new Scene(root,520,480));
    }


}

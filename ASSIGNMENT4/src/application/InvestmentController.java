package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class InvestmentController {

    @FXML
    private Button Menu;

    @FXML
    private TextField interest;

    @FXML
    private TextField period;

    @FXML
    private TextField present;

    @FXML
    private TextField txt;

    @FXML
    void calculate(ActionEvent event) {
    	double r=Double.parseDouble(interest.getText());
    	double y=Double.parseDouble(period.getText());
    	double p=Double.parseDouble(present.getText());
    	double f=p*Math.pow((1+r/100),y);
    	txt.setText(Double.toString(f));
    	
    }
    public void BacktoMenu() throws Exception{
    	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("menu.fxml"));
    	Stage window=(Stage)Menu.getScene().getWindow();
    	window.setScene(new Scene(root,520,480));
    }


}

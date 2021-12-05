package application;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class scenecontroller {
    @FXML
    private Button btnscene1;
    @FXML
    private Button btnscene2;
	public void calculator() throws Exception{
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
		Stage window=(Stage)btnscene1.getScene().getWindow();
		window.setScene(new Scene(root,390,350));
	}
	public void Agecalculator() throws Exception{
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("dob.fxml"));
		Stage window=(Stage)btnscene1.getScene().getWindow();
		window.setScene(new Scene(root,360,360));
	}
	public void BMIcalculator() throws Exception{
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("BMI.fxml"));
		Stage window=(Stage)btnscene1.getScene().getWindow();
		window.setScene(new Scene(root,360,360));
	}
	public void Discountcalculator() throws Exception{
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Discount.fxml"));
		Stage window=(Stage)btnscene1.getScene().getWindow();
		window.setScene(new Scene(root,360,360));
	}
	public void Investmentcalculator() throws Exception{
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("InvestmentCalculator.fxml"));
		Stage window=(Stage)btnscene1.getScene().getWindow();
		window.setScene(new Scene(root,360,360));
	}
	public void CurrencyCalculator() throws Exception{
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("CurrencyConverter.fxml"));
		Stage window=(Stage)btnscene1.getScene().getWindow();
		window.setScene(new Scene(root,360,360));
	}
}
	
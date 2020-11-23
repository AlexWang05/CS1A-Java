/*
 *Class: CS1A
* Description: Assignment 10: A GUI Application that displays the assessment
* 			value and property tax with a JavaFX User Interface
* 
* Due date: 12/04/2020
* Name: Zhaozhong (Alex) Wang
* File names: PropertyTax.java and README.doc
 */

// import statements
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;


public class PropertyTax extends Application {
	
	//fields
	private Label assessVal;
	private Label taxVal;
	private double input;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		// instantiate control for actual value 
		Label actualVal = new Label("Actual Value: ");
		
		TextField valField = new TextField(); // text field
		
		// HBox layout container for Actual Value
		HBox hBoxVal = new HBox(actualVal, valField);
		
		hBoxVal.setSpacing(10); // sets spacing
		hBoxVal.setAlignment(Pos.CENTER); // sets alignment
		
		// Creates label for Assessment Value
		Label assessField = new Label("Assessment value: ");
		assessVal = new Label();
		
		// HBox layout for Assessment Value
		HBox assessBox = new HBox(assessField, assessVal);
		
		assessBox.setAlignment(Pos.CENTER_LEFT); // set alignment
		
		// Creates label for Property Tax
		Label taxLabel = new Label("Property tax: ");
		taxVal = new Label();
		
		// HBox layout for Property Tax
		HBox taxBox = new HBox(taxLabel, taxVal);
		
		taxBox.setAlignment(Pos.CENTER_LEFT); // set alignment
		
		// Creates Calculate Button
		Button calculate = new Button("Calculate Property Tax");
		
		// HBox layout for Calculate Button
		HBox calcButton = new HBox(calculate);
		
		calculate.setAlignment(Pos.CENTER); // set alignment
		
		// VBox layout for all HBoxes
		VBox infoPage = new VBox(10, hBoxVal, assessBox, taxBox, calcButton);
		
		infoPage.setAlignment(Pos.CENTER); // set alignment
		infoPage.setPadding(new Insets(10)); // set padding
		
		Scene scene = new Scene(infoPage); // Instantiate scene
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
		// Register the event handler
		calculate.setOnAction((event) -> {
			input = Double.parseDouble(valField.getText()); // gets input from text box
			
			double assess = input * 0.6; // calculate values
			double tax = assess / 100 * 0.64;
			
			// set labels
			assessVal.setText(Double.toString(assess));
			taxVal.setText(Double.toString(tax));
		});
	
	}
	
}

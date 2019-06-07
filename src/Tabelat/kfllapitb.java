package Tabelat;

import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class kfllapitb extends Application {

	// Table views
	private TableView kfllapiTable = new TableView();
	
	public void start(Stage primaryStage) {
		
		
		// Rangimi table
		TableColumn<String, Rangimi> column1 = new TableColumn<>("ID");
		column1.setCellValueFactory(new PropertyValueFactory("eid"));
		column1.setPrefWidth(60);
		
		TableColumn<String, Rangimi> column2 = new TableColumn<>("NUMRI");
		column2.setCellValueFactory(new PropertyValueFactory("Numri"));
		column2.setPrefWidth(100);
		
		TableColumn<String, Rangimi> column3 = new TableColumn<>("SHTETESIA");
		column3.setCellValueFactory(new PropertyValueFactory("Shtetesia"));
		column3.setPrefWidth(100);
		
		TableColumn<String, Rangimi> column4 = new TableColumn<>("POZICIONI");
		column4.setCellValueFactory(new PropertyValueFactory("Pozicioni"));
		column4.setPrefWidth(100);
		
		TableColumn<String, Rangimi> column5 = new TableColumn<>("EMRI DHE MBIEMRI");
		column5.setCellValueFactory(new PropertyValueFactory("EmriMbiemri"));
		column5.setPrefWidth(150);
		
		
		
		kfllapiTable.getColumns().add(column1);
		kfllapiTable.getColumns().add(column2);
		kfllapiTable.getColumns().add(column3);
		kfllapiTable.getColumns().add(column4);
		kfllapiTable.getColumns().add(column5);
	
		
		kfllapiTable.setPrefWidth(1064);
		kfllapiTable.setPrefHeight(400);
		
		kfllapiTable.setStyle("-fx-base: darkred;");
		// Main Pane
		HBox mainPane = new HBox(10);
		
		mainPane.getChildren().add(kfllapiTable);
		
		mainPane.setPadding(new Insets(15, 15, 15 ,15));
		
		
		Scene scene = new Scene(mainPane, 543, 355);
		
		primaryStage.setTitle("KF Llapi");
		primaryStage.setScene(scene);
		
		showKFllapi();
		
		primaryStage.show();
	}
	

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void showKFllapi() {
		List<KFllapi> kfllapi = KFllapi.getkfllapi();
		
		ObservableList<KFllapi> kfllapiList = FXCollections.observableArrayList();
		
		for(int i = 0; i < kfllapi.size(); i++) {
			kfllapiList.add(kfllapi.get(i));
		}
		
		kfllapiTable.setItems(kfllapiList);
	}
	
	
}





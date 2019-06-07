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

public class kfferonikelitb extends Application {

	// Table views
	private TableView kfferonikeliTable = new TableView();
	
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
		
		
		
		kfferonikeliTable.getColumns().add(column1);
		kfferonikeliTable.getColumns().add(column2);
		kfferonikeliTable.getColumns().add(column3);
		kfferonikeliTable.getColumns().add(column4);
		kfferonikeliTable.getColumns().add(column5);
	
		
		kfferonikeliTable.setPrefWidth(1064);
		kfferonikeliTable.setPrefHeight(400);
		
		kfferonikeliTable.setStyle("-fx-base: darkred;");
		// Main Pane
		HBox mainPane = new HBox(10);
		
		mainPane.getChildren().add(kfferonikeliTable);
		
		mainPane.setPadding(new Insets(15, 15, 15 ,15));
		
		
		Scene scene = new Scene(mainPane, 543, 355);
		
		primaryStage.setTitle("KF Feronikeli");
		primaryStage.setScene(scene);
		
		showKFferonikeli();
		
		primaryStage.show();
	}
	

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void showKFferonikeli() {
		List<KFferonikeli> kfferonikeli = KFferonikeli.getkfferonikeli();
		
		ObservableList<KFferonikeli> kfferonikeliList = FXCollections.observableArrayList();
		
		for(int i = 0; i < kfferonikeli.size(); i++) {
			kfferonikeliList.add(kfferonikeli.get(i));
		}
		
		kfferonikeliTable.setItems(kfferonikeliList);
	}
	
	
}




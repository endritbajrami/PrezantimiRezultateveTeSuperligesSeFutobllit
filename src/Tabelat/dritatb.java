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

public class dritatb extends Application {

	// Table views
	private TableView dritaTable = new TableView();
	
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
		
		
		
		dritaTable.getColumns().add(column1);
		dritaTable.getColumns().add(column2);
		dritaTable.getColumns().add(column3);
		dritaTable.getColumns().add(column4);
		dritaTable.getColumns().add(column5);
	
		
		dritaTable.setPrefWidth(1064);
		dritaTable.setPrefHeight(400);
		
		dritaTable.setStyle("-fx-base: darkred;");
		// Main Pane
		HBox mainPane = new HBox(10);
		
		mainPane.getChildren().add(dritaTable);
		
		mainPane.setPadding(new Insets(15, 15, 15 ,15));
		
		
		Scene scene = new Scene(mainPane, 543, 355);
		
		primaryStage.setTitle("Drita");
		primaryStage.setScene(scene);
		
		showDrita();
		
		primaryStage.show();
	}
	

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void showDrita() {
		List<Drita> drita = Drita.getdrita();
		
		ObservableList<Drita> dritaList = FXCollections.observableArrayList();
		
		for(int i = 0; i < drita.size(); i++) {
			dritaList.add(drita.get(i));
		}
		
		dritaTable.setItems(dritaList);
	}
	
	
}





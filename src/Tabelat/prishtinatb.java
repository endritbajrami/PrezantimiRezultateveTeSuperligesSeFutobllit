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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class prishtinatb extends Application {

	// Table views
	private TableView prishtinaTable = new TableView();
	
	public Pane start() {
		
		
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
		
		
		
		prishtinaTable.getColumns().add(column1);
		prishtinaTable.getColumns().add(column2);
		prishtinaTable.getColumns().add(column3);
		prishtinaTable.getColumns().add(column4);
		prishtinaTable.getColumns().add(column5);
	
		
		prishtinaTable.setPrefWidth(1064);
		prishtinaTable.setPrefHeight(400);
		
		prishtinaTable.setStyle("-fx-base: darkred;");
		// Main Pane
		HBox mainPane = new HBox(10);
		
		mainPane.getChildren().add(prishtinaTable);
		
		mainPane.setPadding(new Insets(15, 15, 15 ,15));
		
		
		
		showPrishtina();
		return mainPane;
		
	
	}
	

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void showPrishtina() {
		List<Prishtina> prishtina = Prishtina.getprishtina();
		
		ObservableList<Prishtina> prishtinaList = FXCollections.observableArrayList();
		
		for(int i = 0; i < prishtina.size(); i++) {
			prishtinaList.add(prishtina.get(i));
		}
		
		prishtinaTable.setItems(prishtinaList);
	}
	
	
}





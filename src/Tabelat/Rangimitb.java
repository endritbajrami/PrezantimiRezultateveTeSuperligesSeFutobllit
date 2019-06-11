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

public class Rangimitb{


	// Table views
	private TableView rangimiTable = new TableView();
	
	public Pane start() {
		
		
		// Rangimi table
	
		TableColumn<String, Rangimi> column2 = new TableColumn<>("NUMRI");
		column2.setCellValueFactory(new PropertyValueFactory("Nr"));
		column2.setPrefWidth(50);
		
		TableColumn<String, Rangimi> column3 = new TableColumn<>("EKIPI");
		column3.setCellValueFactory(new PropertyValueFactory("Ekipi"));
		column3.setPrefWidth(100);
		
		TableColumn<String, Rangimi> column4 = new TableColumn<>("NR LOJEVE");
		column4.setCellValueFactory(new PropertyValueFactory("NrLojëve"));
		column4.setPrefWidth(81);
		
		TableColumn<String, Rangimi> column5 = new TableColumn<>("FITORE");
		column5.setCellValueFactory(new PropertyValueFactory("Fitore"));
		column5.setPrefWidth(81);
		
		TableColumn<String, Rangimi> column6 = new TableColumn<>("BARAZIME");
		column6.setCellValueFactory(new PropertyValueFactory("Barazime"));
		column6.setPrefWidth(81);
		
		TableColumn<String, Rangimi> column7 = new TableColumn<>("HUMBJE");
		column7.setCellValueFactory(new PropertyValueFactory("Humbje"));
		column7.setPrefWidth(81);
		
		TableColumn<String, Rangimi> column8 = new TableColumn<>("GOLPLUS");
		column8.setCellValueFactory(new PropertyValueFactory("Golplus"));
		column8.setPrefWidth(81);
		
		TableColumn<String, Rangimi> column9 = new TableColumn<>("GOLMINUS");
		column9.setCellValueFactory(new PropertyValueFactory("Golminus"));
		column9.setPrefWidth(81);
		
		TableColumn<String, Rangimi> column10 = new TableColumn<>("AVERAGE");
		column10.setCellValueFactory(new PropertyValueFactory("Average"));
		column10.setPrefWidth(81);
		
		TableColumn<String, Rangimi> column11 = new TableColumn<>("PIKET");
		column11.setCellValueFactory(new PropertyValueFactory("Pikët"));
		column11.setPrefWidth(60);
		
		
		rangimiTable.getColumns().add(column2);
		rangimiTable.getColumns().add(column3);
		rangimiTable.getColumns().add(column4);
		rangimiTable.getColumns().add(column5);
		rangimiTable.getColumns().add(column6);
		rangimiTable.getColumns().add(column7);
		rangimiTable.getColumns().add(column8);
		rangimiTable.getColumns().add(column9);
		rangimiTable.getColumns().add(column10);
		rangimiTable.getColumns().add(column11);
		
		rangimiTable.setPrefWidth(1000);
		rangimiTable.setPrefHeight(500);
		
	rangimiTable.setStyle("-fx-base: palegreen;");
		// Main Pane
		HBox mainPane = new HBox(10);
		
		mainPane.getChildren().add(rangimiTable);
		
		mainPane.setPadding(new Insets(15, 15, 15 ,15));
		showRangimi();
	
		mainPane.setMaxSize(700, 500);
		return mainPane;
		
	}
	

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void showRangimi() {
		List<Rangimi> rangimi = Rangimi.getrangimi();
		
		ObservableList<Rangimi> rangimiList = FXCollections.observableArrayList();
		
		for(int i = 0; i < rangimi.size(); i++) {
			rangimiList.add(rangimi.get(i));
		}
		
		rangimiTable.setItems(rangimiList);
	}


	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	


	

	
}



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

public class gjilanitb extends Application {

	// Table views
	private TableView gjilaniTable = new TableView();
	
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
		
		
		
		gjilaniTable.getColumns().add(column1);
		gjilaniTable.getColumns().add(column2);
		gjilaniTable.getColumns().add(column3);
		gjilaniTable.getColumns().add(column4);
		gjilaniTable.getColumns().add(column5);
	
		
		gjilaniTable.setPrefWidth(1064);
		gjilaniTable.setPrefHeight(400);
		
		gjilaniTable.setStyle("-fx-base: darkred;");
		// Main Pane
		HBox mainPane = new HBox(10);
		
		mainPane.getChildren().add(gjilaniTable);
		
		mainPane.setPadding(new Insets(15, 15, 15 ,15));
		
		
		Scene scene = new Scene(mainPane, 543, 355);
		
		primaryStage.setTitle("Gjilani");
		primaryStage.setScene(scene);
		
		showGjilani();
		
		primaryStage.show();
	}
	

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void showGjilani() {
		List<Gjilani> gjilani = Gjilani.getgjilani();
		
		ObservableList<Gjilani> gjilaniList = FXCollections.observableArrayList();
		
		for(int i = 0; i < gjilani.size(); i++) {
			gjilaniList.add(gjilani.get(i));
		}
		
		gjilaniTable.setItems(gjilaniList);
	}
	
	
}




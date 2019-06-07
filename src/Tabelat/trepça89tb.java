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

public class trep�a89tb extends Application {

	// Table views
	private TableView trep�a89Table = new TableView();
	
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
		
		
		
		trep�a89Table.getColumns().add(column1);
		trep�a89Table.getColumns().add(column2);
		trep�a89Table.getColumns().add(column3);
		trep�a89Table.getColumns().add(column4);
		trep�a89Table.getColumns().add(column5);
	
		
		trep�a89Table.setPrefWidth(1064);
		trep�a89Table.setPrefHeight(400);
		
		trep�a89Table.setStyle("-fx-base: darkred;");
		// Main Pane
		HBox mainPane = new HBox(10);
		
		mainPane.getChildren().add(trep�a89Table);
		
		mainPane.setPadding(new Insets(15, 15, 15 ,15));
		
		
		Scene scene = new Scene(mainPane, 543, 355);
		
		primaryStage.setTitle("Trep�a89");
		primaryStage.setScene(scene);
		
		showTrep�a89();
		
		primaryStage.show();
	}
	

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void showTrep�a89() {
		List<Trep�a89> trep�a89 = Trep�a89.gettrep�a89();
		
		ObservableList<Trep�a89> trep�a89List = FXCollections.observableArrayList();
		
		for(int i = 0; i < trep�a89.size(); i++) {
			trep�a89List.add(trep�a89.get(i));
		}
		
		trep�a89Table.setItems(trep�a89List);
	}
	
	
}




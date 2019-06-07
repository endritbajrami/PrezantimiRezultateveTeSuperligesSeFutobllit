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

public class vllazniapozhorantb extends Application {

	// Table views
	private TableView vllazniapozhoranTable = new TableView();
	
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
		
		
		
		vllazniapozhoranTable.getColumns().add(column1);
		vllazniapozhoranTable.getColumns().add(column2);
		vllazniapozhoranTable.getColumns().add(column3);
		vllazniapozhoranTable.getColumns().add(column4);
		vllazniapozhoranTable.getColumns().add(column5);
	
		
		vllazniapozhoranTable.setPrefWidth(1064);
		vllazniapozhoranTable.setPrefHeight(400);
		
		vllazniapozhoranTable.setStyle("-fx-base: darkred;");
		// Main Pane
		HBox mainPane = new HBox(10);
		
		mainPane.getChildren().add(vllazniapozhoranTable);
		
		mainPane.setPadding(new Insets(15, 15, 15 ,15));
		
		
		Scene scene = new Scene(mainPane, 543, 355);
		
		primaryStage.setTitle("Vllaznia Pozhoran");
		primaryStage.setScene(scene);
		
		showVllazniapozhoran();
		
		primaryStage.show();
	}
	

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void showVllazniapozhoran() {
		List<Vllazniapozhoran> vllazniapozhoran = Vllazniapozhoran.getvllazniapozhoran();
		
		ObservableList<Vllazniapozhoran> vllazniapozhoranList = FXCollections.observableArrayList();
		
		for(int i = 0; i < vllazniapozhoran.size(); i++) {
			vllazniapozhoranList.add(vllazniapozhoran.get(i));
		}
		
		vllazniapozhoranTable.setItems(vllazniapozhoranList);
	}
	
	
}




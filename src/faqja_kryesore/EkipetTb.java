package faqja_kryesore;

import java.util.List;

import Login.Ekipet;
import Tabelat.Rangimi;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;


public class EkipetTb {
	private TableView ekipetTable = new TableView();
	public Pane start(String ekipi) {

		
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

		ekipetTable.getColumns().add(column2);
		ekipetTable.getColumns().add(column3);
		ekipetTable.getColumns().add(column4);
		ekipetTable.getColumns().add(column5);
		
		ekipetTable.setPrefWidth(460);
		ekipetTable.setPrefHeight(400);
		
		ekipetTable.setStyle("-fx-base: darkred;");
		
		HBox mainPane = new HBox(10);
		
		mainPane.getChildren().add(ekipetTable);
		
		mainPane.setPadding(new Insets(15, 15, 15 ,15));
		
		
		
		showEkipi(ekipi);
		return mainPane;
		
	}
	public void showEkipi(String ekipi) {
		List<Ekipet> Ekipii = Ekipet.getEkipet(ekipi);
		
		ObservableList<Ekipet> EKipetList = FXCollections.observableArrayList();
		
		for(int i = 0; i < Ekipii.size(); i++) {
			EKipetList.add(Ekipii.get(i));
		}
		
		ekipetTable.setItems(EKipetList);
	}
	
}

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


public class JavaTb {
	private TableView javaTable = new TableView();
	public Pane start(String java) {

		
		TableColumn<String, Rangimi> column2 = new TableColumn<>("Ekipi vendas");
		column2.setCellValueFactory(new PropertyValueFactory("Ekipi_vendas"));
		column2.setPrefWidth(120);
		
		TableColumn<String, Rangimi> column3 = new TableColumn<>("Dita");
		column3.setCellValueFactory(new PropertyValueFactory("Dita"));
		column3.setPrefWidth(120);
		
		TableColumn<String, Rangimi> column4 = new TableColumn<>("Data-Ora");
		column4.setCellValueFactory(new PropertyValueFactory("Data_ora"));
		column4.setPrefWidth(130);
		
		TableColumn<String, Rangimi> column5 = new TableColumn<>("Rezultati");
		column5.setCellValueFactory(new PropertyValueFactory("Rezultati"));
		column5.setPrefWidth(110);
		
		TableColumn<String, Rangimi> column6 = new TableColumn<>("Ekipi mysafir");
		column6.setCellValueFactory(new PropertyValueFactory("Ekipi_mysafir"));
		column6.setPrefWidth(120);

		javaTable.getColumns().add(column2);
		javaTable.getColumns().add(column3);
		javaTable.getColumns().add(column4);
		javaTable.getColumns().add(column5);
		javaTable.getColumns().add(column6);
		
		javaTable.setPrefWidth(600);
		javaTable.setPrefHeight(200);
		
		
		javaTable.setStyle("-fx-base: yellow;");
		
		HBox mainPane = new HBox(10);
		
		mainPane.getChildren().add(javaTable);
		
		
		mainPane.setPadding(new Insets(15, 15, 15 ,15));
		
		
		
		showJava(java);
		return mainPane;
		
	}
	public void showJava(String java) {
		List<Java> Javaa = Java.getJava(java);
		
		ObservableList<Java> JAvaList = FXCollections.observableArrayList();
		
		for(int i = 0; i < Javaa.size(); i++) {
			JAvaList.add(Javaa.get(i));
		}
		
		javaTable.setItems(JAvaList);
	}

}

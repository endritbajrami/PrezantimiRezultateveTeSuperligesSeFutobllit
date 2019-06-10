package faqja_kryesore;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.sql.*;


public class kerkimi extends Application {
	
	private TextField nameTxt;
	private Label resultLabel;
	private Connection dbConnection;
	@Override
	public void start(Stage primaryStage) {
		setConnection();
		HBox hbox = new HBox(5);
		nameTxt = new TextField();
		Label labelId = new Label("Numri i ekipit: ");
		labelId.setStyle(" -fx-text-fill:darkblue;-fx-font-size:18px;");
		

		Button btnFind = new Button("Kerko");
		 btnFind.setStyle("-fx-border-color: darkblue; -fx-border-width: 1px;");

		hbox.getChildren().addAll(labelId, nameTxt, btnFind);

		btnFind.setOnAction(e -> {
			findRecord();
		});

		VBox vbox = new VBox();

		vbox.setPadding(new Insets(20, 20, 20, 20));

		resultLabel = new Label();
		resultLabel.setStyle("-fx-background-color: darkblue; -fx-text-fill:white");
		resultLabel.setFont(new Font("Arial", 18));

		vbox.getChildren().addAll(hbox, resultLabel);

		Scene scene = new Scene(vbox, 400, 300);

		primaryStage.setTitle("Hapesira per kerkim");
		primaryStage.setScene(scene);

		primaryStage.show();
	}

	 private void setConnection() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				dbConnection = DriverManager.getConnection("jdbc:mysql://localhost/knk?autoReconnect=true&useSSL=false", "root", "root");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}


	public static void main(String[] args) {
		Application.launch(args);
	}

	private void findRecord() { 
		try {
			Statement statement = dbConnection.createStatement();
			String query = "Select * from Rangimi where Nr = " + nameTxt.getText();
			ResultSet resultSet = statement.executeQuery(query);

			if(resultSet.next()) {
				resultLabel.setText("Ekipi:" +resultSet.getString(3)+ "  "+"NrLojëve:" +resultSet.getString(4) +"  "+"Fitore:" +resultSet.getString(5)+"  "+"Barazime:" +resultSet.getString(6)+"  " +"Humbje: "+resultSet.getString(7));
			} else {
				resultLabel.setText("Rangimi nuk eshte gjetur!");
			}
			
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
}

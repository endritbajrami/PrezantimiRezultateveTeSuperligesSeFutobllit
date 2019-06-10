package faqja_kryesore;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Loja extends Application{
	private Stage loja;
	@Override 
	public void start(Stage primaryStage) {
		loja = primaryStage;
		Pane pane = new Pane();
		pane.setStyle("-fx-background-image:url(images/fusha.jpg)");
		
		Text text1 = new Text ( 70,30,"1");
		Text text2 = new Text ( 100,30,"2");
		Text text3 = new Text ( 130,30,"3");
		Text text4 = new Text ( 160,30,"4");
		Text text5 = new Text ( 190,30,"5");
		Text text6 = new Text ( 220,30,"6");
		Text text7 = new Text ( 250,30,"7");
		Text text8 = new Text ( 280,30,"8");
		Text text9 = new Text ( 310,30,"9");
		Text text10 = new Text ( 340,30,"10");
		Text text11 = new Text ( 390,30,"11");
		
		
		String TEXT=("-fx-fill: white;-fx-font-size:36");
		text1.setStyle(TEXT);
		text2.setStyle(TEXT);
		text3.setStyle(TEXT);
		text4.setStyle(TEXT);
		text5.setStyle(TEXT);
		text6.setStyle(TEXT);
		text7.setStyle(TEXT);
		text8.setStyle(TEXT);
		text9.setStyle(TEXT);
		text10.setStyle(TEXT);
		text11.setStyle(TEXT);
		Button backBtn = new Button("<-");
		backBtn.setStyle("-fx-background-color: black; -fx-text-fill: white;-fx-background-radius: 15");
		backBtn.setOnMouseClicked(e->{
			if(e.getButton()==MouseButton.PRIMARY) {
				loja.hide();
				Stage menu = new Stage();
				menu Menu = new menu();
				Menu.start(menu);
				menu.show();
			}
		});
		
		
		text1.setOnMouseDragged(e ->{
			if(e.getButton() == MouseButton.PRIMARY) {
				text1.setX(e.getX());
				text1.setY(e.getY());
			}
		});
		
		text2.setOnMouseDragged(e ->{
			if(e.getButton() == MouseButton.PRIMARY) {
				text2.setX(e.getX());
				text2.setY(e.getY());
			}
		});
		text3.setOnMouseDragged(e ->{
			if(e.getButton() == MouseButton.PRIMARY) {
				text3.setX(e.getX());
				text3.setY(e.getY());
			}
		});
		text4.setOnMouseDragged(e ->{
			if(e.getButton() == MouseButton.PRIMARY) {
				text4.setX(e.getX());
				text4.setY(e.getY());
			}
		});
		text5.setOnMouseDragged(e ->{
			if(e.getButton() == MouseButton.PRIMARY) {
				text5.setX(e.getX());
				text5.setY(e.getY());
			}
		});
		text6.setOnMouseDragged(e ->{
			if(e.getButton() == MouseButton.PRIMARY) {
				text6.setX(e.getX());
				text6.setY(e.getY());
			}
		});
		text7.setOnMouseDragged(e ->{
			if(e.getButton() == MouseButton.PRIMARY) {
				text7.setX(e.getX());
				text7.setY(e.getY());
			}
		});
		text8.setOnMouseDragged(e ->{
			if(e.getButton() == MouseButton.PRIMARY) {
				text8.setX(e.getX());
				text8.setY(e.getY());
			}
		});
		text9.setOnMouseDragged(e ->{
			if(e.getButton() == MouseButton.PRIMARY) {
				text9.setX(e.getX());
				text9.setY(e.getY());
			}
		});
		text10.setOnMouseDragged(e ->{
			if(e.getButton() == MouseButton.PRIMARY) {
				text10.setX(e.getX());
				text10.setY(e.getY());
			}
		});
		text11.setOnMouseDragged(e ->{
			if(e.getButton() == MouseButton.PRIMARY) {
				text11.setX(e.getX());
				text11.setY(e.getY());
			}
		});
		pane.getChildren().addAll(backBtn,text1, text2,text3, text4,text5,text6,text7,text8,text9,text10,text11);
		
		
		Scene scene = new Scene (pane, 1300, 850);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Krijoni ekipin tuaj");
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);

	}

}

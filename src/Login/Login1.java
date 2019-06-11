package Login;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Login1 extends Application {
	private Stage Login11;
	public void start(Stage primaryStage) {
		Login11 = primaryStage;
		VBox pane = new VBox(10);
		pane.setAlignment(Pos.CENTER);
		pane.setStyle("-fx-background-image:url(images/fotologin1.jpg)");
		pane.setPadding(new Insets(0,0,0,0));
		pane.setSpacing(0);
		HBox Hpane = new HBox();
		Hpane.setPadding(new Insets(0,20,0,200));
		Hpane.setSpacing(60);
		Button btnSignup = new Button("SignUp");
		Button btnLogin = new Button("LogIn");
		 btnLogin.setStyle("-fx-background-color: black; -fx-text-fill: white;-fx-background-radius: 15");
		 btnLogin.setOnMouseClicked(e->{
			 if(e.getButton()== MouseButton.PRIMARY) {
				 Login11.hide();			 
				 Stage Login2Stage = new Stage();
				 Login2 L2 = new Login2();
				 L2.start(Login2Stage);
				 Login2Stage.show();
			 }
		 });
		
		 btnSignup.setStyle("-fx-background-color: black; -fx-text-fill: white;-fx-background-radius: 15");
		 btnSignup.setOnMouseClicked(e->{
			 if(e.getButton()== MouseButton.PRIMARY) {
				 Login11.hide();			 
				 Stage SignupStage = new Stage();
				 SignUp Su = new SignUp();
				 Su.start(SignupStage);
				 SignupStage.show();
			 }
		 });
		 btnLogin.setOnKeyPressed(e->{
			 if(e.getCode() == KeyCode.ENTER) {
				 Login11.hide();			 
				 Stage Login2Stage = new Stage();
				 Login2 L2 = new Login2();
				 L2.start(Login2Stage);
				 Login2Stage.show();
			 }
			 if(e.getCode() == KeyCode.LEFT) {
				 btnSignup.requestFocus();
			 }
		 });
		 btnSignup.setOnKeyPressed(e->{
			 if(e.getCode() == KeyCode.ENTER) {
				 Login11.hide();			 
				 Stage SignupStage = new Stage();
				 SignUp Su = new SignUp();
				 Su.start(SignupStage);
				 SignupStage.show();
			 }
			 if(e.getCode() == KeyCode.LEFT) {
				 btnLogin.requestFocus();
			 }
		 });
		 Image image = new Image("images/fotologin.png");
		
		ImageView imageView = new ImageView(image);
		imageView.setFitWidth(300);
		imageView.setFitHeight(200);
		Hpane.getChildren().addAll(btnLogin,btnSignup);
		pane.getChildren().addAll(imageView,Hpane);
		
		Scene scene = new Scene(pane,600,400);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Ipko SuperLiga");
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}

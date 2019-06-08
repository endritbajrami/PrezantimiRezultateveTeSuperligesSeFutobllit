package Login;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SignUp extends Application {
	private Stage Signup;
	public void start(Stage primaryStage) {
		Signup = primaryStage;
		VBox vpane = new VBox();
		vpane.setAlignment(Pos.CENTER);
		vpane.setPadding(new Insets(80,20,20,20));
		vpane.setSpacing(10);
		vpane.setStyle("-fx-background-image:url(images/fotologin1.jpg)");
		HBox hpane = new HBox();
		hpane.setPadding(new Insets(30,140,20,20));
		hpane.setAlignment(Pos.CENTER_RIGHT);
		Label username = new Label("Username");
		Label pass = new Label("Password");
		TextField Uname = new TextField();
		Uname.setMaxWidth(300);
		Uname.setMinHeight(30);
		TextField Pwd = new TextField();
		Pwd.setMaxWidth(300);
		Pwd.setMinHeight(30);
		Button signupBtn = new Button("SignUp");
		Button back = new Button("Back");
		back.setOnMouseClicked(e->{
			 if(e.getButton()== MouseButton.PRIMARY) {
				 Signup.hide();			 
				 Stage Login1Stage = new Stage();
				 Login1 L1 = new Login1();
				 L1.start(Login1Stage);
				 Login1Stage.show();
			 }
		});
		back.setStyle("-fx-background-color: green; -fx-text-fill: white;-fx-border-color:white");
		signupBtn.setStyle("-fx-background-color: green; -fx-text-fill: white;-fx-border-color:white");
		
		hpane.getChildren().addAll(back,signupBtn);
		vpane.getChildren().addAll(username,Uname,pass,Pwd,hpane);
		
		Scene scene = new Scene(vpane,600,400);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Sign up");
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}

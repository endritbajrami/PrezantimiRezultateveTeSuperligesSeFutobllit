package Login;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Login1 extends Application {
	public void start(Stage primaryStage) {
		VBox pane = new VBox(10);
		pane.setAlignment(Pos.CENTER);
		pane.setStyle("-fx-background-image:url(images/fotologin1.jpg)");
		pane.setPadding(new Insets(0,0,0,0));
		pane.setSpacing(0);
		HBox Hpane = new HBox();
		Hpane.setPadding(new Insets(0,20,0,200));
		Hpane.setSpacing(60);
		
		Button btnLogin = new Button("LOGIN");
		Button btnSignup = new Button("SIGNUP");
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

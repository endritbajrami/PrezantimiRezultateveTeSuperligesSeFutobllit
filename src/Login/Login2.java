package Login;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import faqja_kryesore.LidhjaDB;
import faqja_kryesore.menu;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Login2 extends Application {
	private Stage Login22;
	private TextField Uname = new TextField();
	private PasswordField Pwd = new PasswordField();
	public void start(Stage primaryStage) {
		Login22 = primaryStage;
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
		
		Uname.setMaxWidth(300);
		Uname.setMinHeight(30);
		
		Pwd.setMaxWidth(300);
		Pwd.setMinHeight(30);
		Button loginBtn = new Button("LogIn");
		Button back = new Button("Back");
		back.setStyle("-fx-background-color: black; -fx-text-fill: white;-fx-background-radius: 15");
		loginBtn.setStyle("-fx-background-color: black; -fx-text-fill: white;-fx-background-radius: 15");
		loginBtn.setOnMouseClicked(e->{
			 if(e.getButton()== MouseButton.PRIMARY) {
				 String query = "Select * from users where username = ?";
					
					try {
						
						PreparedStatement preparedStatement = LidhjaDB.getConnection().prepareStatement(query);
						
						preparedStatement.setString(1, Uname.getText());
						

						ResultSet result = preparedStatement.executeQuery();
						
						if(result.next()) {
							String pwdH = result.getString(3);
							String pwd = Pwd.getText();
							if(checkPassword(pwd, pwdH)) {
								Alert alert = new Alert(AlertType.INFORMATION);
								alert.setTitle("Login result");
								alert.setHeaderText(null);
								alert.setContentText("You are logged in!");
								alert.showAndWait();
								
								Login22.hide();			 
								 Stage Menu = new Stage();
								 menu M = new menu();
								 M.start(Menu);
								 Menu.show();
							}else {
								Alert alert = new Alert(AlertType.INFORMATION);
								alert.setTitle("Login result");
								alert.setHeaderText(null);
								alert.setContentText("Password is wrong!");
								alert.showAndWait();
							}
						} else {
							Alert alert = new Alert(AlertType.INFORMATION);
							alert.setTitle("Login result");
							alert.setHeaderText(null);
							alert.setContentText("Username or password is wrong!");
							alert.showAndWait();
							
						}
						
					} catch(SQLException ex) {
						Alert alert = new Alert(AlertType.ERROR);
						alert.setTitle("Database problem");
						alert.setHeaderText(null);
						alert.setContentText(ex.getMessage());
						alert.showAndWait();
						System.exit(0);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}}
		});
		loginBtn.setOnKeyPressed(e->{
			if(e.getCode() == KeyCode.ENTER) {
				 String query = "Select * from users where username = ?";
					
					try {
						
						PreparedStatement preparedStatement = LidhjaDB.getConnection().prepareStatement(query);
						
						preparedStatement.setString(1, Uname.getText());
						

						ResultSet result = preparedStatement.executeQuery();
						
						if(result.next()) {
							String pwdH = result.getString(3);
							String pwd = Pwd.getText();
							if(checkPassword(pwd, pwdH)) {
								Alert alert = new Alert(AlertType.INFORMATION);
								alert.setTitle("Login result");
								alert.setHeaderText(null);
								alert.setContentText("You are logged in!");
								alert.showAndWait();
								
								Login22.hide();			 
								 Stage Menu = new Stage();
								 menu M = new menu();
								 M.start(Menu);
								 Menu.show();
							}else {
								Alert alert = new Alert(AlertType.INFORMATION);
								alert.setTitle("Login result");
								alert.setHeaderText(null);
								alert.setContentText("Password is wrong!");
								alert.showAndWait();
							}
						} else {
							Alert alert = new Alert(AlertType.INFORMATION);
							alert.setTitle("Login result");
							alert.setHeaderText(null);
							alert.setContentText("Username or password is wrong!");
							alert.showAndWait();
							
						}
						
					} catch(SQLException ex) {
						Alert alert = new Alert(AlertType.ERROR);
						alert.setTitle("Database problem");
						alert.setHeaderText(null);
						alert.setContentText(ex.getMessage());
						alert.showAndWait();
						System.exit(0);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
			 if(e.getCode() == KeyCode.LEFT) {
				 back.requestFocus();
			 }
		});
		back.setOnMouseClicked(e->{
			 if(e.getButton()== MouseButton.PRIMARY) {
				 Login22.hide();			 
				 Stage Login1Stage = new Stage();
				 Login1 L1 = new Login1();
				 L1.start(Login1Stage);
				 Login1Stage.show();
			 }
		});
		back.setOnKeyPressed(e->{
			if(e.getCode() == KeyCode.ENTER) {
				 Login22.hide();			 
				 Stage Login1Stage = new Stage();
				 Login1 L1 = new Login1();
				 L1.start(Login1Stage);
				 Login1Stage.show();
			}
			 if(e.getCode() == KeyCode.RIGHT) {
				 loginBtn.requestFocus();
			 }
		});
		 Uname.setOnKeyPressed(e->{
			 if(e.getCode() == KeyCode.DOWN) {
				 Pwd.requestFocus();
			 }
		 });
		 Pwd.setOnKeyPressed(e->{
			 if(e.getCode() == KeyCode.DOWN) {
				 back.requestFocus();
			 }
			 if(e.getCode() == KeyCode.UP) {
				 Uname.requestFocus();
			 }
			 
		 });
		
		hpane.getChildren().addAll(back,loginBtn);
		vpane.getChildren().addAll(username,Uname,pass,Pwd,hpane);
		
		Scene scene = new Scene(vpane,600,400);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Login");
		primaryStage.show();
		
		
	}
	public boolean checkPassword(String password,String SaltedHash) throws NoSuchAlgorithmException {
	 
         
         MessageDigest md = MessageDigest.getInstance("SHA");
         byte[] messageDigest = md.digest(password.getBytes());
         BigInteger no = new BigInteger(1, messageDigest);
         String hashtext = no.toString(16);
         if(SaltedHash.equals(hashtext)) {
        	 return true;
         }else {
        	 return false;
         }
     }  
	public static void main(String[] args) {
		Application.launch(args);
	}
}
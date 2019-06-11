package Login;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import faqja_kryesore.LidhjaDB;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SignUp extends Application {
	private Stage Signup;
	private TextField Uname = new TextField();
	private PasswordField Pwd = new PasswordField();
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
		
		Uname.setMaxWidth(300);
		Uname.setMinHeight(30);
		
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
		back.setStyle("-fx-background-color: black; -fx-text-fill: white;-fx-background-radius: 15");
		signupBtn.setStyle("-fx-background-color: black; -fx-text-fill: white;-fx-background-radius: 15");
		Label resultLabel =new Label();
		hpane.getChildren().addAll(resultLabel,back,signupBtn);
		vpane.getChildren().addAll(username,Uname,pass,Pwd,hpane);
		signupBtn.setOnMouseClicked(e->{
			 if(e.getButton()== MouseButton.PRIMARY) {
				 try {
						
						String query = "INSERT INTO users(username,password) VALUES (?, ?)";
						
						PreparedStatement preparedStatement = LidhjaDB.getConnection().prepareStatement(query);
						String pwd =  createPassword(Pwd.getText());
						preparedStatement.setString(1, Uname.getText());
						preparedStatement.setString(2,pwd);
						String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}";
						
						if((preparedStatement.executeUpdate() > 0)&&(Uname.getText().matches("[A-Za-z0-9]+"))&&(Pwd.getText().matches(pattern)) ) {
							resultLabel.setText("Student added");
							 Signup.hide();			 
							 Stage Login2Stage = new Stage();
							 Login2 L2 = new Login2();
							 L2.start(Login2Stage);
							 Login2Stage.show();
						} else {
							resultLabel.setText("User not added!");
							Uname.setText("");
							Pwd.setText("");
						}
						
						
					} catch(SQLException ex) {
						ex.printStackTrace();
					
					}}
				
			 
		});
		
		Scene scene = new Scene(vpane,600,400);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Sign up");
		primaryStage.show();
		
		
	}
		public  String createPassword(String password) { 
	        try { 
	        	  
	            // Static getInstance method is called with hashing MD5 
	            MessageDigest md = MessageDigest.getInstance("SHA"); 
	  
	            // digest() method is called to calculate message digest 
	            //  of an input digest() return array of byte 
	            byte[] messageDigest = md.digest(password.getBytes()); 
	  
	            // Convert byte array into signum representation 
	            BigInteger no = new BigInteger(1, messageDigest); 
	  
	            // Convert message digest into hex value 
	            String hashtext = no.toString(16); 
	
	            return hashtext; 
	        }  
	  
	        // For specifying wrong message digest algorithms 
	        catch (NoSuchAlgorithmException e) { 
	            throw new RuntimeException(e); 
	        } 
	    } 
	public static void main(String[] args) {
		Application.launch(args);
	}
}
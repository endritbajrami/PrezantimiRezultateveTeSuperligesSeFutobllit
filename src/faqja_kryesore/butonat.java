package faqja_kryesore;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class butonat extends Application {
  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) {

    Button btn = new Button();
    Button btn2 = new Button();
    Button btn3 = new Button();
    final Label lbl = new Label();
    final Image image = new Image("images/feronikeli.jpg");
    final Image image2 = new Image("images/trepca.jpg");
    final Image image3 = new Image("images/gilan.jpg");
    final Image image4 = new Image("images/kek.jpg");
    final Image image5 = new Image("images/liria.jpg");
  
    final ImageView iv1 = new ImageView();
    final ImageView iv2 = new ImageView();
//    final ImageView iv3 = new ImageView();
//    final ImageView iv4 = new ImageView();
//    final ImageView iv5 = new ImageView();
   

    primaryStage.setTitle("TE DHENAT E FUNDIT!");

    lbl.setLayoutX(50);
    lbl.setLayoutY(100);
    lbl.setFont(Font.font("Cambria", 32));

    btn.setLayoutX(50);
    btn.setLayoutY(50);
    btn.setStyle("-fx-background-color:green");
    btn2.setLayoutX(200);
    btn2.setLayoutY(50);
    btn2.setStyle("-fx-background-color:orange");
    btn3.setLayoutX(300);
    btn3.setLayoutY(50);
    btn3.setStyle("-fx-background-color:red");
    btn.setText("Champions League!");
    btn2.setText("Play-out!");
    btn3.setText("Renie nga liga!");
    
    btn.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {
        lbl.setText("KF Feronikeli!");
        iv1.setImage(image);
        iv1.setX(50);
        iv1.setY(150);
        iv2.setImage(null);
        
      }
    });
    btn2.setOnAction(new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent event) {
          lbl.setText("Trepça'89 dhe Gjilani!");
         
          iv1.setImage(image2);
          iv1.setX(50);
          iv1.setY(150);
        
          iv2.setImage(image3);
          iv2.setX(200);
          iv2.setY(150);
          iv2.setFitHeight(100);
          iv2.setFitWidth(100);
        }
      });
    btn3.setOnAction(new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent event) {
          lbl.setText("KEK-u dhe Liria!");
         
          iv1.setImage(image4);
          iv1.setX(50);
          iv1.setY(150);
          
          iv2.setImage(image5);
          iv2.setX(200);
          iv2.setY(150);
          iv2.setFitHeight(150);
          iv2.setFitWidth(150);
          
        }
      });

    HBox hbox= new HBox ();

    hbox.getChildren().addAll(btn, btn2, btn3);
    hbox.getChildren().add(lbl);
    hbox.getChildren().addAll(iv1,iv2);
    primaryStage.setScene(new Scene(hbox, 450, 250));
    primaryStage.show();
  }
}

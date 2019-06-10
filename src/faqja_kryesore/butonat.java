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
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class butonat {
  public static void main(String[] args) {
    Application.launch(args);
  }

  public Pane start() {

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
    final ImageView iv3 = new ImageView();
    final ImageView iv4 = new ImageView();
    final ImageView iv5 = new ImageView();
   

    

    lbl.setLayoutX(330);
    lbl.setLayoutY(0);
    lbl.setFont(Font.font("Cambria", 32));

    btn.setLayoutX(200);
    btn.setLayoutY(200);
    btn.setStyle("-fx-background-color:green");
    btn2.setLayoutX(400);
    btn2.setLayoutY(200);
    btn2.setStyle("-fx-background-color:orange");
    btn3.setLayoutX(500);
    btn3.setLayoutY(200);
    btn3.setStyle("-fx-background-color:red");
    btn.setText("Champions League!");
    btn2.setText("Play-out!");
    btn3.setText("Renie nga liga!");
    
    btn.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {
        lbl.setText("KF Feronikeli!");
        iv1.setImage(image);
        iv1.setX(380);
        iv1.setY(50);
        iv1.setFitHeight(120);
        iv1.setFitWidth(120);
        iv2.setImage(null);
        iv3.setImage(null);
        iv4.setImage(null);
        iv5.setImage(null);
        
      }
    });
    btn2.setOnAction(new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent event) {
          lbl.setText("Trepça'89 dhe Gjilani!");
         
          iv2.setImage(image2);
          iv2.setX(300);
          iv2.setY(50);
          iv2.setFitHeight(120);
          iv2.setFitWidth(120);
          iv4.setImage(null);
          iv5.setImage(null);
          iv1.setImage(null);
          iv3.setImage(image3);
          iv3.setX(500);
          iv3.setY(50);
          iv3.setFitHeight(120);
          iv3.setFitWidth(120);
        }
      });
    btn3.setOnAction(new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent event) {
          lbl.setText("KEK-u dhe Liria!");
          iv1.setImage(null);
          iv2.setImage(null);
          iv3.setImage(null);
          iv4.setImage(image4);
          iv4.setX(300);
          iv4.setY(50);
          iv4.setFitHeight(120);
          iv4.setFitWidth(120);
          
          iv5.setImage(image5);
          iv5.setX(500);
          iv5.setY(50);
          iv5.setFitHeight(120);
          iv5.setFitWidth(120);
          
        }
      });

    Pane root = new Pane();

    root.getChildren().addAll(btn, btn2, btn3);
    root.getChildren().add(lbl);
    root.getChildren().addAll(iv1,iv2,iv3,iv4,iv5);
    return root;
  }
}

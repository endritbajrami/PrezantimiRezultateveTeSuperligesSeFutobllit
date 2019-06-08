package faqja_kryesore;



import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class menu extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Menus");
        Group root = new Group();
        Scene scene = new Scene(root, 1000, 600, Color.DARKOLIVEGREEN); //DARKKHAKI
        
        MenuBar menuBar = new MenuBar();
    
        Menu menu = new Menu("Rangimi");
        Menu menu2 = new Menu("Rezultatet");
       
        menu.getItems().add(new MenuItem("Kryesor"));
        menu.getItems().add(new MenuItem("Vendor"));
        menu.getItems().add(new MenuItem("Mysafir"));
        menu.setGraphic(new ImageView("images/trofe.png"));
      
        
        menu2.getItems().add(new MenuItem("Java1"));
        menu2.getItems().add(new MenuItem("Java2"));
        menu2.getItems().add(new MenuItem("Java3"));
        menu2.getItems().add(new MenuItem("Java4"));
        menu2.getItems().add(new MenuItem("Java5"));
        menu2.getItems().add(new MenuItem("Java6"));
        menu2.getItems().add(new MenuItem("Java7"));
        menu2.getItems().add(new MenuItem("Java8"));
        menu2.getItems().add(new MenuItem("Java9"));
        menu2.getItems().add(new MenuItem("Java10"));
        menu2.getItems().add(new MenuItem("Java11"));
        menu2.getItems().add(new MenuItem("Java12"));
        menu2.getItems().add(new MenuItem("Java13"));
        menu2.getItems().add(new MenuItem("Java14"));
        menu2.getItems().add(new MenuItem("Java15"));
        menu2.setGraphic(new ImageView("images/ball.png"));
     
        
        Menu menu3= new Menu("Ekipet");
        menu3.getItems().addAll(new MenuItem("Prishtina"), new MenuItem("Besa-Peje"),new MenuItem("Trepca 89"),new MenuItem("Drita"),new MenuItem("KF Llapi"),new MenuItem("KF Feronikeli"),new MenuItem("Drenica"),new MenuItem("Liria"),new MenuItem("Gjilani"),new MenuItem("Vellazenimi"),new MenuItem("Flamurtari"),new MenuItem("V.Pozhoran"));
        menu3.setGraphic(new ImageView("images/football-player.png"));
        Menu menu4=new Menu("Formacioni");
       menu4.setGraphic(new ImageView("images/tshirt.png"));
        
        menuBar.getMenus().addAll(menu, menu2, menu3, menu4);
        
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        
        
        
        root.getChildren().add(menuBar); 
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
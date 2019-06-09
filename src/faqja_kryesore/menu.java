package faqja_kryesore;



import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import Tabelat.*;
import Login.Login1;

public class menu extends Application {
	
	private Stage Menu;
    private Pane pane = new Pane();
    public static void main(String[] args) {
        Application.launch(args);
    }
    public void setPane(Pane pane) {
    	this.pane = pane;
    }
    public Pane getPane() {
    	return pane;
    }
    @Override
    
    public void start(Stage primaryStage) {
    	Menu = primaryStage;
        primaryStage.setTitle("Menus");
        Group root = new Group();
        Rangimitb rangimiKryesor = new Rangimitb();
        
        MenuBar menuBar = new MenuBar();
        
        Menu menu = new Menu("Rangimi");
        Menu menu2 = new Menu("Rezultatet");
        Label logoutL = new Label("                                                                                                             LogOut");
        logoutL.setMaxHeight(menuBar.getMaxHeight());
        logoutL.setOnMouseClicked(e->{
        	if(e.getButton() == MouseButton.PRIMARY) {
        		Menu.hide();
        		Stage Login1S = new Stage();
        		Login1 L1 = new Login1();
        		L1.start(Login1S);
        		
        		Login1S.show();
        	}
        });
        Menu logout = new Menu("",logoutL);
        
        
        ToggleGroup menuToggle = new ToggleGroup();
        
        RadioMenuItem Kr =new RadioMenuItem("Kryesor");
        RadioMenuItem Ve =new RadioMenuItem("Vendor");
        RadioMenuItem My = new RadioMenuItem("Mysafir");
        
        Kr.setToggleGroup(menuToggle);
        Ve.setToggleGroup(menuToggle);
        My.setToggleGroup(menuToggle);
        
        
        menu.setGraphic(new ImageView("images/trofe.png"));
        menu.getItems().addAll(Kr,Ve,My);
        
        
        menu2.getItems().add(new RadioMenuItem("Java1"));
        menu2.getItems().add(new RadioMenuItem("Java2"));
        menu2.getItems().add(new RadioMenuItem("Java3"));
        menu2.getItems().add(new RadioMenuItem("Java4"));
        menu2.getItems().add(new RadioMenuItem("Java5"));
        menu2.getItems().add(new RadioMenuItem("Java6"));
        menu2.getItems().add(new RadioMenuItem("Java7"));
        menu2.getItems().add(new RadioMenuItem("Java8"));
        menu2.getItems().add(new RadioMenuItem("Java9"));
        menu2.getItems().add(new RadioMenuItem("Java10"));
        menu2.getItems().add(new RadioMenuItem("Java11"));
        menu2.getItems().add(new RadioMenuItem("Java12"));
        menu2.getItems().add(new RadioMenuItem("Java13"));
        menu2.getItems().add(new RadioMenuItem("Java14"));
        menu2.getItems().add(new RadioMenuItem("Java15"));
        menu2.setGraphic(new ImageView("images/ball.png"));
     
        
        Menu menu3= new Menu("Ekipet");
        RadioMenuItem Pri = new RadioMenuItem("Prishtina");
        RadioMenuItem BP = new RadioMenuItem("Besa-Peje");
        RadioMenuItem T89 = new RadioMenuItem("Trepca 89");
        RadioMenuItem Dri = new RadioMenuItem("Drita");
        RadioMenuItem KLl = new RadioMenuItem("KF Llapi");
        RadioMenuItem KFero = new RadioMenuItem("KF Feronikeli");
        RadioMenuItem Dre = new RadioMenuItem("Drenica");
        RadioMenuItem Lir = new RadioMenuItem("Liria");
        RadioMenuItem Gjil = new RadioMenuItem("Gjilani");
        RadioMenuItem Vell = new RadioMenuItem("Vellazenimi");
        RadioMenuItem Flam = new RadioMenuItem("Flamurtari");
        RadioMenuItem VP = new RadioMenuItem("V.Pozhoran");
        
        Pri.setToggleGroup(menuToggle);
        BP.setToggleGroup(menuToggle);
        T89.setToggleGroup(menuToggle);
        Dri.setToggleGroup(menuToggle);
        KLl.setToggleGroup(menuToggle);
        KFero.setToggleGroup(menuToggle);
        Dre.setToggleGroup(menuToggle);
        Lir.setToggleGroup(menuToggle);
        Gjil.setToggleGroup(menuToggle);
        Vell.setToggleGroup(menuToggle);
        Flam.setToggleGroup(menuToggle);
        VP.setToggleGroup(menuToggle);
        
		if(Pri.isSelected()) {
		       prishtinatb PRtb = new prishtinatb();
		       setPane(PRtb.start());
		        }
        
        
        menu3.getItems().addAll(Pri,BP,T89,Dri,KLl,KFero,Dre,Lir,Gjil,Vell,Flam,VP);
        menu3.setGraphic(new ImageView("images/football-player.png"));
        
        Label FormLabel = new Label("Formacioni");
        FormLabel.setGraphic(new ImageView("images/tshirt.png"));
        FormLabel.setMaxHeight(menuBar.getMaxHeight());
        FormLabel.setOnMouseClicked(e->{
        	if(e.getButton() == MouseButton.PRIMARY) {
        		Menu.hide();
        		Stage LojaStage = new Stage();
        		Loja loja = new Loja();
        		loja.start(LojaStage);
        		LojaStage.show();
        	}
        });
        Menu menu4=new Menu("",FormLabel);
        HBox hb = new HBox();
        VBox vb = new VBox();
        
        
        menuBar.getMenus().addAll(menu, menu2, menu3, menu4,logout);
        
        kryefaqja kr = new kryefaqja();
        
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        getPane().setMaxSize(900, 500);
        
        pane.setMaxSize(800, 400);
        root.getChildren().addAll(menuBar); 
       
    	hb.getChildren().addAll(kr.start(),getPane());
    	
        
       
        vb.getChildren().addAll(root,hb);
        vb.setStyle("-fx-background-color: Darkolivegreen");
        Scene scene = new Scene(vb, 1000, 600); //DARKKHAKI
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
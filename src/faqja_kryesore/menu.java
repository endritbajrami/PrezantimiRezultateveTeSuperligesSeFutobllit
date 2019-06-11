package faqja_kryesore;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import Tabelat.*;
import Login.Login1;

public class menu extends Application {
	
	private Stage Menu;
    public static void main(String[] args) {
        Application.launch(args);
    }
  
    @Override
    
    public void start(Stage primaryStage) {
    	primaryStage.setScene(null);
    	Menu = primaryStage;
        primaryStage.setTitle("Menus");
        Group root = new Group();
        
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Rangimi");
       
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
        Rangimitb ra = new Rangimitb();
        
        RadioMenuItem Kr =new RadioMenuItem("Kryesor");
        RadioMenuItem St =new RadioMenuItem("Stadiumet");
       
       
        Kr.setToggleGroup(menuToggle);
        St.setToggleGroup(menuToggle);
        
        St.setOnAction(e->{
    		Stage StadiumetStage = new Stage();
    		Stadiumet stadiumet = new Stadiumet();
    		stadiumet.start(StadiumetStage);
    		StadiumetStage.show();
        });
      
        
        menu.setGraphic(new ImageView("images/trofe.png"));
        menu.getItems().addAll(Kr,St);
        
       
        Menu menu2 = new Menu("Rezultatet");
        RadioMenuItem j1 = new RadioMenuItem("Java1");
        RadioMenuItem j2 = new RadioMenuItem("Java2");
        RadioMenuItem j3 = new RadioMenuItem("Java3");
        RadioMenuItem j4 = new RadioMenuItem("Java4");
        RadioMenuItem j5 = new RadioMenuItem("Java5");
        RadioMenuItem j6 = new RadioMenuItem("Java6");
        RadioMenuItem j7 = new RadioMenuItem("Java7");
        RadioMenuItem j8 = new RadioMenuItem("Java8");
        RadioMenuItem j9 = new RadioMenuItem("Java9");
        RadioMenuItem j10 = new RadioMenuItem("Java10");
        RadioMenuItem j11 = new RadioMenuItem("Java11");
        RadioMenuItem j12 = new RadioMenuItem("Java12");
        RadioMenuItem j13 = new RadioMenuItem("Java13");
        RadioMenuItem j14 = new RadioMenuItem("Java14");
        RadioMenuItem j15 = new RadioMenuItem("Java15");
        
        j1.setToggleGroup(menuToggle);
        j2.setToggleGroup(menuToggle);
        j3.setToggleGroup(menuToggle);
        j4.setToggleGroup(menuToggle);
        j5.setToggleGroup(menuToggle);
        j6.setToggleGroup(menuToggle);
        j7.setToggleGroup(menuToggle);
        j8.setToggleGroup(menuToggle);
        j9.setToggleGroup(menuToggle);
        j10.setToggleGroup(menuToggle);
        j11.setToggleGroup(menuToggle);
        j12.setToggleGroup(menuToggle);
        j13.setToggleGroup(menuToggle);
        j14.setToggleGroup(menuToggle);
        j15.setToggleGroup(menuToggle);
        
        menu2.setGraphic(new ImageView("images/ball.png"));
        menu2.getItems().addAll(j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12,j13,j14,j15);
        
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
        VBox vb1 = new VBox();
       
        menuBar.getMenus().addAll(menu, menu2, menu3, menu4,logout);
        
        kryefaqja kr = new kryefaqja();
        butonat bt = new butonat();
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
      
        root.getChildren().addAll(menuBar); 

        Pri.setOnAction(e->{tabelatEkipeve("prishtina");});
        BP.setOnAction(e->{tabelatEkipeve("besapeje");});
        T89.setOnAction(e->{tabelatEkipeve("trepça89");});
        Dri.setOnAction(e->{tabelatEkipeve("drita");});
        KLl.setOnAction(e->{tabelatEkipeve("kfllapi");});
        KFero.setOnAction(e->{tabelatEkipeve("kfferonikeli");});
        Dre.setOnAction(e->{tabelatEkipeve("drenica");});
        Lir.setOnAction(e->{tabelatEkipeve("liria");});
        Gjil.setOnAction(e->{tabelatEkipeve("gjilani");});
        Vell.setOnAction(e->{tabelatEkipeve("vllaznimi");});
        Flam.setOnAction(e->{tabelatEkipeve("flamurtari");});
        VP.setOnAction(e->{tabelatEkipeve("vllazniapozhoran");});
        
        j1.setOnAction(e->{tabelatJavet("rezultatet2017_18_java1");});
        j2.setOnAction(e->{tabelatJavet("rezultatet2017_18_java2");});
        j3.setOnAction(e->{tabelatJavet("rezultatet2017_18_java3");});
        j4.setOnAction(e->{tabelatJavet("rezultatet2017_18_java4");});
        j5.setOnAction(e->{tabelatJavet("rezultatet2017_18_java5");});
        j6.setOnAction(e->{tabelatJavet("rezultatet2017_18_java6");});
        j7.setOnAction(e->{tabelatJavet("rezultatet2017_18_java7");});
        j8.setOnAction(e->{tabelatJavet("rezultatet2017_18_java8");});
        j9.setOnAction(e->{tabelatJavet("rezultatet2017_18_java9");});
        j10.setOnAction(e->{tabelatJavet("rezultatet2017_18_java10");});
        j11.setOnAction(e->{tabelatJavet("rezultatet2017_18_java11");});
        j12.setOnAction(e->{tabelatJavet("rezultatet2017_18_java12");});
        j13.setOnAction(e->{tabelatJavet("rezultatet2017_18_java13");});
        j14.setOnAction(e->{tabelatJavet("rezultatet2017_18_java14");});
        j15.setOnAction(e->{tabelatJavet("rezultatet2017_18_java15");});
       
        switchScenes(primaryStage,vb,root,hb,kr.start(),vb1,ra.start(),bt.start());    
    }
    
    public void tabelatEkipeve(String ekipi) {
    	 EkipetTb ekipet = new EkipetTb();
    	 Stage stage = new Stage();
         Scene scene = new Scene(new VBox(ekipet.start(ekipi)));
         stage.setTitle(ekipi);
         stage.setScene(scene);
         stage.setResizable(false);
         stage.show();
    }
    
    public void tabelatJavet(String java) {
   	 JavaTb JAVA = new JavaTb();
   	 Stage stage = new Stage();
        Scene scene = new Scene(new VBox(JAVA.start(java)));
        stage.setTitle("Java");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
   }
    
   
    
    public void switchScenes(Stage primaryStage,VBox vb,Group root,HBox hb,Pane FK,VBox vb1,Pane Tabela,Pane Butonat) {
    	try {
    		
    		
    		vb.setStyle("-fx-background-color: Darkolivegreen");
    		vb1.setMaxWidth(primaryStage.getMaxWidth()-vb.getMaxWidth());
            vb1.setMaxHeight(primaryStage.getMaxHeight()-vb.getMaxHeight());
            vb1.setPadding(new Insets(0,0,0,0));
            Tabela.setMaxSize(1000, 350);
            Butonat.setMaxSize(400, 400);
            vb1.setSpacing(0);
    		 vb.setPadding(new Insets(0,0,0,0));
    		vb1.getChildren().addAll(Tabela,Butonat);
        	hb.getChildren().addAll(FK,vb1);
        	 vb.getChildren().addAll(root,hb);
        	 Scene sc = new Scene(vb,1000,625);
        	 
        	 primaryStage.setScene(sc);
        	 primaryStage.setTitle("Paraqitja e Rezultateve te Superliges se Kosoves");
             primaryStage.setResizable(false);
             primaryStage.show();
             
             
        	 
        	 throw new Exception();
    	}catch(Exception er) {
    		er.getStackTrace();
    	}
    }
}
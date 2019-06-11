package faqja_kryesore;



import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ComboBox;
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

import java.util.Locale;

import Login.Login1;

public class menu extends Application {
	ComboBox<String> languagesCbo = new ComboBox<>();
	private Stage Menu;
    public static void main(String[] args) {
        Application.launch(args);
    }
  
    @Override
    
    public void start(Stage primaryStage) {
    	ObservableList<String> allowedLanguages = FXCollections.observableArrayList();
    	for(int i = 0;i < I18N.getLanguages().size();i++) {
			allowedLanguages.add(I18N.getLanguages().get(i).getLanguage());		
		}
    	languagesCbo.getItems().addAll(allowedLanguages);
		languagesCbo.setValue(I18N.getDefaultLocale().getLanguage());
		languagesCbo.setOnAction(e -> switchLanguage());
    	
    	
    	primaryStage.setScene(null);
    	Menu = primaryStage;
        primaryStage.setTitle("Menus");
        Group root = new Group();
        
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
        Rangimitb ra = new Rangimitb();
        
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
        
        menu3.getItems().addAll(I18N.getRMenu(Pri.getText()),BP,T89,Dri,KLl,KFero,Dre,Lir,Gjil,Vell,Flam,VP);
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
       
        
        vb.setStyle("-fx-background-color: Darkolivegreen");
		vb1.setMaxWidth(primaryStage.getMaxWidth()-vb.getMaxWidth());
        vb1.setMaxHeight(primaryStage.getMaxHeight()-vb.getMaxHeight());
        vb1.setPadding(new Insets(0,0,0,0));
        ra.start().setMaxSize(1000, 350);
        bt.start().setMaxSize(400, 400);
        vb1.setSpacing(0);
		 vb.setPadding(new Insets(0,0,0,0));
		vb1.getChildren().addAll(languagesCbo,ra.start(),bt.start());
    	hb.getChildren().addAll(kr.start(),vb1);
    	 vb.getChildren().addAll(root,hb);
    	 Scene sc = new Scene(vb,1000,625);
    	 
    	 primaryStage.setScene(sc);
    	 primaryStage.setTitle("Paraqitja e Rezultateve te Superliges se Kosoves");
         primaryStage.setResizable(false);
         primaryStage.show();
          
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
    public void switchLanguage() {
		I18N.setLocale(new Locale(languagesCbo.getValue()));
	}
}
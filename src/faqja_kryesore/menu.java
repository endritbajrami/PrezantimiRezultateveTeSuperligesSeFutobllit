
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
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import Tabelat.*;

import java.util.Locale;

import Login.Login1;
import faqja_kryesore.Help;

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
       
        Group root = new Group();
        
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Rangimi");
       
        Menu menuT =  I18N.getMenu(menu,menu.getText());
       
        Label logoutL = new Label("LogOut");
        Label logoutT = I18N.getLabel(logoutL,logoutL.getText());
        logoutT.setMaxHeight(menuBar.getMaxHeight());
        logoutT.setOnMouseClicked(e->{
        	if(e.getButton() == MouseButton.PRIMARY) {
        		Menu.hide();
        		Stage Login1S = new Stage();
        		Login1 L1 = new Login1();
        		L1.start(Login1S);
        		
        		Login1S.show();
        	}
        });
        Menu logout = new Menu("",logoutT);
       
        
        
	    
        ToggleGroup menuToggle = new ToggleGroup();
        Rangimitb ra = new Rangimitb();
        
        RadioMenuItem Kr =new RadioMenuItem("Kryesor");
        RadioMenuItem St =new RadioMenuItem("Stadiumet");
        RadioMenuItem KrT =  I18N.getRMenu(Kr,Kr.getText());
        RadioMenuItem StT = I18N.getRMenu(St,St.getText());
       
        KrT.setToggleGroup(menuToggle);
        StT.setToggleGroup(menuToggle);
        
        StT.setOnAction(e->{
    		Stage StadiumetStage = new Stage();
    		Stadiumet stadiumet = new Stadiumet();
    		stadiumet.start(StadiumetStage);
    		StadiumetStage.show();
        });
      
        
        menuT.setGraphic(new ImageView("images/trofe.png"));
        menuT.getItems().addAll(KrT,StT);
        
       
        Menu menu2 = new Menu("Rezultatet");
        Menu menu2T =  I18N.getMenu(menu2,menu2.getText());
        RadioMenuItem j1 = new RadioMenuItem("Java1");
        RadioMenuItem j1T = I18N.getRMenu(j1,j1.getText());
        RadioMenuItem j2 = new RadioMenuItem("Java2");
        RadioMenuItem j2T = I18N.getRMenu(j2,j2.getText());
        RadioMenuItem j3 = new RadioMenuItem("Java3");
        RadioMenuItem j3T = I18N.getRMenu(j3,j3.getText());
        RadioMenuItem j4 = new RadioMenuItem("Java4");
        RadioMenuItem j4T = I18N.getRMenu(j4,j4.getText());
        RadioMenuItem j5 = new RadioMenuItem("Java5");
        RadioMenuItem j5T = I18N.getRMenu(j5,j5.getText());
        RadioMenuItem j6 = new RadioMenuItem("Java6");
        RadioMenuItem j6T = I18N.getRMenu(j6,j6.getText());
        RadioMenuItem j7 = new RadioMenuItem("Java7");
        RadioMenuItem j7T = I18N.getRMenu(j7,j7.getText());
        RadioMenuItem j8 = new RadioMenuItem("Java8");
        RadioMenuItem j8T = I18N.getRMenu(j8,j8.getText());
        RadioMenuItem j9 = new RadioMenuItem("Java9");
        RadioMenuItem j9T = I18N.getRMenu(j9,j9.getText());
        RadioMenuItem j10 = new RadioMenuItem("Java10");
        RadioMenuItem j10T = I18N.getRMenu(j10,j10.getText());
        RadioMenuItem j11 = new RadioMenuItem("Java11");
        RadioMenuItem j11T = I18N.getRMenu(j11,j11.getText());
        RadioMenuItem j12 = new RadioMenuItem("Java12");
        RadioMenuItem j12T = I18N.getRMenu(j12,j12.getText());
        RadioMenuItem j13 = new RadioMenuItem("Java13");
        RadioMenuItem j13T = I18N.getRMenu(j13,j13.getText());
        RadioMenuItem j14 = new RadioMenuItem("Java14");
        RadioMenuItem j14T = I18N.getRMenu(j14,j14.getText());
        RadioMenuItem j15 = new RadioMenuItem("Java15");
        RadioMenuItem j15T = I18N.getRMenu(j15,j15.getText());
        
        j1T.setToggleGroup(menuToggle);
        j2T.setToggleGroup(menuToggle);
        j3T.setToggleGroup(menuToggle);
        j4T.setToggleGroup(menuToggle);
        j5T.setToggleGroup(menuToggle);
        j6T.setToggleGroup(menuToggle);
        j7T.setToggleGroup(menuToggle);
        j8T.setToggleGroup(menuToggle);
        j9T.setToggleGroup(menuToggle);
        j10T.setToggleGroup(menuToggle);
        j11T.setToggleGroup(menuToggle);
        j12T.setToggleGroup(menuToggle);
        j13T.setToggleGroup(menuToggle);
        j14T.setToggleGroup(menuToggle);
        j15T.setToggleGroup(menuToggle);
        
        menu2T.setGraphic(new ImageView("images/ball.png"));
        menu2T.getItems().addAll(j1T,j2T,j3T,j4T,j5T,j6T,j7T,j8T,j9T,j10T,j11T,j12T,j13T,j14T,j15T);
        
        Menu menu3= new Menu("Ekipet");
        Menu menu3T = I18N.getMenu(menu3,menu3.getText());
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
        

        
        menu3T.getItems().addAll(Pri,BP,T89,Dri,KLl,KFero,Dre,Lir,Gjil,Vell,Flam,VP);
        menu3T.setGraphic(new ImageView("images/football-player.png"));
        
        Label FormLabel = new Label("Formacioni");
        Label FormLabelT = I18N.getLabel(FormLabel,FormLabel.getText());
        FormLabelT.setGraphic(new ImageView("images/form.png"));
        FormLabelT.setMaxHeight(menuBar.getMaxHeight());
        FormLabelT.setOnMouseClicked(e->{
        	if(e.getButton() == MouseButton.PRIMARY) {
        		Menu.hide();
        		Stage LojaStage = new Stage();
        		Loja loja = new Loja();
        		loja.start(LojaStage);
        		LojaStage.show();
        	}
        });
        
        Menu menuh = new Menu ("Help");
        MenuItem aboutHelpItem = new MenuItem("About"); 
        menuh.getItems().add(aboutHelpItem); 
        menuh.setGraphic(new ImageView("images/help.png"));
        
        
        aboutHelpItem.setOnAction(e -> {
        	Help.about();
        });
       
        
        Menu menu4=new Menu("",FormLabelT);
        HBox hb = new HBox();
        VBox vb = new VBox();
        VBox vb1 = new VBox();
       
        menuBar.getMenus().addAll(menuT, menu2T, menu3T, menu4,menuh,logout);
        
        
        
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
        

    
    public void tabelatJavet(String java) {
   	 JavaTb JAVA = new JavaTb();
   	 Stage stage = new Stage();
        Scene scene = new Scene(new VBox(JAVA.start(java)));
        stage.setTitle("Java");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
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
package faqja_kryesore;




import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.stage.Stage; 
import javafx.beans.value.*;
import javafx.geometry.Insets; 
public class radiobutton extends Application { 

	// launch the application 
	public void start(Stage s) 
	{ 
		
		s.setTitle(""); 

		// create a tile pane 
		TilePane r = new TilePane(); 

		// create a label 
		Label l = new Label("Zgjidhni ekipin qe mendoni se do te fitoj sivjet kampionatin:"); 
		Label l2 = new Label(""); 

		// create a toggle group 
		ToggleGroup tg = new ToggleGroup(); 

		// create radiobuttons 
		RadioButton r1 = new RadioButton("Prishtina"); 
		RadioButton r2 = new RadioButton("Drita"); 
		RadioButton r3 = new RadioButton("Liria"); 
		RadioButton r4 = new RadioButton("Besa Peje"); 
		RadioButton r5 = new RadioButton("Trepca 89"); 
		RadioButton r6 = new RadioButton("KF Llapi"); 
		RadioButton r7 = new RadioButton("KF Feronikeli"); 
		RadioButton r8 = new RadioButton("Drenica"); 
		RadioButton r9 = new RadioButton("Gjilani");
		RadioButton r10 = new RadioButton("Vellazenimi"); 
		RadioButton r11 = new RadioButton("Flamurtari"); 
		RadioButton r12 = new RadioButton("Vllaznia Pozhoran"); 
		

		// add radiobuttons to toggle group 
		r1.setToggleGroup(tg); 
		r2.setToggleGroup(tg); 
		r3.setToggleGroup(tg); 
		r4.setToggleGroup(tg); 
		r5.setToggleGroup(tg); 
		r6.setToggleGroup(tg); 
		r7.setToggleGroup(tg); 
		r8.setToggleGroup(tg); 
		r9.setToggleGroup(tg); 
		r10.setToggleGroup(tg);
		r11.setToggleGroup(tg); 
		r12.setToggleGroup(tg);
		
	
		


		// add label 
		r.getChildren().add(l); 
		r.getChildren().add(r1); 
		r.getChildren().add(r2); 
		r.getChildren().add(r3); 
		r.getChildren().add(r4);
		r.getChildren().add(r5);
		r.getChildren().add(r6);
		r.getChildren().add(r7);
		r.getChildren().add(r8);
		r.getChildren().add(r9);
		r.getChildren().add(r10);
		r.getChildren().add(r11);
		r.getChildren().add(r12);
		r.getChildren().add(l2); 
		
		r.setPadding(new Insets(10,10,10,10));

		// create a scene 
		Scene sc = new Scene(r, 400, 280); 

		// add a change listener 
		tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>() 
		{ 
			public void changed(ObservableValue<? extends Toggle> ob, 
													Toggle o, Toggle n) 
			{ 

				RadioButton rb = (RadioButton)tg.getSelectedToggle(); 

				if (rb != null) { 
					String s = rb.getText(); 

					// change the label 
					l2.setText("Ju mendoni se ekipi fitues do te jete : " + s ); 
				} 
			} 
		}); 

		// set the scene 
		s.setScene(sc); 

		s.show(); 
	} 

	public static void main(String args[]) 
	{ 
		// launch the application 
		launch(args); 
	} 
} 
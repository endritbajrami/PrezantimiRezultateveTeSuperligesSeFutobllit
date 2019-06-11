package faqja_kryesore;

import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.beans.value.*;
import javafx.geometry.Insets; 
public class radiobutton { 

	public Pane start() 
	{ 
		GridPane r = new GridPane();
		Label l = new Label("Kete vite do te fitoj?"); 
		Label l2 = new Label("");
		ToggleGroup tg = new ToggleGroup(); 
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
		
	
		r.add(l,0,0); 
		r.add(r1,0,1); 
		r.add(r2,0,2); 
		r.add(r3,0,3); 
		r.add(r4,0,4);
		r.add(r5,0,5);
		r.add(r6,0,6);
		r.add(r7,0,7);
		r.add(r8,0,8);
		r.add(r9,0,9);
		r.add(r10,0,10);
		r.add(r11,0,11);
		r.add(r12,0,12);
		r.add(l2,0,13); 
		r.setPrefWidth(300);
		r.setPadding(new Insets(0,0,0,20));

		
		tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>() 
		{ 
			public void changed(ObservableValue<? extends Toggle> ob, 
													Toggle o, Toggle n) 
			{ 

				RadioButton rb = (RadioButton)tg.getSelectedToggle(); 

				if (rb != null) { 
					String s = rb.getText(); 
					l2.setText(s+" eshte zgjedhje e mire!"); 
				} 
			} 
		});
		return r; 
	} 
} 
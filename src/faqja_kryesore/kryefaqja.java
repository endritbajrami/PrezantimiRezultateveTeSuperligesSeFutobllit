package faqja_kryesore;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class kryefaqja {
	public Pane start() 
	{
		VBox pane = new VBox(10);
		pane.setPadding(new Insets(20, 20, 20, 20)); 
		pane.setAlignment(Pos.CENTER);
		Label ekipet= new Label("Ekipet Pjesemarrese");
		ekipet.setStyle("-fx-font-weight: bold;-fx-font-size:16");
		
		Label pr = new Label("2. Prishtina");
		Label besa = new Label("11. Besa Peje");
		Label trepca89 = new Label("4. Trepca 89");
		Label drita = new Label("1. Drita");
		Label kfllapi = new Label("3. KF Llapi");
		Label kfferonikeli = new Label("5. KF Feronikeli");
		Label drenica = new Label("6. Drenica");
		Label liria = new Label("7. Liria");
		Label gjilani = new Label("8. Gjilani");
		Label vellaznimi = new Label("9. Vellaznimi");
		Label flamurtari = new Label("10. Flamurtari");
		Label vpozhoran =new Label("12. Vllaznia Pozhoran");
		
		String LabelCSS=(" -fx-text-fill:black;-fx-font-size:16");
		pr.setStyle(LabelCSS);
		besa.setStyle(LabelCSS);
		trepca89.setStyle(LabelCSS);
		drita.setStyle(LabelCSS);
		kfllapi.setStyle(LabelCSS);
		kfferonikeli.setStyle(LabelCSS);
		drenica.setStyle(LabelCSS);
		liria.setStyle(LabelCSS);
		gjilani.setStyle(LabelCSS);
		vellaznimi.setStyle(LabelCSS);
		flamurtari.setStyle(LabelCSS);
		vpozhoran.setStyle(LabelCSS);
		
		Image image = new Image("images/fotologin.png");
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(100);
		imageView.setFitWidth(150);
		pane.getChildren().addAll(imageView,ekipet,drita,pr,kfllapi,trepca89,kfferonikeli,drenica,liria,gjilani,vellaznimi,flamurtari,besa,vpozhoran );
		pane.setStyle("-fx-background-color: DARKSEAGREEN ");
		pane.setMaxHeight(1000);
		pane.setMaxWidth(500);
		return pane;
		
	}
	public static void main(String[] args) {
		Application.launch(args);

}
}

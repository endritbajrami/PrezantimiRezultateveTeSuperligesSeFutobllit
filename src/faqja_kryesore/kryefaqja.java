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



public class kryefaqja extends Application {
	@Override
	public void start(Stage primaryStage) 
	{
		VBox pane = new VBox(10);
		pane.setPadding(new Insets(20, 20, 20, 20)); 
		pane.setAlignment(Pos.CENTER);
		Label ekipet= new Label("Ekipet Pjesemarrese");
		ekipet.setStyle("-fx-font-weight: bold;-fx-font-size:16");
		
		Label pr = new Label("Prishtina");
		Label besa = new Label("Besa Peje");
		Label trepca89 = new Label("Trepca 89");
		Label drita = new Label("Drita");
		Label kfllapi = new Label("KF Llapi");
		Label kfferonikeli = new Label("KF Feronikeli");
		Label drenica = new Label("Drenica");
		Label liria = new Label("Liria");
		Label gjilani = new Label("Gjilani");
		Label vellaznimi = new Label("Vellaznimi");
		Label flamurtari = new Label("Flamurtari");
		Label vpozhoran =new Label("Vllaznia Pozhoran");
		
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
		pane.getChildren().addAll(imageView,ekipet, pr,besa,trepca89,drita, kfllapi, kfferonikeli,drenica,liria,gjilani,vellaznimi,flamurtari,vpozhoran );
		
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Paraqitja e Rezultateve te Superliges se Kosoves");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
		
	}
	public static void main(String[] args) {
		Application.launch(args);

}
}

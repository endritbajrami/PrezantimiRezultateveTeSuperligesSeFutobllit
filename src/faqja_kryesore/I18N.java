package faqja_kryesore;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.RadioMenuItem;

public class I18N {
public static ObjectProperty<Locale> locale;
	
	static {
		locale = new SimpleObjectProperty<>(getDefaultLocale());
	}
	
	
	public static List<Locale> getLanguages() {
		return new ArrayList<Locale>(Arrays.asList(Locale.ENGLISH, new Locale("al", "AL")));
	}
	
	public static Locale getDefaultLocale() {
		return Locale.ENGLISH;
	}

	public static Locale getLocale() {
		return locale.get();
	}
	
	public static void setLocale(Locale locale) {
		localProperty().set(locale);
	}
	
	public static ObjectProperty<Locale> localProperty() {
		return locale;
	}
	
	public static String get(String key, Object... args) {
		ResourceBundle bundle = ResourceBundle.getBundle("translates.translate", getLocale());
	
		return MessageFormat.format(bundle.getString(key), args);	
	}
	
	public static StringBinding createStringBinding(String key, Object... args) {
		return Bindings.createStringBinding(() -> get(key, args), locale);
	}
	
	public static Label getLabel(Label label,String key, Object... args) {
		label.textProperty().bind(createStringBinding(key, args));
		return label;		
	}
	public static RadioMenuItem getRMenu(RadioMenuItem RM,String key, Object... args) {
		RM.textProperty().bind(createStringBinding(key, args));
		return RM;		
	}
	public static Menu getMenu(Menu RM,String key, Object... args) {
		
		RM.textProperty().bind(createStringBinding(key, args));
		return RM;		
	}
	
	
}

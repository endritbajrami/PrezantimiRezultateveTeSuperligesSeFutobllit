package Login;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import faqja_kryesore.LidhjaDB;

public class Ekipet {

	private int Numri;
	private String Shtetesia;
	private String Pozicioni;
	private String EmriMbiemri;
	
	public Ekipet(int Numri, String Shtetesia, String Pozicioni,String EmriMbiemri) {

		this.Numri = Numri;
		this.Shtetesia = Shtetesia;
		this.Pozicioni = Pozicioni;
		this.EmriMbiemri = EmriMbiemri;
	}

	public int getNumri() {
		return Numri;
	}
	
	public void setNumri(int Numri) {
		this.Numri = Numri;
	}
	
	public String getShtetesia() {
		return Shtetesia;
	}
	
	public void setShtetesia(String Shtetesia) {
		this.Shtetesia = Shtetesia;
	}
	public String getPozicioni() {
		return Pozicioni;
	}
	
	public void setPozicioni(String Pozicioni) {
		this.Pozicioni = Pozicioni;
	}
	public String getEmriMbiemri() {
		return EmriMbiemri;
	}
	public void setEMriMbiemri(String EmriMbiemri) {
		this.EmriMbiemri = EmriMbiemri;
	}
	
	
	public static List<Ekipet> getEkipet(String ekipi) {
		List<Ekipet> EkipiList = new ArrayList();
		
		String query = "Select * from "+ekipi;
		
		try {
			PreparedStatement preparedStatement = LidhjaDB.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Ekipet ekipii = new Ekipet(resultSet.getInt(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5));
				EkipiList.add(ekipii);
			}
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		return EkipiList;
	
	
	}
}

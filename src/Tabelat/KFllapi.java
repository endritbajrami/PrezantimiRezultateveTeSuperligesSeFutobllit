package Tabelat;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KFllapi {

	private int eid;
	private int Numri;
	private String Shtetesia;
	private String Pozicioni;
	private String EmriMbiemri;

	
	
	public KFllapi(int eid, int Numri, String Shtetesia, String Pozicioni,String EmriMbiemri) {
		this.eid = eid;
		this.Numri = Numri;
		this.Shtetesia = Shtetesia;
		this.Pozicioni = Pozicioni;
		this.EmriMbiemri = EmriMbiemri;
		
	}
	
	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
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
	
	


	
	public static List<KFllapi> getkfllapi() {
		List<KFllapi> kfllapiList = new ArrayList();
		
		String query = "Select * from kfllapi";
		
		try {
			PreparedStatement preparedStatement = LidhjaDB.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				KFllapi kfllapi = new KFllapi(resultSet.getInt(1), resultSet.getInt(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5));
				kfllapiList.add(kfllapi);
			}
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		return kfllapiList;
	}
}





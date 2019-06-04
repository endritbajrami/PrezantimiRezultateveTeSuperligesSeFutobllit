package Tabelat;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Rangimi {

	private int eid;
	private int Nr;
	private String Ekipi;
	private int NrLoj�ve;
	private int Fitore;
	private int Barazime;
	private int Humbje;
	private int Golplus;
	private int Golminus;
	private int Average;
	private int Pik�t;
	
	
	public Rangimi(int eid, int Nr, String Ekipi, int NrLoj�ve,int Fitore, int Barazime, int Humbje, int Golplus, int Golminus, int Average, int Pik�t ) {
		this.eid = eid;
		this.Nr = Nr;
		this.Ekipi = Ekipi;
		this.NrLoj�ve = NrLoj�ve;
		this.Fitore = Fitore;
		this.Barazime = Barazime;
		this.Humbje=Humbje;
		this.Golplus=Golplus;
		this.Golminus=Golminus;
		this.Average=Average;
		this.Pik�t=Pik�t;
	}
	
	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public int getNr() {
		return Nr;
	}
	
	public void setNr(int Nr) {
		this.Nr = Nr;
	}
	
	public String getEkipi() {
		return Ekipi;
	}
	
	public void setEkipi(String Ekipi) {
		this.Ekipi = Ekipi;
	}
	public int getNrLoj�ve() {
		return NrLoj�ve;
	}
	
	public void setNrLoj�ve(int NrLoj�ve) {
		this.NrLoj�ve = NrLoj�ve;
	}
	public int getFitore() {
		return Fitore;
	}
	
	public void setFitore(int Fitore) {
		this.Fitore = Fitore;
	}
	
	public int getBarazime() {
		return Barazime;
	}
	
	public void setBarazime(int Barazime) {
		this.Barazime = Barazime;
	}
	
	public int getHumbje() {
		return Humbje;
	}
	
	public void setHumbje(int Humbje) {
		this.Humbje = Humbje;
	}
	
	public int getGolplus() {
		return Golplus;
	}
	
	public void setGolplus(int Golplus) {
		this.Golplus = Golplus;
	}
	public int getGolminus() {
		return Golminus;
	}
	
	public void setGolminus(int Golminus) {
		this.Golminus = Golminus;
	}
	public int getAverage() {
		return Average;
	}
	
	public void setAverage(int Average) {
		this.Average = Average;
	}
	public int getPik�t() {
		return Pik�t;
	}
	
	public void setPik�t(int Pik�t) {
		this.Pik�t = Pik�t;
	}


	


	
	public static List<Rangimi> getrangimi() {
		List<Rangimi> rangimiList = new ArrayList();
		
		String query = "Select * from rangimi";
		
		try {
			PreparedStatement preparedStatement = LidhjaDB.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Rangimi rangimi = new Rangimi(resultSet.getInt(1), resultSet.getInt(2), resultSet.getString(3), resultSet.getInt(4), resultSet.getInt(5), resultSet.getInt(6), resultSet.getInt(7), resultSet.getInt(8), resultSet.getInt(9), resultSet.getInt(10), resultSet.getInt(11));
				rangimiList.add(rangimi);
			}
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		return rangimiList;
	}
}

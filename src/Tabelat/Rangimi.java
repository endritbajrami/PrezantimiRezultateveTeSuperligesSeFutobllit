package Tabelat;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Rangimi {

	private int eid;
	private int Nr;
	private String Ekipi;
	private int NrLojëve;
	private int Fitore;
	private int Barazime;
	private int Humbje;
	private int Golplus;
	private int Golminus;
	private int Average;
	private int Pikët;
	
	
	public Rangimi(int eid, int Nr, String Ekipi, int NrLojëve,int Fitore, int Barazime, int Humbje, int Golplus, int Golminus, int Average, int Pikët ) {
		this.eid = eid;
		this.Nr = Nr;
		this.Ekipi = Ekipi;
		this.NrLojëve = NrLojëve;
		this.Fitore = Fitore;
		this.Barazime = Barazime;
		this.Humbje=Humbje;
		this.Golplus=Golplus;
		this.Golminus=Golminus;
		this.Average=Average;
		this.Pikët=Pikët;
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
	public int getNrLojëve() {
		return NrLojëve;
	}
	
	public void setNrLojëve(int NrLojëve) {
		this.NrLojëve = NrLojëve;
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
	public int getPikët() {
		return Pikët;
	}
	
	public void setPikët(int Pikët) {
		this.Pikët = Pikët;
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

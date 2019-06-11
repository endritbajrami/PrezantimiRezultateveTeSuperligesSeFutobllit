package faqja_kryesore;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Login.Ekipet;
import Tabelat.LidhjaDB;
import Tabelat.Rangimi;

public class Java {

	
	private String Ekipi_vendas;
	private String Dita;
	private String Data_ora;
	private String Rezultati;
	private String Ekipi_mysafir;
	

	
	
	public Java( String Ekipi_vendas, String Dita,String Data_ora, String Rezultati, String Ekipi_mysafir) {
		
		this.Ekipi_vendas = Ekipi_vendas;
		this.Dita = Dita;
		this.Data_ora = Data_ora;
		this.Rezultati = Rezultati;
		this.Ekipi_mysafir = Ekipi_mysafir;
	
	}
	

	
	public String getEkipi_vendas() {
		return Ekipi_vendas;
	}
	
	public void setEkipi_vendas(String Ekipi_vendas) {
		this.Ekipi_vendas = Ekipi_vendas;
	}
	
	public String getDita() {
		return Dita;
	}
	
	public void setDita(String Dita) {
		this.Dita = Dita;
	}
	public String getData_ora() {
		return Data_ora;
	}
	
	public void setData_ora(String Data_ora) {
		this.Data_ora = Data_ora;
	}
	public String getRezultati() {
		return Rezultati;
	}
	
	public void setRezultati(String Rezultati) {
		this.Rezultati = Rezultati;
	}
	public String getEkipi_mysafir() {
		return Ekipi_mysafir;
	}
	
	public void setEkipi_mysafir(String Ekipi_mysafir) {
		this.Ekipi_mysafir = Ekipi_mysafir;
	}




	


	public static List<Java> getJava(String java) {
		List<Java> JavaList = new ArrayList();
		
		String query = "Select * from "+java;
		
		try {
			PreparedStatement preparedStatement = LidhjaDB.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Java javaa = new Java(resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5),resultSet.getString(6));
				JavaList.add(javaa);
			}
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		return JavaList;
	
	
	}
}

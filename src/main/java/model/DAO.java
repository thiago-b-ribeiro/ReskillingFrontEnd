package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbPrj0001?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "12345678";
	
	private Connection conectar() {
		
		Connection conn = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void inserir(Table01 table01) {
		String sql = "INSERT INTO tbTable01 (campo02, campo03, radioButton, comboBox, textArea) VALUES (?, ?, ?, ?, ?)";
		
		try {
			Connection conn = conectar();
			
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, table01.getCampo02());
			pst.setString(2, table01.getCampo03());
			pst.setString(3, table01.getRadioButton());
			pst.setString(4, table01.getComboBox());
			pst.setString(5, table01.getTextArea());
			
			pst.execute();
			pst.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public ArrayList<Table01> listar(){
		String sql = "SELECT * FROM tbTable01";
		ArrayList<Table01> lista = new ArrayList<>();
		
		try {
			Connection conn = conectar();
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				int campo01 = rs.getInt(1);
				String campo02 = rs.getString(2);
				String campo03 = rs.getString(3);
				String radioButton = rs.getString(4);
				String comboBox = rs.getString(5);
				String checkBox = rs.getString(6);
				String textArea = rs.getString(7);
				
				lista.add(new Table01(campo01, campo02, campo03, radioButton, comboBox, checkBox, textArea));
			}
			pst.close();
			conn.close();
			
			return lista;
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void selecionar(Table01 table01) {
		String sql = "SELECT * FROM tbTable01 WHERE campo01 = ?";
		
		try {
			Connection conn = conectar();
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setInt(1, table01.getCampo01());
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				table01.setCampo01(rs.getInt(1));
				table01.setCampo02(rs.getString(2));
				table01.setCampo03(rs.getString(3));
				table01.setRadioButton(rs.getString(4));
				table01.setComboBox(rs.getString(5));
				table01.setCheckBox(rs.getString(6));
				table01.setTextArea(rs.getString(7));
			}
			
			pst.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void editar(Table01 table01) {
		String sql = "UPDATE tbTable01 SET campo02 = ?,"
				+    "                     campo03 = ?,"
				+    "                     radioButton = ?,"
				+    "                     comboBox = ?,"
				+    "                     textArea = ?"
				+    "                     WHERE campo01 = ?";
		
		try {
			Connection conn = conectar();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, table01.getCampo02());
			pst.setString(2, table01.getCampo03());
			pst.setString(3, table01.getRadioButton());
			pst.setString(4, table01.getComboBox());
			pst.setString(5, table01.getTextArea());
			pst.setInt(6, table01.getCampo01());
			pst.executeUpdate();
			
			pst.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void excluir(Table01 table01) {
		String sql = "DELETE FROM tbTable01 WHERE campo01 = ?";
		
		try {
			Connection conn = conectar();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, table01.getCampo01());
			
			pst.execute();
			
			pst.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

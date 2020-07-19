package pao.proiect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Database {

	private final String JDBC_URL = "jdbc:sqlite:dealerauto.db";
	private Connection conn;
	
	public Database() {
		
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection(JDBC_URL);
			System.out.println("Succes!!!");
		}
		catch(Exception e) {
			System.out.println("EROARE!!!");
		}
	}
	
	public void adaugareAutovehicul(String tip, String idAutovehicul, String marca, String anFabricatie, String litraj, String pret, String campUnic) {
		
		String sql = "INSERT INTO stocAutovehicule(tip,idAutovehicul,marca,anFabricatie,litraj,pret,campUnic) VALUES(?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, tip);
			ps.setString(2, idAutovehicul);
			ps.setString(3, marca);
			ps.setString(4, anFabricatie);
			ps.setString(5, litraj);
			ps.setString(6, pret);
			ps.setString(7, campUnic);
			
			ps.executeUpdate();
			
		}
		catch(SQLException e) {
			
		}
	}
	
	
	public void adaugareClient(String idClient, String nume, String cnp) {
		
		String sql = "INSERT INTO clienti(idClient,nume,cnp) VALUES(?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, idClient);
			ps.setString(2, nume);
			ps.setString(3, cnp);

			
			ps.executeUpdate();
			
		}
		catch(SQLException e) {
			
		}
	}

	public void stergereAutovehicul(String idAutovehicul) {
		String sqlCheck = "SELECT COUNT(*) FROM stocAutovehicule WHERE idAutovehicul = ?";
		String sql = "DELETE FROM stocAutovehicule WHERE idAutovehicul = ?";
		
		try {
			PreparedStatement st  = conn.prepareStatement(sqlCheck);
			st.setString(1, idAutovehicul);
			ResultSet res = st.executeQuery();
			
			if(res.getInt(1) != 0) {
			
				PreparedStatement ps = conn.prepareStatement(sql);
			
				ps.setString(1, idAutovehicul);

				ps.executeUpdate();
				
				System.out.println("Stergere realizata cu succes!");
			}
			else {
				System.out.println("Nu exista ID-ul!!!");
			}
			
		}
		catch(SQLException e) {
			System.out.println("Eroare!");
		}
	}

	
	public void stergereClient(String idClient) {
		String sqlCheck = "SELECT COUNT(*) FROM clienti WHERE idClient = ?";
		String sql = "DELETE FROM clienti WHERE idClient = ?";
		
		try {
			PreparedStatement st  = conn.prepareStatement(sqlCheck);
			st.setString(1, idClient);
			ResultSet res = st.executeQuery();
			
			if(res.getInt(1) != 0) {
			
				PreparedStatement ps = conn.prepareStatement(sql);
			
				ps.setString(1, idClient);

				ps.executeUpdate();
				
				System.out.println("Stergere realizata cu succes!");
			}
			else {
				System.out.println("Nu exista ID-ul!!!");
			}
			
		}
		catch(SQLException e) {
			System.out.println("Eroare!");
		}
	}
	
	
	public ArrayList<String> afisareStocAutovehicule() {
		String sql = "SELECT * FROM stocAutovehicule";
		ArrayList<String> records = new ArrayList<String>();
		
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			
			while(rs.next()) {
				String tip = rs.getString(1);
				String idAutovehicul = rs.getString(2);
				String marca = rs.getString(3);
				String anFabricatie = rs.getString(4);
				String litraj = rs.getString(5);
				String pret = rs.getString(6);
				String campUnic = rs.getString(7);
				
				StringBuilder bld = (new StringBuilder())
						.append("  ").append(tip).append(" -- ID: ").append(idAutovehicul).append("  Marca: ").append(marca)
						.append("  An fabricatie: ").append(anFabricatie).append("  Litraj(L): ").append(litraj)
						.append("  Pret vanzare(EUR): ").append(pret);
				
				switch(tip) {
				case "MOTOCICLETA":
					bld.append("  Ani garantie: ").append(campUnic);
					break;
				case "MASINA":
					bld.append("  Caroserie: ").append(campUnic);
					break;
				case "AUTOBUZ":
					bld.append("  Capacitate maxima persoane: ").append(campUnic);
					break;
				case "CAMION":
					bld.append("  Incarcatura maxima(t): ").append(campUnic);
					break;
				default:
					System.out.println("EROAREdefsAV!");
					break;
				}
				
				bld.append("\n");
				String linie = bld.toString();
				records.add(linie);
			}
			
			
		}
		catch(SQLException e) {
			
		}
		return records;
		
	}
	
	
	public ArrayList<String> afisareClienti() {
		String sql = "SELECT * FROM clienti";
		ArrayList<String> records = new ArrayList<String>();
		
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			
			while(rs.next()) {
				String idClient = rs.getString(1);
				String nume = rs.getString(2);
				String cnp = rs.getString(3);
				
				StringBuilder bld = (new StringBuilder())
						.append("  ").append("Cod client: ").append(idClient).append("  Nume: ").append(nume)
						.append("  CNP: ").append(cnp).append("\n");
						
				String linie = bld.toString();
				records.add(linie);
			}
			
			
		}
		catch(SQLException e) {
			
		}
		return records;
		
	}
	
	
	public ArrayList<String> getAutovehicul(String idAutovehicul){
		
		String sqlCheck = "SELECT COUNT(*) FROM stocAutovehicule WHERE idAutovehicul = ?";
		String sql = "SELECT * FROM stocAutovehicule WHERE idAutovehicul = ?";
		ArrayList<String> info = new ArrayList<String>();
		
		try {
			PreparedStatement st  = conn.prepareStatement(sqlCheck);
			st.setString(1, idAutovehicul);
			ResultSet res = st.executeQuery();
			
			if(res.getInt(1) != 0) {
			
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, idAutovehicul);
				ResultSet data = ps.executeQuery();
				
				String tip = data.getString(1);
				String marca = data.getString(3);
				String anFabricatie = data.getString(4);
				String litraj = data.getString(5);
				String pret = data.getString(6);
				String campUnic = data.getString(7);
				
				info.add(tip);
				info.add(marca);
				info.add(anFabricatie);
				info.add(litraj);
				info.add(pret);
				info.add(campUnic);
			}
			else {
				System.out.println("Nu exista ID-ul!!!");
			}
			
		}
		catch(SQLException e) {
			System.out.println("Eroare!");
		}
		
		return info;
	}
	
	
	public void setAutovehicul(String idAutovehicul, String marca, String anFabricatie, String litraj, String pret, String campUnic) {
		
		String sql = "UPDATE stocAutovehicule SET marca = ?, anFabricatie = ?, litraj = ?, pret = ?, campUnic = ? WHERE idAutovehicul = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, marca);
			ps.setString(2, anFabricatie);
			ps.setString(3, litraj);
			ps.setString(4, pret);
			ps.setString(5, campUnic);
			ps.setString(6, idAutovehicul);
			
			ps.executeUpdate();
			
		}
		catch(SQLException e) {
			
		}
	}
	
	
	public ArrayList<String> getClient(String idClient){
		
		String sqlCheck = "SELECT COUNT(*) FROM clienti WHERE idClient = ?";
		String sql = "SELECT * FROM clienti WHERE idClient = ?";
		ArrayList<String> info = new ArrayList<String>();
		
		try {
			PreparedStatement st  = conn.prepareStatement(sqlCheck);
			st.setString(1, idClient);
			ResultSet res = st.executeQuery();
			
			if(res.getInt(1) != 0) {
			
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, idClient);
				ResultSet data = ps.executeQuery();
				
				String nume = data.getString(2);
				String cnp = data.getString(3);

				
				info.add(nume);
				info.add(cnp);

			}
			else {
				System.out.println("Nu exista ID-ul!!!");
			}
			
		}
		catch(SQLException e) {
			System.out.println("Eroare!");
		}
		
		return info;
	}
	
	
	public void setClient(String idClient, String nume, String cnp) {
		
		String sql = "UPDATE clienti SET nume = ?, cnp = ? WHERE idClient = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, nume);
			ps.setString(2, cnp);
			ps.setString(3, idClient);
			
			ps.executeUpdate();
			
		}
		catch(SQLException e) {
			
		}
	}
	
	
	public ArrayList<String> afisareVanzari() {
		String sql = "SELECT * FROM vanzari";
		ArrayList<String> records = new ArrayList<String>();
		
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			
			while(rs.next()) {
				String idVanzare = rs.getString(1);
				String data = rs.getString(2);
				String idClient = rs.getString(3);
				String idAutovehicul = rs.getString(4);
				String suma = rs.getString(5);
				
				StringBuilder bld = (new StringBuilder())
						.append("  ").append("Cod vanzare: ").append(idVanzare).append("  Data: ").append(data)
						.append("  Cod client: ").append(idClient).append("  Cod autovehicul: ").append(idAutovehicul)
						.append("  Suma: ").append(suma).append("\n");
						
				String linie = bld.toString();
				records.add(linie);
			}
			
			
		}
		catch(SQLException e) {
			
		}
		return records;
		
	}
	
	
	public void inregistrareVanzare(String idClient, String idAutovehicul) {
		String sqlCheckClient = "SELECT COUNT(*) FROM clienti WHERE idClient = ?";
		String sqlCheckAutovehicul = "SELECT COUNT(*) FROM stocAutovehicule WHERE idAutovehicul = ?";
		String sqlDeleteAutovehicul = "DELETE FROM stocAutovehicule WHERE idAutovehicul = ?";
		String sqlGetAutovehicul = "SELECT * FROM stocAutovehicule WHERE idAutovehicul = ?";
		String sqlInregistrareVanzare = "INSERT INTO vanzari(idVanzare, data, idClient, idAutovehicul, suma) VALUES(?,?,?,?,?)";
		String sqlAdaugareAutovehiculVandut = "INSERT INTO autovehiculeVandute(tip,idAutovehicul,marca,anFabricatie,litraj,pret,campUnic) VALUES(?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement st  = conn.prepareStatement(sqlCheckClient);
			st.setString(1, idClient);
			ResultSet resClient = st.executeQuery();
			
			st = conn.prepareStatement(sqlCheckAutovehicul);
			st.setString(1, idAutovehicul);
			ResultSet resAutovehicul = st.executeQuery();
			
			if(resClient.getInt(1) != 0 && resAutovehicul.getInt(1) != 0) {
			
				PreparedStatement ps = conn.prepareStatement(sqlGetAutovehicul);
				ps.setString(1, idAutovehicul);
				ResultSet data = ps.executeQuery();
				
				String tip = data.getString(1);
				String marca = data.getString(3);
				String anFabricatie = data.getString(4);
				String litraj = data.getString(5);
				String pret = data.getString(6);
				String campUnic = data.getString(7);
				
				Vanzare vnz = new Vanzare(Integer.parseInt(idClient), Integer.parseInt(idAutovehicul), Double.parseDouble(pret));
				
				ps = conn.prepareStatement(sqlInregistrareVanzare);
				ps.setString(1, String.valueOf(vnz.getId()));
				ps.setString(2, String.valueOf(vnz.getDate()));
				ps.setString(3, idClient);
				ps.setString(4, idAutovehicul);
				ps.setString(5, String.valueOf(vnz.getSuma()));
				
				ps.executeUpdate();
				
				ps = conn.prepareStatement(sqlAdaugareAutovehiculVandut);
				ps.setString(1, tip);
				ps.setString(2, idAutovehicul);
				ps.setString(3, marca);
				ps.setString(4, anFabricatie);
				ps.setString(5, litraj);
				ps.setString(6, pret);
				ps.setString(7, campUnic);
				
				ps.executeUpdate();
				
				ps = conn.prepareStatement(sqlDeleteAutovehicul);
				ps.setString(1, idAutovehicul);
				ps.executeUpdate();
				
				System.out.println("Vanzare inregistrata cu succes!");
			}
			else {
				System.out.println("Nu exista ID-ul!!!");
			}
			
		}
		catch(SQLException e) {
			System.out.println("Eroare!");
		}
	}
	
	public ArrayList<String> afisareAutovehiculeVandute() {
		String sql = "SELECT * FROM autovehiculeVandute";
		ArrayList<String> records = new ArrayList<String>();
		
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			
			while(rs.next()) {
				String tip = rs.getString(1);
				String idAutovehicul = rs.getString(2);
				String marca = rs.getString(3);
				String anFabricatie = rs.getString(4);
				String litraj = rs.getString(5);
				String pret = rs.getString(6);
				String campUnic = rs.getString(7);
				
				StringBuilder bld = (new StringBuilder())
						.append("  ").append(tip).append(" -- ID: ").append(idAutovehicul).append("  Marca: ").append(marca)
						.append("  An fabricatie: ").append(anFabricatie).append("  Litraj(L): ").append(litraj)
						.append("  Pret vanzare(EUR): ").append(pret);
				
				switch(tip) {
				case "MOTOCICLETA":
					bld.append("  Ani garantie: ").append(campUnic);
					break;
				case "MASINA":
					bld.append("  Caroserie: ").append(campUnic);
					break;
				case "AUTOBUZ":
					bld.append("  Capacitate maxima persoane: ").append(campUnic);
					break;
				case "CAMION":
					bld.append("  Incarcatura maxima(t): ").append(campUnic);
					break;
				default:
					System.out.println("EROAREdefsAV!");
					break;
				}
				
				bld.append("\n");
				String linie = bld.toString();
				records.add(linie);
			}
			
			
		}
		catch(SQLException e) {
			
		}
		return records;
		
	}
	
	public ArrayList<String> getAutovehiculeClient(String idClient){
		
		String sqlCheck = "SELECT COUNT(*) FROM clienti WHERE idClient = ?";
		String sqlGetClient = "SELECT * FROM clienti WHERE idClient = ?";
		String sqlGetAutovehicule = "SELECT * FROM autovehiculeVandute join vanzari on (autovehiculeVandute.idAutovehicul = vanzari.idAutovehicul) WHERE idClient = ?";
		ArrayList<String> info = new ArrayList<String>();
		
		try {
			PreparedStatement st  = conn.prepareStatement(sqlCheck);
			st.setString(1, idClient);
			ResultSet res = st.executeQuery();
			
			if(res.getInt(1) != 0) {
			
				PreparedStatement ps = conn.prepareStatement(sqlGetClient);
				ps.setString(1, idClient);
				ResultSet data = ps.executeQuery();
				
				String nume = data.getString(2);
				String cnp = data.getString(3);

				
				info.add(nume);
				info.add(cnp);
				
				ps = conn.prepareStatement(sqlGetAutovehicule);
				ps.setString(1, idClient);
				data = ps.executeQuery();
				
				while(data.next()) {
					String tip = data.getString(1);
					String idAutovehicul = data.getString(2);
					String marca = data.getString(3);
					String anFabricatie = data.getString(4);
					String litraj = data.getString(5);
					String pret = data.getString(6);
					String campUnic = data.getString(7);
					
					StringBuilder bld = (new StringBuilder())
							.append("  ").append(tip).append(" -- ID: ").append(idAutovehicul).append("  Marca: ").append(marca)
							.append("  An fabricatie: ").append(anFabricatie).append("  Litraj(L): ").append(litraj)
							.append("  Pret vanzare(EUR): ").append(pret);
					
					switch(tip) {
					case "MOTOCICLETA":
						bld.append("  Ani garantie: ").append(campUnic);
						break;
					case "MASINA":
						bld.append("  Caroserie: ").append(campUnic);
						break;
					case "AUTOBUZ":
						bld.append("  Capacitate maxima persoane: ").append(campUnic);
						break;
					case "CAMION":
						bld.append("  Incarcatura maxima(t): ").append(campUnic);
						break;
					default:
						System.out.println("EROAREdefsAV!");
						break;
					}
					
					bld.append("\n");
					String linie = bld.toString();
					info.add(linie);
				}

			}
			else {
				System.out.println("Nu exista ID-ul!!!");
			}
			
		}
		catch(SQLException e) {
			System.out.println("Eroare!");
		}
		
		return info;
	}
}

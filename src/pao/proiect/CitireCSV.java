package pao.proiect;
import java.util.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.io.FileNotFoundException;

public class CitireCSV {
	
	private static CitireCSV instance = null;
	
	private CitireCSV() {
		
	}
	
	public static CitireCSV getInstance() {
		if (instance == null) 
            instance = new CitireCSV(); 
        return instance; 	
	}
	
	public ArrayList<Vanzare> citireVanzariCSV(){
		ArrayList<Vanzare> vanzari = new ArrayList<Vanzare>();
		
		try(BufferedReader reader = new BufferedReader(new FileReader("vanzari.csv"))){
			
			String linie;
			while ((linie = reader.readLine()) != null) {
				String[] val = linie.split(",");
				
				Vanzare v = new Vanzare();
				v.setId(Integer.parseInt(val[0]));
				v.setDate(LocalDate.parse(val[1]));
				v.setIdClient(Integer.parseInt(val[2]));
				v.setIdVehicul(Integer.parseInt(val[3]));
				v.setSuma(Double.parseDouble(val[4]));
				
				vanzari.add(v);
			}
		}
		catch(FileNotFoundException exc) {
			System.out.println("FISIER INEXISTENT!");
		}
		catch(IOException exc) {
			System.out.println("EROAREcV!");
		}
		
		return vanzari;
	}
	
	public ArrayList<Autovehicul> citireAutovehiculeCSV(){
		ArrayList<Autovehicul> autovehicule = new ArrayList<Autovehicul>();
		
		try(BufferedReader reader = new BufferedReader(new FileReader("stocAutovehicule.csv"))){
			
			String linie;
			while ((linie = reader.readLine()) != null) {
				String[] val = linie.split(",");
				
				switch(val[0]) {
					case "MOTOCICLETA":
						Motocicleta a = new Motocicleta();
						a.setId(Integer.parseInt(val[1]));
						a.setMarca(val[2]);
						a.setAnFabricatie(Integer.parseInt(val[3]));
						a.setLitraj(Double.parseDouble(val[4]));
						a.setPret(Double.parseDouble(val[5]));
						a.setAniGarantie(Integer.parseInt(val[6]));
						autovehicule.add(a);
						break;
					case "MASINA":
						Masina b = new Masina();
						b.setId(Integer.parseInt(val[1]));
						b.setMarca(val[2]);
						b.setAnFabricatie(Integer.parseInt(val[3]));
						b.setLitraj(Double.parseDouble(val[4]));
						b.setPret(Double.parseDouble(val[5]));
						b.setCaroserie(val[6]);
						autovehicule.add(b);
						break;
					case "AUTOBUZ":
						Autobuz c = new Autobuz();
						c.setId(Integer.parseInt(val[1]));
						c.setMarca(val[2]);
						c.setAnFabricatie(Integer.parseInt(val[3]));
						c.setLitraj(Double.parseDouble(val[4]));
						c.setPret(Double.parseDouble(val[5]));
						c.setCapacitatePersoane(Integer.parseInt(val[6]));
						autovehicule.add(c);
						break;
					case "CAMION":
						Camion d = new Camion();
						d.setId(Integer.parseInt(val[1]));
						d.setMarca(val[2]);
						d.setAnFabricatie(Integer.parseInt(val[3]));
						d.setLitraj(Double.parseDouble(val[4]));
						d.setPret(Double.parseDouble(val[5]));
						d.setMaxLoad(Double.parseDouble(val[6]));
						autovehicule.add(d);
						break;
					default:
						System.out.println("EROAREdefcA!");
						break;
				}
			}
		}
		catch(FileNotFoundException exc) {
			System.out.println("FISIER INEXISTENT!");
		}
		catch(IOException exc) {
			System.out.println("EROAREcA!");
		}
		
		return autovehicule;
	}
	
	public ArrayList<Autovehicul> citireAutovehiculeVanduteCSV(){
		ArrayList<Autovehicul> autovehicule = new ArrayList<Autovehicul>();
		
		try(BufferedReader reader = new BufferedReader(new FileReader("autovehiculeVandute.csv"))){
			
			String linie;
			while ((linie = reader.readLine()) != null) {
				String[] val = linie.split(",");
				
				switch(val[0]) {
					case "MOTOCICLETA":
						Motocicleta a = new Motocicleta();
						a.setId(Integer.parseInt(val[1]));
						a.setMarca(val[2]);
						a.setAnFabricatie(Integer.parseInt(val[3]));
						a.setLitraj(Double.parseDouble(val[4]));
						a.setPret(Double.parseDouble(val[5]));
						a.setAniGarantie(Integer.parseInt(val[6]));
						autovehicule.add(a);
						break;
					case "MASINA":
						Masina b = new Masina();
						b.setId(Integer.parseInt(val[1]));
						b.setMarca(val[2]);
						b.setAnFabricatie(Integer.parseInt(val[3]));
						b.setLitraj(Double.parseDouble(val[4]));
						b.setPret(Double.parseDouble(val[5]));
						b.setCaroserie(val[6]);
						autovehicule.add(b);
						break;
					case "AUTOBUZ":
						Autobuz c = new Autobuz();
						c.setId(Integer.parseInt(val[1]));
						c.setMarca(val[2]);
						c.setAnFabricatie(Integer.parseInt(val[3]));
						c.setLitraj(Double.parseDouble(val[4]));
						c.setPret(Double.parseDouble(val[5]));
						c.setCapacitatePersoane(Integer.parseInt(val[6]));
						autovehicule.add(c);
						break;
					case "CAMION":
						Camion d = new Camion();
						d.setId(Integer.parseInt(val[1]));
						d.setMarca(val[2]);
						d.setAnFabricatie(Integer.parseInt(val[3]));
						d.setLitraj(Double.parseDouble(val[4]));
						d.setPret(Double.parseDouble(val[5]));
						d.setMaxLoad(Double.parseDouble(val[6]));
						autovehicule.add(d);
						break;
					default:
						System.out.println("EROAREdefcAV!");
						break;
				}
			}
		}
		catch(FileNotFoundException exc) {
			System.out.println("FISIER INEXISTENT!");
		}
		catch(IOException exc) {
			System.out.println("EROAREcAV!");
		}
		
		return autovehicule;
	}
	
	public TreeSet<Client> citireClientiCSV(){
		TreeSet<Client> clienti = new TreeSet<Client>();
		
		try(BufferedReader reader = new BufferedReader(new FileReader("clienti.csv"))){
			
			String linie;
			while ((linie = reader.readLine()) != null) {
				String[] val = linie.split(",");
				
				Client c = new Client();
				c.setId(Integer.parseInt(val[0]));
				c.setNume(val[1]);
				c.setCnp(val[2]);
				
				if(val.length-3>0)
					for(int i = 3; i<val.length; i++)
						c.addVehicle(Integer.parseInt(val[i]));
				
				clienti.add(c);
			}
		}
		catch(FileNotFoundException exc) {
			System.out.println("FISIER INEXISTENT!");
		}
		catch(IOException exc) {
			System.out.println("EROAREcC!");
		}
		
		return clienti;
	}
}

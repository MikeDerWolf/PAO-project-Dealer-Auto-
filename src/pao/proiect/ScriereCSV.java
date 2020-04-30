package pao.proiect;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class ScriereCSV {
	
	private static ScriereCSV instance = null;
	
	private ScriereCSV() {
		
	}
	
	public static ScriereCSV getInstance() {
		if (instance == null) 
            instance = new ScriereCSV(); 
        return instance; 	
	}
	
	public void scriereVanzariCSV(ArrayList<Vanzare> vanzari) {
		try(FileWriter fileW = new FileWriter("vanzari.csv", false)) {
			
			for(Vanzare v:vanzari) {
				String linie = (new StringBuilder())
						.append(String.valueOf(v.getId())).append(",")
						.append(v.getDate().toString()).append(",")
						.append(String.valueOf(v.getIdClient())).append(",")
						.append(String.valueOf(v.getIdVehicul())).append(",")
						.append(String.valueOf(v.getSuma())).append("\n").toString();
				fileW.write(linie);
			}
			fileW.close();
		
		}
		catch(IOException exc) {
			System.out.println("EROAREsV!");
		}
	}
	
	public void scriereAutovehiculeCSV(ArrayList<Autovehicul> autovehicule) {
		try(FileWriter fileW = new FileWriter("stocAutovehicule.csv", false)) {
			
			for(Autovehicul a:autovehicule) {
				StringBuilder bld = (new StringBuilder())
						.append(a.getTip()).append(",")
						.append(String.valueOf(a.getId())).append(",")
						.append(a.getMarca()).append(",")
						.append(String.valueOf(a.getAnFabricatie())).append(",")
						.append(String.valueOf(a.getLitraj())).append(",")
						.append(String.valueOf(a.getPret())).append(",");
				
				switch(a.getTip()) {
					case "MOTOCICLETA":
						bld.append(String.valueOf((a.getInt())));
						break;
					case "MASINA":
						bld.append((a.getString()));
						break;
					case "AUTOBUZ":
						bld.append(String.valueOf(a.getInt()));
						break;
					case "CAMION":
						bld.append(String.valueOf(a.getDouble()));
						break;
					default:
						System.out.println("EROAREdefsA!");
						break;
				}
				
				bld.append("\n");
				String linie = bld.toString();
				fileW.write(linie);
			}
			fileW.close();
		
		}
		catch(IOException exc) {
			System.out.println("EROAREsA!");
		}
	}
	
	public void scriereAutovehiculeVanduteCSV(ArrayList<Autovehicul> autovehicule) {
		try(FileWriter fileW = new FileWriter("autovehiculeVandute.csv", false)) {
			
			for(Autovehicul a:autovehicule) {
				StringBuilder bld = (new StringBuilder())
						.append(a.getTip()).append(",")
						.append(String.valueOf(a.getId())).append(",")
						.append(a.getMarca()).append(",")
						.append(String.valueOf(a.getAnFabricatie())).append(",")
						.append(String.valueOf(a.getLitraj())).append(",")
						.append(String.valueOf(a.getPret())).append(",");
				
				switch(a.getTip()) {
					case "MOTOCICLETA":
						bld.append(String.valueOf(a.getInt()));
						break;
					case "MASINA":
						bld.append(a.getString());
						break;
					case "AUTOBUZ":
						bld.append(String.valueOf(a.getInt()));
						break;
					case "CAMION":
						bld.append(String.valueOf(a.getDouble()));
						break;
					default:
						System.out.println("EROAREdefsAV!");
						break;
				}
				
				bld.append("\n");
				String linie = bld.toString();
				fileW.write(linie);
			}
			fileW.close();
		
		}
		catch(IOException exc) {
			System.out.println("EROAREsAV!");
		}
	}
	
	public void scriereClientiCSV(TreeSet<Client> clienti) {
		try(FileWriter fileW = new FileWriter("clienti.csv", false)) {
			
			for(Client c:clienti) {
				StringBuilder bld = (new StringBuilder())
						.append(String.valueOf(c.getId())).append(",")
						.append(c.getNume()).append(",")
						.append(c.getCnp());
				
				TreeSet<Integer> aux = c.getVehicles();
				if(aux.size() != 0)
					for(Integer i:aux) {
						bld.append(",").append(i.toString());
					}
				
				bld.append("\n");
				String linie = bld.toString();
				fileW.write(linie);
				
			}
			fileW.close();
		
		}
		catch(IOException exc) {
			System.out.println("EROAREsC!");
		}
	}
	
}

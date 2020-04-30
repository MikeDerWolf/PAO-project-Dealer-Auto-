package pao.proiect;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Vanzare {
	private static int indexVanzari = readCounter();
	private int id;
	private LocalDate date;
	private int idClient;
	private int idVehicul;
	private double suma;
	
	public Vanzare() {
		
	}
	
	public Vanzare(int idClient, int idVehicul, double suma) {
		this.id = ++indexVanzari;
		this.date = LocalDate.now();
		this.idClient = idClient;
		this.idVehicul = idVehicul;
		this.suma = suma;
		writeCounter();
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public LocalDate getDate() {
		return this.date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public int getIdClient() {
		return this.idClient;
	}
	
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	
	public int getIdVehicul() {
		return this.idVehicul;
	}
	
	public void setIdVehicul(int idVehicul) {
		this.idVehicul = idVehicul;
	}
	
	public double getSuma() {
		return this.suma;
	}
	
	public void setSuma(double suma) {
		this.suma = suma;
	}
	
	@Override
	public String toString() {
		return "Cod vanzare: " + this.id + "  " + "Data: " + this.date + "  " + "Cod client: " + this.idClient + "  " + "Cod autovehicul: " + this.idVehicul + "  " + "Suma: " + this.suma;
	}
	
	public static int readCounter() {
		try(BufferedReader reader = new BufferedReader(new FileReader("counterVanzari.txt"))){
			
			int val;
			String linie;
			linie = reader.readLine();
			val = Integer.parseInt(linie);
			return val;
		}
		catch(FileNotFoundException exc) {
			int val = 0;
			return val;
		}
		catch(IOException exc) {
			int val = 0;
			System.out.println("EROARE!");
			return val;
		}
	}
	
	public void writeCounter() {
		try(FileWriter fileW = new FileWriter("counterVanzari.txt", false)) {
			
			fileW.write(String.valueOf(indexVanzari));
			fileW.close();
		}
		catch(IOException exc) {
			System.out.println("EROAREsA!");
		}
	}
}

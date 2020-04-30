package pao.proiect;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class Client implements Comparable {
	private static int indexClienti = readCounter();
	private int id;
	private String nume;
	private String cnp;
	private TreeSet<Integer> boughtVehicles;
	
	public Client() {
		this.boughtVehicles = new TreeSet<Integer>();
	}
	
	public Client(String nume, String cnp) {
		this.id = ++indexClienti;
		this.nume = nume;
		this.cnp = cnp;
		this.boughtVehicles = new TreeSet<Integer>();
		writeCounter();
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public String getCnp() {
		return this.cnp;
	}
	
	public void setCnp(String cnp) {
		this.cnp = cnp;
	}
	
	public void addVehicle(Integer a) {
		this.boughtVehicles.add(a);
	}
	
	public TreeSet<Integer> getVehicles() {
		return this.boughtVehicles;
	}
	
	@Override
    public int compareTo(Object o) {
        Client client = (Client)o;
        return this.nume.compareTo(client.getNume());
    }
	
	@Override
    public boolean equals(Object o) {
        return ((Client)o).getId()==(this.id);
    }
	
	@Override
	public String toString() {
		return "Cod client: " + this.id + "  " + "Nume: " + this.nume + "  " + "CNP: " + this.cnp;
	}
	
	public static int readCounter() {
		try(BufferedReader reader = new BufferedReader(new FileReader("counterClienti.txt"))){
			
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
		try(FileWriter fileW = new FileWriter("counterClienti.txt", false)) {
			
			fileW.write(String.valueOf(indexClienti));
			fileW.close();
		}
		catch(IOException exc) {
			System.out.println("EROAREsA!");
		}
	}
	
}

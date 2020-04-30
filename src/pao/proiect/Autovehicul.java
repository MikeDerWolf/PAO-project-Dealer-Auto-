package pao.proiect;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class Autovehicul implements Comparable {
	protected static int indexAutovehicule = readCounter();
	protected String tip;
	protected int id;
	protected String marca;
	protected int anFabricatie;
	protected double litraj;
	protected double pret;
	
	public Autovehicul() {
		
	}
	
	public Autovehicul(String marca, int anFabricatie, double litraj, double pret) {
		this.id = ++indexAutovehicule;
		this.marca = marca;
		this.anFabricatie = anFabricatie;
		this.litraj = litraj;
		this.pret = pret;
		writeCounter();
	}
	
	public double getPretRedus() {
		return this.pret;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getAnFabricatie() {
		return this.anFabricatie;
	}
	
	public void setAnFabricatie(int anFabricatie) {
		this.anFabricatie = anFabricatie;
	}
	
	public double getLitraj() {
		return this.litraj;
	}
	
	public void setLitraj(double litraj) {
		this.litraj = litraj;
	}
	
	public double getPret() {
		return this.pret;
	}
	
	public void setPret(double pret) {
		this.pret = pret;
	}
	
	public String getTip() {
		return this.tip;
	}
	
	public int getInt() {
		return 0;
	}
	
	public double getDouble() {
		return 0.0;
	}
	
	public String getString() {
		return "";
	}
	
	@Override
    public int compareTo(Object o) {
        Autovehicul vehicul = (Autovehicul)o;
        return this.marca.compareTo(vehicul.getMarca());
    }
	
	@Override
    public boolean equals(Object o) {
        return ((Autovehicul)o).getId()==(this.id);
    }
	
	@Override
	public String toString() {
		return "ID: " + this.id + "Marca: " + this.marca + "  " + "An fabricatie: " + this.anFabricatie + "  " + "Litraj(L): " + this.litraj + "  " + "Pret vanzare(EUR): " + this.getPretRedus();
	}
	
	public static int readCounter() {
		try(BufferedReader reader = new BufferedReader(new FileReader("counterAutovehicule.txt"))){
			
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
		try(FileWriter fileW = new FileWriter("counterAutovehicule.txt", false)) {
			
			fileW.write(String.valueOf(indexAutovehicule));
			fileW.close();
		}
		catch(IOException exc) {
			System.out.println("EROAREsA!");
		}
	}
}

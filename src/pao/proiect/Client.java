package pao.proiect;
import java.util.TreeSet;

public class Client implements Comparable {
	private static int indexClienti = 0;
	private int id;
	private String nume;
	private String cnp;
	private TreeSet<Autovehicul> boughtVehicles;
	
	public Client(String nume, String cnp) {
		this.id = ++indexClienti;
		this.nume = nume;
		this.cnp = cnp;
		this.boughtVehicles = new TreeSet<Autovehicul>();
	}
	
	public int getId() {
		return this.id;
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
	
	public void addVehicle(Autovehicul a) {
		this.boughtVehicles.add(a);
	}
	
	public void printVehicles() {
		for(Autovehicul i:this.boughtVehicles) {
			System.out.println(i.toString());
		}
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
		return "Nume: " + this.nume + "  " + "Cod client: " + this.id + "  " + "CNP: " + this.cnp;
	}
	
}

package pao.proiect;
import java.time.LocalDate;

public class Vanzare {
	private static int indexVanzari = 0;
	private int id;
	private LocalDate date;
	private Client client;
	private Autovehicul vehicul;
	private double suma;
	
	public Vanzare(Client client, Autovehicul vehicul) {
		this.id = ++indexVanzari;
		this.date = LocalDate.now();
		this.client = client;
		this.vehicul = vehicul;
		this.suma = vehicul.getPretRedus();
	}
	
	public int getId() {
		return this.id;
	}
	
	public LocalDate getDate() {
		return this.date;
	}
	
	public Client getClient() {
		return this.client;
	}
	
	public Autovehicul getVehicle() {
		return this.vehicul;
	}
	
	public String getClientData() {
		return this.client.toString();
	}
	
	public String getVehicleData() {
		return this.vehicul.toString();
	}
	
	public double getSuma() {
		return this.suma;
	}
	
	@Override
	public String toString() {
		return "Cod vanzare: " + this.id + "  " + "Data: " + this.date + "  " + "Cod client: " + this.client.getId() + "  " + "Nume: " + this.client.getNume() + "  " + "Cod autovehicul: " + this.vehicul.getId() + "  " + "Suma: " + this.suma;
	}
}

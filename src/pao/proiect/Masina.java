package pao.proiect;
import java.time.LocalDate;

public class Masina extends Autovehicul {
	private String caroserie;
	
	public Masina(String marca, int anFabricatie, double litraj, double pret, String caroserie) {
		super(marca, anFabricatie, litraj, pret);
		this.caroserie = caroserie;
	}
	
	@Override
	public double getPretRedus() {
		if(LocalDate.now().getYear() - this.anFabricatie >=5)
			return 0.85*this.pret;
		else
			return this.pret;
	}
	
	public String getCaroserie() {
		return this.caroserie;
	}
	
	public void setCaroserie(String caroserie) {
		this.caroserie = caroserie;
	}
	
	@Override
	public String toString() {
		return "MASINA -- " + "Marca: " + this.marca + "  " + "An fabricatie: " + this.anFabricatie + "  " + "Litraj(L): " + this.litraj + "  " + "Pret vanzare(EUR): " + this.getPretRedus() + "  " + "Caroserie: " + this.caroserie;
	}
}

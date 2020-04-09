package pao.proiect;
import java.time.LocalDate;

public class Motocicleta extends Autovehicul {
	private int aniGarantie;
	
	public Motocicleta(String marca, int anFabricatie, double litraj, double pret, int aniGarantie) {
		super(marca, anFabricatie, litraj, pret);
		this.aniGarantie = aniGarantie;
	}
	
	@Override
	public double getPretRedus() {
		if(LocalDate.now().getYear() - this.anFabricatie >=4)
			return 0.9*this.pret;
		else
			return this.pret;
	}
	
	public int getAniGarantie() {
		return this.aniGarantie;
	}
	
	public void setAniGarantie(int aniGarantie) {
		this.aniGarantie = aniGarantie;
	}
	
	@Override
	public String toString() {
		return "MOTOCICLETA -- " + "Marca: " + this.marca + "  " + "An fabricatie: " + this.anFabricatie + "  " + "Litraj(L): " + this.litraj + "  " + "Pret vanzare(EUR): " + this.getPretRedus() + "  " + "Ani garantie: " + this.aniGarantie;
	}
}

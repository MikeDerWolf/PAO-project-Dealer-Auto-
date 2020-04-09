package pao.proiect;
import java.util.Objects;

public class Autovehicul implements Comparable {
	protected static int indexAutovehicule = 0;
	protected int id;
	protected String marca;
	protected int anFabricatie;
	protected double litraj;
	protected double pret;
	
	public Autovehicul(String marca, int anFabricatie, double litraj, double pret) {
		this.id = ++indexAutovehicule;
		this.marca = marca;
		this.anFabricatie = anFabricatie;
		this.litraj = litraj;
		this.pret = pret;
	}
	
	public double getPretRedus() {
		return this.pret;
	}
	
	public int getId() {
		return this.id;
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
		return "Marca: " + this.marca + "  " + "An fabricatie: " + this.anFabricatie + "  " + "Litraj(L): " + this.litraj + "  " + "Pret vanzare(EUR): " + this.getPretRedus();
	}
}

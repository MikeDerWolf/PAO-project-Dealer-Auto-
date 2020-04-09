package pao.proiect;
import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		/*Autovehicul car = new Autovehicul("Ford", 2016, 44.5, 2100);
		System.out.println(car.toString());
		System.out.println(car.getId());
		
		Motocicleta m = new Motocicleta("BMW", 2011, 50, 10000, 6);
		System.out.println(m.toString());
		System.out.println(m.getId());
		
		Masina ma = new Masina("Audi", 2020, 60, 10000, "combi");
		System.out.println(ma.toString());
		System.out.println(ma.getId());
		
		Autobuz a = new Autobuz("Mercedes", 2012, 80, 10000, 40);
		System.out.println(a.toString());
		System.out.println(a.getId());
		
		Camion c = new Camion("MAN", 2013, 200, 10000, 23);
		System.out.println(c.toString());
		System.out.println(c.getId());
		
		System.out.println("-----------------");
		
		TreeSet<Autovehicul> veh = new TreeSet<Autovehicul>();
		veh.add(car);
		veh.add(ma);
		veh.add(c);
		
		for(Autovehicul i:veh) {
			System.out.println(i.toString());
			System.out.println(i.getId());
		}*/
		
		Servicii app = new Servicii();
		app.adaugareAutovehicul();
		app.adaugareAutovehicul();
		app.adaugareAutovehicul();
		app.adaugareAutovehicul();
		app.adaugareAutovehicul();
		app.afisareAutovehicule();
		app.stergereAutovehicul();
		app.afisareAutovehicule();
		app.adaugareClient();
		app.adaugareClient();
		app.adaugareClient();
		app.afisareClienti();
		app.stergereClient();
		app.afisareClienti();
		app.inregistrareVanzare();
		app.inregistrareVanzare();
		app.afisareVanzari();
		app.afisareAutovehicule();
		app.afisareAutovehiculeClient();
		app.afisareInformatiiClient();
		
	}

}

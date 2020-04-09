package pao.proiect;
import java.util.*;

public class Servicii {
	private ArrayList<Autovehicul> stocAutovehicule;
	private TreeSet<Client> clienti;
	private ArrayList<Vanzare> vanzari;
	
	public Servicii() {
		this.stocAutovehicule = new ArrayList<Autovehicul>();
		this.clienti = new TreeSet<Client>();
		this.vanzari = new ArrayList<Vanzare>();
	}
	
	void adaugareAutovehicul() {
		System.out.println("Tip autovehicul (1 - Motocicleta   2 - Masina   3 - Autobuz   4 - Camion): ");
		String marca;
		int anFabricatie;
		double litraj;
		double pret;
		int aniGarantie;
		String caroserie;
		int capacitatePersoane;
		double maxLoad;
		
		Scanner scan = new Scanner(System.in);
		int opt = scan.nextInt();
		scan.nextLine();
		switch(opt) {
			case 1:
				System.out.println("Marca: ");
				marca = scan.nextLine();
				System.out.println("An fabricatie: ");
				anFabricatie = scan.nextInt();
				scan.nextLine();
				System.out.println("Litraj: ");
				litraj = scan.nextDouble();
				scan.nextLine();
				System.out.println("Pret: ");
				pret = scan.nextDouble();
				scan.nextLine();
				System.out.println("Ani garantie: ");
				aniGarantie = scan.nextInt();
				scan.nextLine();
				Motocicleta a = new Motocicleta(marca, anFabricatie, litraj, pret, aniGarantie);
				this.stocAutovehicule.add(a);
				break;
			case 2:
				System.out.println("Marca: ");
				marca = scan.nextLine();
				System.out.println("An fabricatie: ");
				anFabricatie = scan.nextInt();
				scan.nextLine();
				System.out.println("Litraj: ");
				litraj = scan.nextDouble();
				scan.nextLine();
				System.out.println("Pret: ");
				pret = scan.nextDouble();
				scan.nextLine();
				System.out.println("Caroserie: ");
				caroserie = scan.nextLine();
				Masina b = new Masina(marca, anFabricatie, litraj, pret, caroserie);
				this.stocAutovehicule.add(b);
				break;
			case 3:
				System.out.println("Marca: ");
				marca = scan.nextLine();
				System.out.println("An fabricatie: ");
				anFabricatie = scan.nextInt();
				scan.nextLine();
				System.out.println("Litraj: ");
				litraj = scan.nextDouble();
				scan.nextLine();
				System.out.println("Pret: ");
				pret = scan.nextDouble();
				scan.nextLine();
				System.out.println("Capacitate maxima persoane: ");
				capacitatePersoane = scan.nextInt();
				scan.nextLine();
				Autobuz c = new Autobuz(marca, anFabricatie, litraj, pret, capacitatePersoane);
				this.stocAutovehicule.add(c);
				break;
			case 4:
				System.out.println("Marca: ");
				marca = scan.nextLine();
				System.out.println("An fabricatie: ");
				anFabricatie = scan.nextInt();
				scan.nextLine();
				System.out.println("Litraj: ");
				litraj = scan.nextDouble();
				scan.nextLine();
				System.out.println("Pret: ");
				pret = scan.nextDouble();
				scan.nextLine();
				System.out.println("Incarcatura maxima: ");
				maxLoad = scan.nextDouble();
				scan.nextLine();
				Camion d = new Camion(marca, anFabricatie, litraj, pret, maxLoad);
				this.stocAutovehicule.add(d);
				break;
			default:
				System.out.println("Optiune incorecta!");
		}
		
	}
	
	void afisareAutovehicule() {
		for(Autovehicul a:this.stocAutovehicule) {
			System.out.println(a.toString());
		}
	}
	
	void stergereAutovehicul() {
		System.out.println("Introduceti ID-ul autovehiculului: ");
		
		Scanner scan = new Scanner(System.in);
		int idStergere = scan.nextInt();
		scan.nextLine();
		
		int index = -1;
		for(Autovehicul a:this.stocAutovehicule) {
			if(a.getId()==idStergere) {
				index = this.stocAutovehicule.indexOf(a);
				break;
			}
		}
		if(index == -1)
			System.out.println("Nu exista autovehiculul!");
		else
			this.stocAutovehicule.remove(index);
		
	}
	
	void adaugareClient() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nume: ");
		String nume = scan.nextLine();
		System.out.println("CNP: ");
		String cnp = scan.nextLine();
		
		Client c = new Client(nume, cnp);
		this.clienti.add(c);
	}
	
	void afisareClienti() {
		for(Client a:this.clienti) {
			System.out.println(a.toString());
		}
	}
	
	void stergereClient() {
		System.out.println("Introduceti ID-ul clientului: ");
		
		Scanner scan = new Scanner(System.in);
		int idStergere = scan.nextInt();
		scan.nextLine();
		
		Client index = null;
		for(Client a:this.clienti) {
			if(a.getId()==idStergere) {
				index = a;
				break;
			}
		}
		if(index == null)
			System.out.println("Nu exista clientul!");
		else
			this.clienti.remove(index);
	}
	
	void inregistrareVanzare() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduceti ID-ul clientului: ");
		int idClient = scan.nextInt();
		scan.nextLine();
		System.out.println("Introduceti ID-ul autovehiculului: ");
		int idVehicle = scan.nextInt();
		scan.nextLine();
		
		Client cl = null;
		for(Client a:this.clienti) {
			if(a.getId()==idClient) {
				cl = a;
				break;
			}
		}
		
		Autovehicul av = null;
		for(Autovehicul a:this.stocAutovehicule) {
			if(a.getId()==idVehicle) {
				av = a;
				break;
			}
		}
		
		if(cl!=null && av!=null) {
			cl.addVehicle(av);
			Vanzare v = new Vanzare(cl, av);
			this.vanzari.add(v);
			this.stocAutovehicule.remove(av);
		}
		else
			System.out.println("Nu au fost gasite ID-urile!");
	}
	
	void afisareVanzari() {
		for(Vanzare a:this.vanzari) {
			System.out.println(a.toString());
		}
	}
	
	void afisareAutovehiculeClient() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduceti ID-ul clientului: ");
		int idClient = scan.nextInt();
		scan.nextLine();
		
		Client cl = null;
		for(Client a:this.clienti) {
			if(a.getId()==idClient) {
				cl = a;
				break;
			}
		}
		if(cl == null)
			System.out.println("Nu exista clientul!");
		else
			cl.printVehicles();
	}
	
	void afisareInformatiiClient() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduceti ID-ul clientului: ");
		int idClient = scan.nextInt();
		scan.nextLine();
		
		Client cl = null;
		for(Client a:this.clienti) {
			if(a.getId()==idClient) {
				cl = a;
				break;
			}
		}
		if(cl == null)
			System.out.println("Nu exista clientul!");
		else
			System.out.println(cl.toString());
	}
}

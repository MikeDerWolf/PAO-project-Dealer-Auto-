package pao.proiect;
import java.util.*;

public class Servicii {
	private ArrayList<Autovehicul> stocAutovehicule;
	private ArrayList<Autovehicul> autovehiculeVandute;
	private TreeSet<Client> clienti;
	private ArrayList<Vanzare> vanzari;
	
	public Servicii() {
		this.stocAutovehicule = new ArrayList<Autovehicul>();
		this.autovehiculeVandute = new ArrayList<Autovehicul>();
		this.clienti = new TreeSet<Client>();
		this.vanzari = new ArrayList<Vanzare>();
	}
	
	public ArrayList<Autovehicul> getStocAutovehicule(){
		return this.stocAutovehicule;
	}
	
	public ArrayList<Autovehicul> getAutovehiculeVandute(){
		return this.autovehiculeVandute;
	}
	
	public TreeSet<Client> getClienti(){
		return this.clienti;
	}
	
	public ArrayList<Vanzare> getVanzari(){
		return this.vanzari;
	}
	
	
	
	public void adaugareAutovehicul() {
		System.out.println("Adaugare autovehicul:");
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
		Audit.scrieActiune("Adaugare autovehicul");
		
	}
	
	public void afisareAutovehicule() {
		System.out.println("Stoc autovehicule:");
		for(Autovehicul a:this.stocAutovehicule) {
			System.out.println(a.toString());
		}
		Audit.scrieActiune("Afisare autovehicule");
	}
	
	public void stergereAutovehicul() {
		System.out.println("Stergere autovehicul:");
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
		
		Audit.scrieActiune("Stergere autovehicul");
	}
	
	public void afisareAutovehiculeVandute() {
		System.out.println("Autovehicule vandute:");
		for(Autovehicul a:this.autovehiculeVandute) {
			System.out.println(a.toString());
		}
		Audit.scrieActiune("Afisare autovehicule vandute");
	}
	
	public void adaugareClient() {
		System.out.println("Adaugare client:");
		Scanner scan = new Scanner(System.in);
		System.out.println("Nume: ");
		String nume = scan.nextLine();
		System.out.println("CNP: ");
		String cnp = scan.nextLine();
		
		Client c = new Client(nume, cnp);
		this.clienti.add(c);
		
		Audit.scrieActiune("Adaugare client");
	}
	
	public void afisareClienti() {
		System.out.println("Afisare clienti:");
		for(Client a:this.clienti) {
			System.out.println(a.toString());
		}
		
		Audit.scrieActiune("Afisare clienti");
	}
	
	public void stergereClient() {
		System.out.println("Stergere client:");
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
		
		Audit.scrieActiune("Stergere client");
	}
	
	public void inregistrareVanzare() {
		System.out.println("Inregistrare vanzare:");
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
			cl.addVehicle(av.getId());
			Vanzare v = new Vanzare(cl.getId(), av.getId(), av.getPretRedus());
			this.vanzari.add(v);
			this.autovehiculeVandute.add(av);
			this.stocAutovehicule.remove(av);
		}
		else
			System.out.println("Nu au fost gasite ID-urile!");
		
		Audit.scrieActiune("Inregistrare vanzare");
	}
	
	public void afisareVanzari() {
		System.out.println("Istoric vanzari:");
		for(Vanzare a:this.vanzari) {
			System.out.println(a.toString());
		}
		
		Audit.scrieActiune("Afisare vanzari");
	}
	
	public void afisareAutovehiculeClient() {
		System.out.println("Afisare autovehicule ale clientului:");
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
		else {
			TreeSet<Integer> aux = cl.getVehicles();
			if(aux.size() == 0) {
				System.out.println("Clientul nu a cumparat niciun autovehicul!");
			}
			else {
				for(Integer idVeh:aux)
					for(Autovehicul veh:this.autovehiculeVandute) {
						if(idVeh == veh.id) {
							System.out.println(veh.toString());
						}
					}
			}
		}
		
		Audit.scrieActiune("Afisare autovehicule ale clientului");
	}
	
	public void afisareAutovehiculeDupaPret() {
		System.out.println("Afisare autovehicule in functie de pret:");
		ArrayList<Autovehicul> stocClone =  (ArrayList<Autovehicul>) this.stocAutovehicule.clone();
		Collections.sort(stocClone, new AutovehiculComparator());
		for(Autovehicul a:stocClone) {
			System.out.println(a.toString());
		}
		
		Audit.scrieActiune("Afisare autovehicule dupa pret");
	}
	
	void addVanzare(Vanzare v) {
		this.vanzari.add(v);
	}
	
	void addAutovehicul(Autovehicul a) {
		this.stocAutovehicule.add(a);
	}
	
	void addAutovehiculVandut(Autovehicul a) {
		this.autovehiculeVandute.add(a);
	}
	
	void addClient(Client c) {
		this.clienti.add(c);
	}
}

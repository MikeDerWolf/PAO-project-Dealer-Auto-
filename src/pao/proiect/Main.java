package pao.proiect;
import java.util.*;

public class Main {
	
	public static void optiuni() {
		System.out.println("Optiuni: \n1) Adaugare autovehicul\n2) Afisare stoc autovehicule\n" + 
							"3) Stergere autovehicul\n4) Afisare autovehicule vandute\n" +
							"5) Adaugare client\n6) Afisare clienti\n7) Stergere client\n" + 
							"8) Inregistrare vanzare\n9) Afisare istoric vanzari\n" + 
							"10) Afisare autovehicule client\n11) Afisare autovehicule dupa pret\n" + 
							"0) Iesire\n");
	}
	
	public static void main(String[] args) {
		
		Servicii app = new Servicii();
		CitireCSV citireCSV = CitireCSV.getInstance();
		ScriereCSV scriereCSV = ScriereCSV.getInstance();
		
		ArrayList<Autovehicul> autovehiculeFisier = citireCSV.citireAutovehiculeCSV();
		if(autovehiculeFisier.size() != 0)
			for(Autovehicul a:autovehiculeFisier) {
				app.addAutovehicul(a);
			}
		autovehiculeFisier.clear();
		
		ArrayList<Autovehicul> autovehiculeVanduteFisier = citireCSV.citireAutovehiculeVanduteCSV();
		if(autovehiculeVanduteFisier.size() != 0)
			for(Autovehicul a:autovehiculeVanduteFisier) {
				app.addAutovehiculVandut(a);
			}
		autovehiculeVanduteFisier.clear();
		
		TreeSet<Client> clientiFisier = citireCSV.citireClientiCSV();
		if(clientiFisier.size() != 0)
			for(Client c:clientiFisier) {
				app.addClient(c);
			}
		clientiFisier.clear();
		
		ArrayList<Vanzare> vanzariFisier = citireCSV.citireVanzariCSV();
		if(vanzariFisier.size() != 0)
			for(Vanzare v:vanzariFisier) {
				app.addVanzare(v);
			}
		vanzariFisier.clear();
		
		/*app.adaugareAutovehicul();
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
		app.afisareAutovehiculeDupaPret();
		app.afisareAutovehicule();
		app.afisareAutovehiculeVandute();*/
		
		//boolean ok = true;
		Scanner in = new Scanner(System.in);
        optiuni();
        int optiune = in.nextInt();
        
        
        while(true) {
        	
        	switch(optiune) {
        		case 1:
        			app.adaugareAutovehicul();
        			break;
        		case 2:
        			app.afisareAutovehicule();
        			break;
        		case 3:
        			app.stergereAutovehicul();
        			break;
        		case 4:
        			app.afisareAutovehiculeVandute();
        			break;
        		case 5:
        			app.adaugareClient();
        			break;
        		case 6:
        			app.afisareClienti();
        			break;
        		case 7:
        			app.stergereClient();
        			break;
        		case 8:
        			app.inregistrareVanzare();
        			break;
        		case 9:
        			app.afisareVanzari();
        			break;
        		case 10:
        			app.afisareAutovehiculeClient();
        			break;
        		case 11:
        			app.afisareAutovehiculeDupaPret();
        			break;
        		case 0:
        			scriereCSV.scriereAutovehiculeCSV(app.getStocAutovehicule());
        			scriereCSV.scriereAutovehiculeVanduteCSV(app.getAutovehiculeVandute());
        			scriereCSV.scriereClientiCSV(app.getClienti());
        			scriereCSV.scriereVanzariCSV(app.getVanzari());
        			return;
        		default:
        			System.out.println("Incearca din nou!");
        	}
        	
        	optiuni();
        	optiune = in.nextInt();
        	
        }
		
		
		
	}

}

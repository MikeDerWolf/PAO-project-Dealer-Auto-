package pao.proiect;
import java.io.IOException;
import java.util.Date;
import java.io.FileWriter;

public class Audit {
	
	public static void scrieActiune(String actiune, String threadName) {
		try(FileWriter fileW = new FileWriter("audit.csv", true)) {
			
			Date data = new Date();
			String act = (new StringBuilder()).append(actiune).append(", ").append(data.toString()).append(", ").append(threadName).append("\n").toString();
			fileW.write(act);
			fileW.close();
		
		}
		catch(IOException exc) {
			System.out.println("EROARE!");
		}
	}
}

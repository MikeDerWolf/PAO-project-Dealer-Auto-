package pao.proiect;
import java.util.Comparator;

public class AutovehiculComparator implements Comparator<Autovehicul>{
	@Override
	public int compare(Autovehicul a1, Autovehicul a2) {
		return (int) (a1.getPretRedus() - a2.getPretRedus());
	}
}

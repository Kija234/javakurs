package la_luna;
import java.util.*;

public class Kartenspiel {
	
	private ArrayList<Karte> karten;
	private ArrayList<Karte> KartenStapel;
	
	
	public Kartenspiel() {
		karten = new ArrayList<Karte>();
		KartenStapel = new ArrayList<Karte>();
		
		
		
		for (Karte.Kartenwert wert: Karte.Kartenwert.values()) {
			for (Karte.Kartenfarbe farbe: Karte.Kartenfarbe.values()) {
				Karte k = new Karte(wert,farbe);
				karten.add(k);
			}
		}
	}
	
	//eine zufällige Karte ausgeben
	public Karte gibKarte() {
		Karte k= null;
		
		if(karten.size() > 0) {
			Random random = new Random();
			
			int idx = random.nextInt(karten.size());
			k= karten.remove(idx);
		} return k;
	}
	
	
	
	public void addToKartestapel(Karte k) {
		KartenStapel.add(k);
	}

	
	public void resetKartenSpiel() {
		while (KartenStapel.size() >0) {
			karten.add(KartenStapel.remove(0));
		}
	}
	
	public void showKarten() {
		for (Karte k : karten) {
			System.out.println(k.getWert() +" " + k.getFarbe());
		}
		
	}
}

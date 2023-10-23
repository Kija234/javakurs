package la_luna;  // equalsIgnoreCase -> ignoriert die Rechtschreibung

public class Karte {

	public enum Kartenwert{
		/*W2,
		W3,
		W4,
		W5,
		W6,*/
		W7,
		W8,
		W9,
		W10,
		Bube,
		Dame,
		König,
		As
	}
	
	public enum Kartenfarbe{
		Kreuz,
		Herz,
		Pic,
		Karo
	}
	
	private Kartenwert wert;
	private Kartenfarbe farbe;
	
	public Karte(Kartenwert w, Kartenfarbe f) {
		
		this.wert = w;
		this.farbe = f;
	}
	
	public Kartenwert getWert() {
		return wert;
	}
	
	public Kartenfarbe getFarbe() {
		return farbe;
	}
	
}

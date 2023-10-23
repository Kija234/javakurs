package Javakurs;

public class Auto {
	
	private String marke;
	private int tempo;
	private int ps;
	
	public Auto() {
		
		
	}
	
	public void setTempo(int s) {
		if(s>=0 && s<=180) {
			tempo=s;
		}else {
			System.out.println("Auto.setSpeed: Fehler! Geschwindigkeit ");
			System.out.print("muss zwischen 0 und 180 liegen!");
			System.out.println ("Alte Geschwindigkeit wird beibehalten.");		
			}
	
	}

	public int getTempo() {
		return tempo;
	}

	

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public String getMarke() {
		return marke;
	}
//Aufgabe aus der Lernseite: set für Marke nur mit vorbestimmten Werten festlegen.
	public void setMarke(String b) {
		if (b.equals("BMW") || b.equals("VW") || b.equals("Toyota") || b.equals("Mercedes")) {
			marke=b;
		}
	}

}

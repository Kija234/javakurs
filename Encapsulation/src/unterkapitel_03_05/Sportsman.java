package unterkapitel_03_05;

public class Sportsman extends Person{
	// Das Schlüsselwort extends macht aus der Klasse Sportsman eine Childklass,
	//die auch alle Variablen und Methoden der Klasse Person erbt.
	private String sport;
	public void setSport(String s) {
		sport=s;
	}
	
	public String getSport() {
		return sport;
	}
	
	public void introduceYourSelf() {
		System.out.println("Hallo! Mein Name ist " + getName() + "!");
		System.out.println("Ich übe die Sportart " + getSport() + " aus!");
	}

}

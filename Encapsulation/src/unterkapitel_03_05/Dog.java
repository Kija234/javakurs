package unterkapitel_03_05;

public class Dog extends Animal{
	
	private String race;
	
	public Dog(String r) {
		super ("Carnivora");
		setRace(r);
		
		//super bedeutet dass dieser Klasse explizit ein Konstruktor bereit gestellt wird,
		// den er aus der Elternklasse nicht erhalten hat.
		/*Das Schlüsselwort super dient nicht nur dazu, auf Superkonstruktoren Bezug zu nehmen, 
		 * sondern kann allgemein dazu genutzt werden, um auf nicht-private
		 * Elemente der Superklasse Bezug zu nehmen. 
		 * Dies wird zum Beispiel genutzt, 
		 * um in einer überschreibenden Methode Bezug auf die überschriebene Methode zu nehmen.
		 */
	}
	
	public String getRace() {
		return race;
	}
	
	public void setRace(String r) {
		race=r;
	}

}
/* Beachten Sie, dass der Aufruf Superkonstruktor niemals 
 * durch den Bezeichner des Superkonstruktors erfolgt,
 * sondern nur durch das Schlüsselwort super. Der Versuch,
 * im Dog-Konstruktor den Superkonstruktor mit Animal ("Carnivora");
 * aufzurufen, wird vom Compiler mit einer Fehlermeldung quittiert.
 */
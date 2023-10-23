package la_luna;
import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		
		//erstellen des Spiels
		Kartenspiel spiel = new Kartenspiel();
		// spiel.showKarten();
		
		
		//Karte ziehen
		Karte k= null;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Das Spiel beginnt. Drücken Sie die Returntaste, um eine Karte zu ziehen. \n Wenn Sie Ende eingeben, beenden Sie das Spiel.");
		
		do {
			String eingabe = scanner.nextLine();
			
			if (eingabe.equalsIgnoreCase("ende")) {
				break;
			}
			
			if ( k==null) {
				System.out.println("Geben Sie ja ein, wenn Sie ein weiteres Spiel wollen.");
				eingabe = scanner.nextLine();
				
				if(eingabe.toUpperCase().equals("Ja")) {
					spiel.resetKartenSpiel();
					
					k = spiel.gibKarte();	
					
				}
				
			}
			if(k == null) {
				System.out.println(k.getWert() + " " + k.getFarbe());
				spiel.addToKartestapel(k);
			}
		} while (k != null);
			scanner.close();
			System.out.println("Das Spiel ist beendet.");
			
	}
}

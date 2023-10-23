package javakurs;
import java.util.*;

public class AufteilungPiraten {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		
	System.out.print("Wie viele Flaschen wurden erbeutet?");	
		Scanner bottles= new Scanner(System.in);
		int botella = bottles.nextInt();
		
		
	System.out.println("Wie viele Mitglieder sind in der Crew, ohne den Cäptain mitzuzählen?");
		int crew= bottles.nextInt();
		
		int anteilc= (int) botella/2;
		
		System.out.println("Der Cäptain erhält " + anteilc + " Flaschen von der Beute.");
		
		int beute = botella - anteilc;
		
		System.out.println("Die Crew bekommt " + beute + " Flaschen");
		System.out.println("Gibt es eine faire Aufteilung, ohne dass was über bleibt?" + (beute % crew==0));
	// Modulo ist sehr wichtig hier lol!!!!	
		
	}

}

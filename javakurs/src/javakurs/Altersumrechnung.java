package javakurs;
import java.util.*;

public class Altersumrechnung {

	
	public static void main(String[] args) {
		System.out.println("Bonjour, heißen Sie?");
		Scanner alter = new Scanner(System.in);
		String name=alter.nextLine();
		
		System.out.println("Hallo, "+ name + " ,wie viele Jahre alt sind Sie?");
		
		int alterInTagen;
		int altersEingabe= alter.nextInt();
		
		
		
		alterInTagen=altersEingabe*365;
		
		System.out.println(altersEingabe + " Jahre sind " + alterInTagen + " Tage.");
	}
}



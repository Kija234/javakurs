package javakurs;
import java.util.*;

public class Pinabfrage {
	public static void main (String[] args) {
		int pin = 1234;
		     int anzahlVersuche = 0;
		     int eingabe;
		    
		     do {
		       anzahlVersuche++;
		       System.out.print ("PIN ("+anzahlVersuche+". Versuch): ");
		       eingabe = leseInteger ();
		     } while (anzahlVersuche < 3 && eingabe != pin);
		     
		     
		    if (eingabe == pin) {
		      System.out.println ("Zugang gewährt!");
		     }
		     else {
		       System.out.println ("Zugang verweigert!");
		     }
		   }
		  
		   public static int leseInteger () {
		     java.io.BufferedReader br = 
		       new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		     try {return Integer.parseInt (br.readLine());} 
		     catch (Exception ex) {return 0;}
}
}

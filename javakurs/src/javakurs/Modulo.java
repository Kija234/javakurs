package javakurs;
import java.util.*;

public class Modulo {
	
	public static void main(String[] args) {
	
	// Ein Münzautomat der nur Kleingeld auswirft
	
		System.out.println("Bitte den Betrag eingeben:");
	
	@SuppressWarnings("resource")
	Scanner myobjct= new Scanner(System.in);
	double Geld = myobjct.nextDouble();
	int kleingeld = (int) (Geld * 100);
	
	System.out.println(kleingeld/200 + " x 2€");
	kleingeld %= 200;
	System.out.println(kleingeld/100 + " x 1€");
	kleingeld %= 100;
	System.out.println(kleingeld/50 + " x 50");
	kleingeld %= 50;
	System.out.println(kleingeld/20 + " x 20 Cent");
	kleingeld %= 20;
	System.out.println(kleingeld/10 + " x 10 Cent");
	kleingeld %= 10;
	System.out.println(kleingeld/5 + " x 5 Cent");
	kleingeld %= 5;
	System.out.println(kleingeld/2 + " x 2 Cent");
	kleingeld %= 2;
	System.out.println(kleingeld + "x 1 Cent");
	
	
	

	}
}

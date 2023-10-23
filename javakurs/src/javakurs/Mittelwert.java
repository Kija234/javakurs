package javakurs; import java.util.*; import java.io.*;

public class Mittelwert {

	public static void main(String[] args) {
	    final int fest = 10;
		
		int[] nummer = new int[fest];
		int summe = 0;
		double durchschnitt;
		int lange = nummer.length;
		
		
		
		for (int i = 0; i < lange; i++) {
			nummer[i] = (int) (Math.random()*50)+ 1;
			summe += nummer[i];
		}
		 durchschnitt = (double) summe / nummer.length;

		System.out.println("Der Mittelwert ist " + durchschnitt);
	
		double radius = durchschnitt;
		
		getKreisUmfang(radius);
		System.out.print("Der Umfang in einem Kreis wäre "+ getKreisUmfang(radius));
		// mit der equals Methode können Objekte miteinander verglichen wird. 
		}
	public static double getKreisUmfang(double radius) {
		double umfang= 2*Math.PI*radius;
		return umfang;
	}
	}


package unterkapitel_04_01;
import java.util.*;

public class ExceptionDemo4 {



	public static void main(String[] args) {
		
		int divident, divisor, quotient;
		Scanner scanner= new Scanner(System.in);
		try {
			System.out.println("Divident: ");
			divident = scanner.nextInt();
			
			System.out.println("Divisor: ");
			divisor = scanner.nextInt();
			
			quotient = divident/divisor;
			System.out.println(divident+"/"+divisor+"="+quotient);
		}catch (ArithmeticException|InputMismatchException xx) {
			System.out.println("Die Eingabe war leider nicht richtig.");
		}finally {
			System.out.println("Bis zum nächsten mal!");
			}
		}

	}
//Der Stack Trace ist eine Auflistung der Methoden, die aufgerufen wurden, ehe es zu der Exception kam. Mit ihm lässt sich nachvollziehen, wie es zu dem Fehler kam.
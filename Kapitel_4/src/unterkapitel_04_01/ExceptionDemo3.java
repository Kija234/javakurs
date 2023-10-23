package unterkapitel_04_01;
import java.io.IOException;
import java.util.*;

public class ExceptionDemo3 {
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
		}catch (ArithmeticException ex) {
			System.out.println("Die Eingabe war leider nicht richtig.");
		}finally {
			System.out.println("Bis zum nächsten mal!");
		}
	}

}

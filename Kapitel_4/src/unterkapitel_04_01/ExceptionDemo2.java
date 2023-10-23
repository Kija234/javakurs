package unterkapitel_04_01;
import java.util.*;

public class ExceptionDemo2 {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int userAge =0;
		
		System.out.println("Bitte geben Sie Ihr Alter ein: ");
		
		try {
			userAge= scanner.nextInt();
			System.out.println("Sie sind etwa " + userAge*365 + " Tage alt. ");
		}catch(InputMismatchException ex) {
			System.out.println("Fehler! Bitte geben Sie nur Zahlen ein!");
		
		}
		
	}

}

package unterkapitel_04_01;
import java.util.*;

public class ExceptionDemo1 {

	public static void main (String[] args) {
		Scanner scanner= new Scanner(System.in);
		int usersAge =0;
		
		System.out.println("Bitte geben Sie Ihr Alter ein: ");
		
		try {
		 usersAge= scanner.nextInt();
		
		System.out.println("Sie sind etwa " +  (usersAge*365) + " Tage alt!");
	}
		catch (InputMismatchException ex) {
			System.out.println("Fehler! Sie müssen eine Zahl eingeben!");
		}
}
}

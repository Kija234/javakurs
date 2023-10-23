package unterkapitel_04_01;
import java.io.*;

public class CheckExceptionDemo {
	public static void main(String[] args) {
		FileReader fileReader;
		
		try {
		fileReader = new FileReader ("gibtesnicht.txt");
	} catch(FileNotFoundException ex) {
		System.out.println("Datei gibtesnicht.txt wurde nicht gefunden!");
	}

}
}
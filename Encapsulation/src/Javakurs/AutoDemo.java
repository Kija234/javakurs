package Javakurs;

public class AutoDemo {

	public static void main(String[] args) {
		
		Auto batmobil = new Auto();
		batmobil.setTempo(90);
		
		System.out.println("Batmobils Geschwindigkeit: ");
		System.out.println(batmobil.getTempo() + "km/h");
	}
}

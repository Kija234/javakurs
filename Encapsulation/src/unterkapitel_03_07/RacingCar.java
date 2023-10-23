package unterkapitel_03_07;

public class RacingCar extends Car{
	
	private int horsePower;
	
	public RacingCar(double gewicht, int leistung) {
		super (gewicht);
		horsePower = leistung;
	}
	
	public int getHP() {
		return horsePower;
	}

}

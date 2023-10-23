package unterkapitel_03_07;

public class Hausboot implements Haus, Boot {
	
	private int anzahlZimmer;
	private double tiefgangInCm;
	private boolean mitMotor;
	
	public Hausboot (int zimmer, int tiefgang, boolean mitMotor) {
		tiefgangInCm = tiefgang;
	}

	@Override
	public double liefereTiefgang() {
		// TODO Auto-generated method stub
		return tiefgangInCm;
	}

	@Override
	public int liefereAnzahlZimmer() {
		// TODO Auto-generated method stub
		return anzahlZimmer;
	}

	@Override
	public boolean mitGarten() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean hatMotor() {
		return mitMotor;
	}
	
	Hausboot hausboot = new Hausboot(4,80,false);
	Boot meinBoot = hausboot;
	Haus meinHaus = hausboot;

}

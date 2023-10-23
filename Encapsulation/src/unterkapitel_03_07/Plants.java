package unterkapitel_03_07;

public abstract class Plants implements Weighable{
	
	private String species;
	
	public Plants (String a) {
		species = a;
	}
	
	public String getSpecies () {
		return species;
	}

}

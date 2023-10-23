package unterkapitel_03_07;

public class Goldbar implements Weighable{
	
	private double  weight;
	
	public Goldbar(double gewichtInGramm) {
		setWeight (gewichtInGramm);
	}
	public void setWeight (double w) {
		if (w>0)
			weight = w;
	}
	
	public double getWeight() {
		return weight /1000.0;
	}

}

package unterkapitel_03_07;

public class Waage {
	
	public static void main(String[] args) {
		
		Waage waage = new Waage();
		
		Weighable saab = new Car(1500);
		Weighable peter = new Person(85);
		Goldbar meins = new Goldbar(100);
		
		waage.showWeight(saab);
		waage.showWeight(peter);
		waage.showWeight(meins);
	}
	
	public void showWeight(Weighable c){
		System.out.println("Das Gewicht beträgt: "+c.getWeight()+ " kg.");
	}

}

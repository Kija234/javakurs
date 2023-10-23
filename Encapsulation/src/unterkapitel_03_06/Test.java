package unterkapitel_03_06;

public class Test {
	
	public static void main (String[] args) {
		Figure f1 = new Circle (1);
		Figure f2 = new Circle (2); 
		
		showInfosFor (f1);
		showInfosFor (f2);
	}
	
	public static void showInfosFor(Figure x) {
		System.out.println("INFO FÜR "+x);
		System.out.println("Fläche: "+x.getArea());
		System.out.println("Umfang: "+x.getPerimeter());
		System.out.println("Verhältnis von Fläche und Umfang: ");
		System.out.println(x.getAreaPerimeterRatio());
		System.out.println();
	}

}

package javakurs;

public class Array {

	public static void main (String[] args) {
		
	double[] zahlen;
	
	zahlen= new double[3];
	zahlen[0]=1.0;
	zahlen[1]=2.5;
	zahlen[2]=zahlen[0]*3;
	
	System.out.println("erstes Element enthält" + zahlen[0]);
	System.out.println("Zweites Element enthält " + zahlen[1]);
	System.out.println("Drittes Element enthält die Rechnung " + zahlen[2]);
	
		
		
	}
	
}

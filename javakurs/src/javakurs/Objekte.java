package javakurs;

public class Objekte {

	private String marke;
	private int tempo;
	private int ps;

	public static void main(String[] args) {
		
		  
			      Objekte meins, deins;
			      meins = new Objekte ();
			      deins = new Objekte ();
			  
			      meins.marke = "BMW";
			      deins.marke = "Toyota";
			      meins.tempo = 0;
			      deins.tempo = 0;
			      meins.ps = 120;
			      deins.ps = 140;
			      meins.beschleunige ();
			 
			      System.out.print   ("Meine Marke: "+meins.marke);
			      System.out.println (", Meine Geschw.: "+meins.tempo);
			   
			      System.out.print   ("Deine Marke: "+deins.marke);
			      System.out.println (", Deine Geschw.: "+ deins.tempo);  
			    }

	private void beschleunige() {
		// TODO Auto-generated method stub
		
	}
			  
	}


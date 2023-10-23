package javakurs;

public class ReferenzDemo {
	 
	    
	    private String marke;

		public static void main (String args []) {
	      ReferenzDemo a = new ReferenzDemo ();
	      a.marke = "BMW";    
	  
	      ReferenzDemo b = a;
	      
	      b.marke = "Porsche";
	     
	      System.out.println (a.marke);    
	   }
	 

}

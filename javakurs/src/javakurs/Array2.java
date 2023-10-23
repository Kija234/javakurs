package javakurs;
public class Array2 {


public static void main (String args []) {
 /*
     int [] z;
     float durchschnitt = 0;
 
     z = new int [3];
 
     for (int i = 0; i < 3; i++) {
       System.out.print ("Bitte geben Sie ");
       System.out.print ("die "+(i+1)+". Zahl ein: ");
       z[i] = leseInteger ();
     }
 
     for (int i = 0; i < 3; i++) {
       durchschnitt += z[i];
     }
 
     durchschnitt /= 3f;
     System.out.print ("Der Durchschnittswert Ihrer ");
     System.out.println ("Eingaben beträgt: "+durchschnitt);
   
 
   public static int leseInteger () {
     java.io.BufferedReader br = 
      new java.io.BufferedReader(new
     java.io.InputStreamReader(System.in));
     try {return Integer.parseInt (br.readLine());} 
     catch (Exception ex) {return 0;}
   }*/
   /* int[] zahlen = {1,2,3,4,5,6,7,8,9};
   int groessteZahl= zahlen[0];
   
   for (int aktuelleZahl: zahlen) {
	   if(aktuelleZahl > groessteZahl) {
		   groessteZahl = aktuelleZahl;
	   }
   }
   System.out.println("Größte Zahl " + groessteZahl);
   }
   */
   //int[][] bitmap = new int[10][11];
	
	 int[][] bitmap = { {0,0,1,1,1,1,1,1,1,0,0},
             			{0,1,0,0,0,0,0,0,0,1,0},
             			{1,0,0,1,0,0,0,1,0,0,1},                          
             			{1,0,1,0,1,0,1,0,1,0,1},
             			{1,0,0,0,0,0,0,0,0,0,1},
             			{1,0,0,0,0,1,0,0,0,0,1},
             			{1,0,0,1,0,0,0,1,0,0,1},
             			{1,0,0,0,1,1,1,0,0,0,1},
             			{0,1,0,0,0,0,0,0,0,1,0},
             			{0,0,1,1,1,1,1,1,1,0,0} };
	 
	 for (int zeile=0; zeile<bitmap.length; zeile++) {
		 for (int spalte = 0; spalte < bitmap[zeile].length; spalte++) {
			 int farbe = bitmap [zeile][spalte];
			 
			 if(farbe==1)
				 System.out.print("◼ ");
			 else System.out.print("  ");
		 }
		 System.out.println();
	 }
 }
}

//Java IO
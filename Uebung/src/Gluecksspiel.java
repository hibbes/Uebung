import java.util.Scanner;

public class Gluecksspiel {
 
	static int alter1 = 19;
	static int alter2 = 30;
	
	static Scanner s = new Scanner(System.in);
	static boolean geschlecht1 = true;
	static boolean geschlecht2 = false;
	
	static String name1 = "Susanne";
	static String name2 = "Thomas";
	static int zahlPlayer1; 
	static int zahlPlayer2;
	static int wuerfel = wuerfeln();
	static int abstand1 = 0;
	static int abstand2 = 0;
	
	
	public static void main(String[] args) {
		
		begruessung(alter1,geschlecht1,name1,1);
		begruessung(alter2,geschlecht2,name2,2);
		auswertung();
			
		
	}
	
	public static void begruessung(int alter, boolean geschlecht, String name, int spieler){
	
		
		if(!bestimmeAlter(alter)){
			System.out.println("Hallo "+ name +"!");
			System.out.println();
			System.out.println("Gib deine Zahl ein:");
			if (spieler == 1){
			zahlPlayer1 = s.nextInt();}
			else{zahlPlayer2 = s.nextInt();}
			
		}else if(!geschlecht){
			System.out.println("Lieber Herr "+ name +"!");
			System.out.println("Geben Sie Ihre Zahl ein:");
			if (spieler == 1){
				zahlPlayer1 = s.nextInt();}
				else{zahlPlayer2 = s.nextInt();}
			
		}else{System.out.println("Liebe Frau "+ name +"!");
		  System.out.println("Geben Sie Ihre Zahl ein:");
		  if (spieler == 1){
				zahlPlayer1 = s.nextInt();}
				else{zahlPlayer2 = s.nextInt();}
		}
	}
		
		
	
	
	public static boolean bestimmeAlter(int alter){
		if(alter < 18){
			return false;}
			else{return true;}
	}

	
	
	public static int wuerfeln(){	
		
      double wert = Math.random();
      
      wert = wert*100;
   
      
      return (int)wert ;}
	
     public static void auswertung(){
    	 
    	 System.out.println("Würfel: "+wuerfel );
 		
 		abstand1=wuerfel-zahlPlayer1;
 		abstand2=wuerfel-zahlPlayer2;
 		
 		if(abstand1<0){abstand1 = abstand1*(-1);}
 		if(abstand2<0){abstand2 = abstand2*(-1);}
 		
 		System.out.println("Abstand Spieler1: "+abstand1);
 		System.out.println("Abstand Spieler2: "+abstand2);
 		
 		if(abstand1==abstand2){System.out.println("Gleichstand");}
 		else if(abstand1<abstand2){System.out.println("Sieg SpielerIn 1!");}
 		else {System.out.println("Sieg SpielerIn 2!");}
 		
 		
     }
    		  
    	  
      }
	



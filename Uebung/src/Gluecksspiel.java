import java.util.Scanner;

public class Gluecksspiel {

	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean geschlecht1 = true;
		boolean geschlecht2 = false;
		int alter1 = 19;
		int alter2 = 30;
		String name1 = "Susanne";
		String name2 = "Thomas";
		int zahlPlayer1; 
		int zahlPlayer2;
		int wuerfel = wuerfeln();
		int abstand1 = 0;
		int abstand2 = 0;
		
			
		if(alter1 < 18){
			System.out.println("Hallo "+ name1 +"!");
			System.out.println();
			System.out.println("Gib deine Zahl ein:");
			zahlPlayer1 = s.nextInt();
			
		}else if(!geschlecht1){
			System.out.println("Lieber Herr "+ name1 +"!");
			System.out.println("Geben Sie Ihre Zahl ein:");
			zahlPlayer1 = s.nextInt();
			
		}else{System.out.println("Liebe Frau "+ name1 +"!");
		  System.out.println("Geben Sie Ihre Zahl ein:");
			zahlPlayer1 = s.nextInt();}
		
		if(alter2 < 18){
			System.out.println("Hallo "+ name2 +"!");
			System.out.println();
			System.out.println("Gib deine Zahl ein:");
			zahlPlayer2 = s.nextInt();
			
		}else if(!geschlecht2){
			System.out.println("Lieber Herr "+ name2 +"!");
			System.out.println("Geben Sie Ihre Zahl zwischen 1 und 100 ein:");
			zahlPlayer2 = s.nextInt();
			
		}else{System.out.println("Liebe Frau "+ name2 +"!");
		  System.out.println("Geben Sie Ihre Zahl zwischen 1 und 100 ein:");
			zahlPlayer2 = s.nextInt();}
		
		System.out.println("Würfel: "+wuerfel );
		
		abstand1=wuerfel-zahlPlayer1;
		abstand2=wuerfel-zahlPlayer2;
		
		if(abstand1<0){abstand1 = abstand1*(-1);}
		if(abstand2<0){abstand2 = abstand2*(-1);}
		
		if(abstand1==abstand2){System.out.println("Gleichstand");}
		else if(abstand1<abstand2){System.out.println("Sieg SpielerIn 1!");}
		else {System.out.println("Sieg SpielerIn 2!");}
		
		
	}
		
		
	public static int wuerfeln(){	
		
      double wert = Math.random();
      
      wert = wert*100;
    
      return (int)wert ;}
	
     
    		  
    	  
      }
	



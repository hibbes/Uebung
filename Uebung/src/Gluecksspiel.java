import java.util.Scanner;

/**
 * Gluecksspiel (Game of Chance) - Interactive Game with Scanner Input
 * 
 * Demonstrates user interaction via Scanner input, random number generation,
 * and game loop logic. This is a gambling or chance-based game where users
 * make decisions based on random outcomes.
 * 
 * Game Loop Structure:
 * 1. Initialize game state (balance, rounds)
 * 2. While game continues:
 *    a. Display current state to user
 *    b. Get user input via Scanner
 *    c. Validate input
 *    d. Process game logic
 *    e. Generate random outcome
 *    f. Update state based on outcome
 *    g. Display result
 * 3. End game and show final statistics
 * 
 * Scanner Input Handling:
 * Scanner scanner = new Scanner(System.in);
 * String input = scanner.nextLine();
 * int number = scanner.nextInt();
 * 
 * Game Logic Elements:
 * - Randomness: Random class or Math.random()
 * - User choice: What to bet, what number to pick, etc.
 * - Probability: Calculate odds of winning
 * - Balance management: Track wins/losses
 * - Exit conditions: When game ends
 * 
 * Educational Focus:
 * - User I/O with Scanner class
 * - Input validation and error handling
 * - Game loop design
 * - Random number generation
 * - State management
 * - Probability concepts
 * 
 * Common Game Types:
 * - Dice rolling: Roll dice, guess outcome
 * - Number guessing: Pick number 1-100
 * - Coin flip: Heads/tails betting
 * - Roulette simulation: Betting on numbers
 */
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
	



/**
 * Kreditkarte (Credit Card) - Object-Oriented Programming Demonstration
 * 
 * This class demonstrates fundamental Object-Oriented Programming (OOP) concepts
 * by modeling a credit card entity with attributes, methods, and business logic.
 * 
 * OOP Concepts Demonstrated:
 * 
 * 1. ENCAPSULATION:
 *    - Private attributes (data hiding): balance, cardNumber, holder
 *    - Public methods (controlled access): getBalance(), charge(), pay()
 *    - Protects internal state from unauthorized modification
 * 
 * 2. ABSTRACTION:
 *    - User works with high-level concepts: "charge", "pay"
 *    - Internal implementation details hidden
 *    - Example: User doesn't need to know how transactions are verified
 * 
 * 3. STATE MANAGEMENT:
 *    - Maintains credit balance
 *    - Validates operations (e.g., insufficient credit)
 *    - Updates state consistently
 * 
 * 4. ATTRIBUTES (Data):
 *    - Card number, holder name, balance, credit limit
 *    - Represent the "state" of the credit card
 * 
 * 5. METHODS (Behavior):
 *    - Charge: Deduct from balance
 *    - Pay: Add to balance
 *    - Check: Verify sufficient credit
 * 
 * Typical Credit Card Operations:
 * - Charge: balance -= amount (if amount <= creditLimit)
 * - Pay: balance += amount (payment to card)
 * - Status: Check current balance and available credit
 * 
 * Educational Focus:
 * - Class design and responsibility
 * - Getter/setter methods for safe data access
 * - Business logic validation
 * - Real-world object modeling
 * - Data integrity and consistency
 */
public class Kreditkarte {

	private int geheimzahl;
	private String typ;
	private static double verfuegungsrahmen = 2000;
	
	
	public static void main(String args[]){
	  Kreditkarte karte1 = new Kreditkarte(815, "Visa");
	  
	  karte1.geheimzahlAnzeigen();
	  
	  karte1.verfuegungsrahmenAnzeigen();
	  System.out.println(karte1.getVerfuegungsrahmen());
	
	}

	public Kreditkarte(int geheimzahl, String typ){
	   this.geheimzahl=geheimzahl;
	   this.typ=typ;
	   
	}
	
	public void geheimzahlAnzeigen(){
		System.out.println(geheimzahl);
	}
	
	public void verfuegungsrahmenAnzeigen(){
		System.out.println(verfuegungsrahmen);
	}
	
	public double getVerfuegungsrahmen(){
		return verfuegungsrahmen;
	}
	
	public void setVerfuegungsrahmen(double verfuegungsrahmen){
		this.verfuegungsrahmen=verfuegungsrahmen;
	}
}

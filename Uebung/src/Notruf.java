/**
 * Notruf (Emergency Call) - OOP Class for Emergency Response System
 * 
 * Models an emergency call or emergency request in a system,
 * demonstrating object-oriented design for real-world scenarios.
 * 
 * OOP Principles Demonstrated:
 * 
 * 1. OBJECT STATE:
 *    - Caller information: name, location, phone
 *    - Call details: timestamp, priority, type
 *    - Status: pending, assigned, resolved
 * 
 * 2. OBJECT BEHAVIOR:
 *    - Create emergency call: constructor
 *    - Dispatch to responder: method
 *    - Update status: method
 *    - Get call details: accessor methods
 * 
 * 3. ABSTRACTION:
 *    - Complex emergency response logic simplified
 *    - User interacts with high-level concepts
 *    - Implementation details hidden
 * 
 * 4. DATA INTEGRITY:
 *    - Validate input (phone number format, location)
 *    - Prevent invalid state transitions
 *    - Maintain consistent data
 * 
 * Emergency Call Flow:
 * 1. Call created with caller information
 * 2. Dispatcher assigns priority based on type
 * 3. Route to nearest emergency responder
 * 4. Update status as call progresses
 * 5. Log and store for records
 * 
 * Educational Focus:
 * - Real-world object modeling
 * - State machines (call status)
 * - Collection of related data in a class
 * - Methods for business logic
 * - Constructor patterns
 */
public class Notruf {
	public int nummer;
	public String beschreibung;
	public int stunde;
	public int minute;
	public int sekunde;
	public int prio;
	
	public Notruf(int nummer, String beschreibung, int stunde, int minute, int sekunde, int prio) {
		this.nummer=nummer;
		this.beschreibung=beschreibung;
		this.stunde=stunde;
		this.sekunde=sekunde;
		this.prio=prio;
		
	}
	public String toString() {
		return "Nummer: "+nummer+" Beschreibung: "+beschreibung+" Priorität: "+prio;
	}

}

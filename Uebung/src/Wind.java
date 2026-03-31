/**
 * Wind - Physical Calculations and Formula Implementation
 * 
 * Demonstrates implementing mathematical and physical formulas in code.
 * Likely involves wind-related calculations such as:
 * - Wind speed conversions (mph, km/h, m/s, knots)
 * - Wind chill factor calculations
 * - Beaufort scale classifications
 * - Energy/force calculations from wind speed
 * 
 * Common Wind Formulas:
 * 
 * 1. Wind Chill (US/Canada formula):
 *    WC = 35.74 + 0.6215T - 35.75(V^0.16) + 0.4275T(V^0.16)
 *    Where T = temperature (°F), V = wind speed (mph)
 * 
 * 2. Wind Speed Conversions:
 *    - m/s to km/h: km/h = m/s * 3.6
 *    - km/h to mph: mph = km/h * 0.621371
 *    - m/s to knots: knots = m/s * 1.94384
 * 
 * 3. Beaufort Scale (wind speed classification):
 *    0: Calm (0 km/h)
 *    1-2: Light air (1-6 km/h)
 *    3-4: Gentle breeze (7-20 km/h)
 *    5-6: Moderate breeze (21-39 km/h)
 *    ... up to 12: Hurricane (119+ km/h)
 * 
 * 4. Wind Force/Energy:
 *    Force = 0.5 * air_density * velocity² * area
 *    Power = 0.5 * air_density * velocity³ * area
 * 
 * Educational Focus:
 * - Translating mathematical formulas to code
 * - Unit conversions and factors
 * - Floating-point arithmetic precision
 * - Classification and conditional logic
 * - Constants and magic numbers
 */
public class Wind {

	static double kmh = 20;
		
/*	public Wind(long kmh){
		this.kmh = kmh;
	} */
	
	public static void main(String[] args) {
		System.out.println(getKnots(kmh));
		System.out.println(getBeaufourt(kmh));
		System.out.println(getType(kmh));
	}
	
		
	public static double getKnots(double kmh){
		return (kmh*0.53995680345572354211663066954644);
	}
	
	public static double getBeaufourt(double kmh){
		return Math.round(Math.pow((kmh/3.6)/0.836,0.66666666666666));
	}
	
	public static String getType(double kmh){
		if(kmh<2){return "windstill";}
		else{
			if(kmh>120){return "Orkan";}
				else{return "Normalwind";}
		}
	
/*      Wind w1 = new Wind(20); 
      System.out.println("km/h: "+w1.getKmh());
      System.out.println("Bft: "+w1.getBeaufort());
      System.out.println("Knoten: "+w1.getKnots());
      System.out.println("Windart: "+w1.getType());
	}
	
	private long getBeaufort(){
		long beaufort = Math.round(Math.pow((kmh/3.6)/0.836,0.66666666666666));	//	 B = (v / 0,836 m/s )2/3
		if(beaufort>=12){
			return 12;
		}else{return beaufort;}
	}	
	private String getType(){
		if(kmh<2){return "windstill";}
		else{
			if(kmh>120){return "Orkan";}
				else{return "Normalwind";}
		}
	}
		
	private long getKmh(){
		return kmh;
	}
	
	private double getKnots(){
		return kmh*0.53995680345572354211663066954644;
	}
	*/
 }
}
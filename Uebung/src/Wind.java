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
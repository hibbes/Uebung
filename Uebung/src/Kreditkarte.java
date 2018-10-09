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

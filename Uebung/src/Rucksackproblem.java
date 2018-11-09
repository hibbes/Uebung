
public class Rucksackproblem {
	
	static int rVol =30;
	static int[] gVol = {5, 5, 6, 9, 6, 11, 12, 15, 17, 30};
	static int [] gWert = {7, 7, 6, 5, 10, 5, 14, 17, 20, 21};
	
	static int packen(int restVol, int i){
		if(i<gVol.length){
			// nicht einpacken
			int nicht = packen(restVol, i+1);
			
			// einpacken
			int drin = 0;
			if(restVol - gVol[i] >=0){
					 drin = gWert[i] + packen(restVol-gVol[i], i+1);
			}
			if(nicht>drin){
				return nicht;
			}else{return drin;}
		}
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int erg = packen(rVol, 0);
   System.out.println(erg);
	}

}

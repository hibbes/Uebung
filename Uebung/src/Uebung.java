
public class Uebung {

	public static void main(String[] args) {
		boolean[] zahlen = new boolean[160];   
		for (int i = 2; i<160; i++){
			if(zahlen[i]==false){
				System.out.println("Für "+i);
			  for(int j=i*2; j<160; j=j+i){
				
					zahlen[j]=true;
					System.out.print(j+"="+zahlen[j]+" ");
				}
				
			  }
			  System.out.println("");
			  
			}
		
		for (int i=0; i<160;i++){
			if(!zahlen[i]){
				System.out.print(i+" ");
			}
		}
		
	}
}

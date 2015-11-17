
public class Uebung {

	public static void main(String[] args) {
		int maxwert = 1024000;
		int ausgabeinc = 0;
		boolean[] zahlen = new boolean[maxwert];   
		for (int i = 2; i<zahlen.length; i++){
			if(zahlen[i]==false){
				for(int j=i*2; j<zahlen.length; j=j+i){
					zahlen[j]=true;
				}
			  }
			}
		for (int i=2; i<zahlen.length;i++){
			if(!zahlen[i]){
				System.out.print(i+" ");
				ausgabeinc++;
				if(ausgabeinc%10==0){System.out.println("");}
				
			}
		}
		
	}
}

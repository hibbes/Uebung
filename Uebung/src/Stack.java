public class Stack {

	static int number=117;

	
	public static void main(String[] args) {
		for(int i =0; i<=1000;i++){
			number=i;
			System.out.println("");
			System.out.print("n ="+number+": ");
		while(number>1){
		
			if(number%2==0){
			number=number/2;}
		else{number=(number*3)+1;}
		System.out.print(number +", ");	
		}
	}

	}
	
	
	public static boolean isPrime(int number){
		if(number<2){return false;}
		
		for(int i=2; i<number/2;i++){
		 			 
		 if(number%i==0){
			 System.out.println("Teiler:" +i);
			return false;
		 }
		}
		
		return true;
	}
	
}

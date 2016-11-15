
public class Arrays {

	static char [] array1 = new char[50];
	static int i = 0;
	static int j = 0;
	
	public static void main(String[] args) {

		
		
		push('!');
		push('d');
		push('l');
		push('r');
		push('o');
		push('W');
		push(' ');
		push('o');
		push('l');
		push('l');
		push('e');
		push('H');
		
		
				
		
		while(!empty()){
			System.out.print(pop());
		}
		
		}
	
	
		public static void push(char element){
			array1[i]=element;
			i++;
			j++;
		}
		
		public static char pop(){
			
			 
			char element =	array1[j-i];
			i--;
		
		return element;
		  }
		 
	    public static boolean empty(){
	    	if(i>0){return false;}
	    		else{  	
	    			return true;}
	    	
	    }
	
}	
		
		
		
		
		
		
		
		
		/*
	 * 	int[][] matrix = new int[3][3];
	 
		
		matrix[0][0]=1;
		matrix[0][1]=2;
		matrix[0][2]=3;
		matrix[1][0]=4;
		matrix[1][1]=5;
		matrix[1][2]=6;
		matrix[2][0]=7;
		matrix[2][1]=8;
		matrix[2][2]=9;
		
		for(int i = 0; i<matrix.length; i++){
			for(int j = 0; j<matrix[i].length; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}		
		
}

/*/

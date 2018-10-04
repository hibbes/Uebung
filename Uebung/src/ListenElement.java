
public class ListenElement {
	
	
	private int inhalt;
	private ListenElement next;
	
	
	
	public ListenElement (int inhalt){
		this.inhalt = inhalt;
	}
	
	public void add(ListenElement neu){
		 if(next==null){
			 next=neu;
		 }else{
			 next.add(neu);
		 }
	}
	
	 public int getGroesse(int anzahl){
		 int zahl = anzahl+1;
		 if(next!=null){
			return next.getGroesse(zahl);}
		 
		 return zahl;
			 
		 }
	 
	 public String toString(){
			if(next== null){
					return ""+inhalt;
				}else{
					return ""+inhalt+" "+next.toString();
				}
			}
	}
	
	


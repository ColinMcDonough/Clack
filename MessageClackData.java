package data;
import data.ClackData;

public class MessageClackData extends ClackData{
	
	
	//Creates userName and type 
	
	private String userName; 
	private String message;
	private int type;

	// Constructors
	public MessageClackData(String userName, String message, int type){
		super(userName, type);
		this.message = message;
		
		//
		
		
		
	}
	public MessageClackData(){
		super();
		
		
		//
		
		
		this.message = "Null";
		this.userName = "Anon";
		this.type = 0;
	}


	//returns
	public String getData() {
		return message;
	}
	
	
	
	
	@Override
	public int hashCode(){
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
		
	}
	@Override
	public String toString() {
		return message + " " + userName + " " + type;
		
	}
	
//	//main
//	public static void main(String []args){
//		
//	}
}
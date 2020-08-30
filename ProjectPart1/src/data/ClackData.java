package data;
import java.time.LocalDate;

public class ClackData {
	
	
	//Creates userName and type 
	
	private String userName; 
	private int type;

	// Constructors
	public ClackData(String userName,int type){
		this.userName = userName;
		this.type = type;
	}
	public ClackData(){
		this.userName = "Anon";
		this.type = 0;
	}
	public ClackData(int type){
		this.userName = "Anon";
		this.type = type;
	}

	//returns
	public String getUserName(){
		return userName;
	}
	public int getType(){
		return type;
	}
	public class Date {
		public LocalDate getDate(){
			
			return java.time.LocalDate.now();
		}	
	}
	//public abstract String getData();
	//Ask or Fix
	
	//main
	public static void main(String []args){
		
		ClackData data = new ClackData();
		
		System.out.println(data.getUserName());
		System.out.println(data.getType());
		//System.out.println(getDate());
	}
}
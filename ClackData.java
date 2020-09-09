package data;
import java.util.Date;


public abstract class ClackData {


	//Data types
	private String userName; 
	private int type;
	private Date date;
	
	public static final int CONSTANT_LISTUSERS = 0;
	public static final int CONSTANT_LOGOUT = 1;
	public static final int CONSTANT_SENDMESSAGE = 2;
	public static final int DEFAULT_PORT_NUMBER = 73;

	// Constructors
	public ClackData(String userName,int type){
		this.userName = userName;
		this.type = type;
		this.date = new Date();
	}
	
	public ClackData(int type){
		this.userName = "Anon";
		this.type = type;
		this.date = new Date();
	}
	
	public ClackData(){
		this.userName = "Anon";
		this.type = 0;
		this.date = new Date();
	}
	//return userName
	public String getUserName(){
		return userName;
	}
	//return type
	public int getType(){
		return type;
	}
	//return date
	public Date getDate(){
		return date;
	}
	//abstract method to return the message and fileContents
	public abstract String getData();
	
}
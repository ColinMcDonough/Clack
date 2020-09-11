package data;
import java.util.Date;

/**
 * Leading abstract class ClackData 
 * @author Matthew Frommeyer & Colin McDonough
 *
 */

public abstract class ClackData {


	/**
	 * Private data for userName, type and date.
	 */
	private String userName; 
	private int type;
	private Date date;
	
	/**
	 *  Public constants.
	 */
	public static final int CONSTANT_LISTUSERS = 0;
	public static final int CONSTANT_LOGOUT = 1;
	public static final int CONSTANT_SENDMESSAGE = 2;
	public static final int DEFAULT_PORT_NUMBER = 73;

	/**
	 *  Creates a new ClackData with a given userName and type.
	 *  @param userName
	 *  @param type
	 */
	public ClackData(String userName,int type){
		this.userName = userName;
		this.type = type;
		this.date = new Date();
	}
	
	/**
	 * Creates a new ClackData with a given type.
	 * @param type
	 */
	public ClackData(int type){
		this.userName = "Anon";
		this.type = type;
		this.date = new Date();
	}
	
	/**
	 * Creates a new ClackData with no given inputs. 
	 * Everything is set to the default values specified.
	 */
	public ClackData(){
		this.userName = "Anon";
		this.type = 0;
		this.date = new Date();
	}
	
	/**
	 * returns the objects userName.
	 * @return
	 */
	public String getUserName(){
		return userName;
	}
	
	/**
	 * returns the objects type value.
	 * @return
	 */
	public int getType(){
		return type;
	}
	
	/**
	 * returns the date.
	 * @return
	 */
	public Date getDate(){
		return date;
	}
	
	/**
	 * abstract method to return the message and fileContents
	 * @return
	 */
	
	public abstract String getData();
}
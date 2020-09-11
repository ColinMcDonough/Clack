package data;

/**
 * Class MessageClackData that extends ClackData
 * @author Matthew Frommeyer & Colin McDonough
 *
 */

public class MessageClackData extends ClackData{
	 
	/*
	 * Private Data type that holds the message
	 */
	private String message;

	/**
	 * Constructor that takes as input a userName, message and type
	 * @param userName
	 * @param message
	 * @param type
	 */
	public MessageClackData(String userName, String message, int type){
		super(userName, type);
		this.message = message;
	}
	/**
	 * Default constructor that sets the object to default values
	 */
	public MessageClackData(){
		super();
		this.message = null;
	}
	/**
	 * returns the message
	 */
	public String getData() {
		return message;
	}
	/**
	 * overrides the hashCode, equals and toString methods
	 */
	@Override
	/**
	 * overrides hashCode
	 */
	public int hashCode(){
		int result = 5;
		result = (7*result) + ((message == null) ? 1 : 0);
		result = (7*result) + ((getUserName() == "Anon") ? 1 : 0);
		result = (7*result) + getType();
		return result;
	}
	/**
	 * overrides equals
	 */
	public boolean equals(Object other) {
		MessageClackData otherMessageClackData = (MessageClackData)other;
		return this.message == otherMessageClackData.message &&
				this.getUserName() == otherMessageClackData.getUserName() &&
				this.getType() == otherMessageClackData.getType();
	}
	/**
	 * overrides toString
	 */
	public String toString() {
		return "The message is: " + this.message +  "\n" +
				"The userName is: " + this.getUserName() + "\n" +
				"The type is: " + this.getType() + "\n" +
				"The date is: " + this.getDate();
	}
}
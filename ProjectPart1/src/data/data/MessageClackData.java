package data;

public class MessageClackData extends ClackData{
	 
	//data types
	private String message;

	// Constructors
	public MessageClackData(String userName, String message, int type){
		super(userName, type);
		this.message = message;
	}
	
	public MessageClackData(){
		super();
		this.message = "Null";
	}
	
	public String getData() {
		return message;
	}
	
	@Override
	public int hashCode(){
		int result = 5;
		result = (7*result) + message.hashCode();
		return result;
	}
	
	public boolean equals(Object other) {
		MessageClackData otherMessageClackData = (MessageClackData)other;
		return this.message == otherMessageClackData.message;
	}
	
	public String toString() {
		return "The message is: " + this.message + "\n\n";
	}
}
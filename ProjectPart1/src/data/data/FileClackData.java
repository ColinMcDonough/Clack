package data;

/**
 * Subclass FileClackData extends class ClackData
 * @author Matthew Frommeyer + Colin Mcdonough
 *
 */
public class FileClackData extends ClackData{
	
	/**
	 * private data that stores the filename and the file contents respectivly.
	 */
	private String fileName;
	private String fileContents;
	
	/**
	 * Constructor that takes as input a userName, fileName and type. fileContents is set to null
	 * @param userName
	 * @param fileName
	 * @param type
	 */
	public FileClackData(String userName, String fileName, int type){
		
		super(userName, type);
		this.fileName = fileName;
		this.fileContents = null;
	}
	
	/**
	 * A default constructor that that sets the default values for the object
	 */
	public FileClackData() {
		super();
		this.fileName = null;
		this.fileContents = null;	
	}
	
	/**
	 * takes as argument a string and sets the fileName to the given input
	 * @param fileName
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	/**
	 * returns the fileName
	 * @return
	 */
	public String getFileName() {
		return fileName;
	}
	
	/*
	 * returns fileContents
	 * @return
	 */
	public String getData() {
		return fileContents;
	}
	
	/**
	 * doesn't do anything yet
	 */
	public void readFileContents() {
		
	}
	
	/**
	 * Doesn't do anything yet.
	 */
	public void writeFileContents() {
		
	}
	
	/**
	 * Override functions for hashCode, equals and toString
	 */
	@Override
	
	/**
	 * Overrides hashCode
	 */
	public int hashCode() {
		int result = 3;
		result = (5*result) + ((fileName == null) ? 1 : 0);
		result = (5*result) + ((fileContents == null) ? 1 : 0);
		result = (5*result) + ((getUserName() == "Anon") ? 1 : 0);
		result = (5*result) + getType();
		return result;
	}
	
	/**
	 * override equals
	 */
	public boolean equals(Object other) {
		FileClackData otherFileClackData = (FileClackData)other;
		return this.fileName == otherFileClackData.fileName &&
				this.fileContents == otherFileClackData.fileContents &&
				this.getUserName() == otherFileClackData.getUserName() &&
				this.getType() == otherFileClackData.getType();
	}
	/**
	 * overrides toString
	 */
	public String toString() {
		return "The fileName is: " + this.fileName + "\n" + 
				   "The fileContents is: " + this.fileContents + "\n" +
				   "The userName is: " + this.getUserName() + "\n" +
				   "The type is: " + this.getType() + "\n" +
				   "The date is: " + this.getDate();
	}
}

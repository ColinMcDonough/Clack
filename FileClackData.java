package data;

public class FileClackData extends ClackData{

	private String fileName;
	private String fileContents;
	
	FileClackData(String userName, String fileName, int type){
		
		super(userName, type);
		this.fileName = fileName;
		this.fileContents = null;
	}
	
	FileClackData() {
		super();
		this.fileName = null;
		this.fileContents = null;
		
	}
	//sets fileName
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	//returns fileName
	public String getFileName() {
		return fileName;
	}
	//returns fileContents
	public String getData() {
		return null;
	}
	//does nothing yet
	public void readFileContents() {
		
	}
	//does nothing yet
	public void writeFileContents() {
		
	}

	@Override
	//override hashcode
	public int hashCode() {
		int result = 3;
		result = (7*result) + fileName.hashCode();
		result = (7*result) + fileContents.hashCode();
		return result;
	}
	//override equals
	public boolean equals(Object other) {
		FileClackData otherFileClackData = (FileClackData)other;
		return this.fileName == otherFileClackData.fileName &&
				this.fileContents == otherFileClackData.fileContents;
	}
	//override toString
	public String toString() {
		return "The fileName is: " + this.fileName + "\n" + 
				   "The fileContents is: " + this.fileContents + "\n\n";
	}
	
}

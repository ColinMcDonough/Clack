package data;

import data.ClackData;

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
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void getData() {
		//return null;
	}
	
	public void readFileContents() {
		
	}
	
	public void writeFileContents() {
		
	}
	
	@Override
	
	public int hashCode() {
		return 0;
	}
	
	public boolean equals() {
		return true;
	}
	
	public String toString() {
		return "Test";
	}
	
}

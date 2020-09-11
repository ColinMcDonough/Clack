package main;

import data.ClackData;

public class ClackClient{
	// data types
	private String userName;
	private String hostName;
	private int port;
	private boolean closeConnection;
	private ClackData dataToSendToServer;
	private ClackData dataToRecieveFromServer;
	
	private static final int DEFAULT_PORT_NUMBER = 7000;
	
	//Constructors
	public ClackClient(String userName, String hostName, int port) {
		this.userName = userName;
		this.hostName = hostName;
		this.port = port;
		this.closeConnection = true;
		this.dataToSendToServer = null;
		this.dataToRecieveFromServer = null;
	}
	
	public ClackClient(String userName, String hostName) {
		this(userName, hostName, DEFAULT_PORT_NUMBER);
		this.closeConnection = true;
		this.dataToSendToServer = null;
		this.dataToRecieveFromServer = null;
	}
	
	public ClackClient(String userName) {
		this.userName = userName;
		this.hostName = "localhost";
		this.port = DEFAULT_PORT_NUMBER;
		this.closeConnection = true;
		this.dataToSendToServer = null;
		this.dataToRecieveFromServer = null;
	}
	
	public ClackClient() {
		this("Anon", "localhost", DEFAULT_PORT_NUMBER);
		this.closeConnection = true;
		this.dataToSendToServer = null;
		this.dataToRecieveFromServer = null;
		
	}
	//does nothing for now
	public void start() {
		
	}
	//does nothing for now
	public void readClientData() {
		
	}
	//does nothing for now
	public void sendData() {
		
	}
	//does nothing for now
	public void recieveData() {
		
	}
	//does nothing for now
	public void printData() {
		
	}
	//returns the userName
	public String getUserName() {
		return userName;
	}
	//returns the hostName
	public String getHostName() {
		return hostName;
	}
	//returns the port number
	public int getPort() {
		return port;
	}
	
	@Override
	
	public int hashCode() {
		int result = 3;
		result = (5*result) + ((userName == "Anon") ? 1 : 0);
		result = (5*result) + ((hostName == "localhost") ? 1 : 0);
		result = (5*result) + port;
		result = (5*result) + ((closeConnection == true) ? 1 : 0);
	    result = (5*result) + ((dataToSendToServer == null) ? 1 : dataToRecieveFromServer.hashCode());
	    result = (5*result) + ((dataToRecieveFromServer == null) ? 1 : dataToRecieveFromServer.hashCode());
		return result;
	}
	
	public boolean equals(Object other) {
		ClackClient otherClackClient = (ClackClient)other;
		return this.userName == otherClackClient.userName &&
				this.hostName == otherClackClient.hostName &&
				this.port == otherClackClient.port &&
				this.closeConnection == otherClackClient.closeConnection &&
				this.dataToSendToServer == otherClackClient.dataToSendToServer &&
				this.dataToRecieveFromServer == otherClackClient.dataToRecieveFromServer;
	}
	
	public String toString() {
		return "The userName is: " + this.userName + "\n" + 
				   "The hostName is: " + this.hostName + "\n" + 
				   "The port is: " + this.port + "\n" + 
				   "The closeConnection is: " + this.closeConnection + "\n" +
				   "The dataToSendToServer is: " + this.dataToSendToServer + "\n" + 
				   "The dataToRecieveFromServer is: " + this.dataToRecieveFromServer;
				   
	}
	
}

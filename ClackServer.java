package main;

import data.ClackData;

public class ClackServer{

	private int port;
	private boolean closeConnection;
	private ClackClient dataToRecieveFromClient;
	private ClackData dataToSendToClient;
	
	private static final int DEFAULT_PORT_NUMBER = 7000;
	
	//constructor with port provided as input
	public ClackServer(int port) {
		this.port = port;
		this.closeConnection = true;
		this.dataToRecieveFromClient = null;
		this.dataToSendToClient = null;
	}
	//basic constructor for default values
	public ClackServer() {
		this(DEFAULT_PORT_NUMBER);
		this.closeConnection = true;
		this.dataToRecieveFromClient = null;
		this.dataToSendToClient = null;
	}
	//doesnt do anything yet
	public void start() {
		
	}
	//doesnt do anything yet
	public void receiveData() {
		
	}
	//doesnt do anything yet
	public void sendData() {
		
	}
	//return port number	
	public int getPort() {
		return port;
	}
	
	@Override
	//overwrite hashcode
	public int hashCode() {
		int result = 5;
		result = (7*result) + port;
		result = (7*result) + (closeConnection ? 1 : 0);
		result = (7*result) + ((dataToRecieveFromClient == null) ? 0 : dataToRecieveFromClient.hashCode());
		result = (7*result) + ((dataToSendToClient == null) ? 0 : dataToSendToClient.hashCode());
		return result;
	}
	//overwrite equals 
	public boolean equals(Object other) {
		ClackServer otherClackServer = (ClackServer)other;
		return this.port == otherClackServer.port &&
		 this.closeConnection == otherClackServer.closeConnection &&
		 this.dataToRecieveFromClient == otherClackServer.dataToRecieveFromClient &&
		 this.dataToSendToClient == otherClackServer.dataToSendToClient;
			
	}
	//overwrites toString
	public String toString() {
		return "The port number is: " + this.port + "\n" + 
			   "The closeConnection is: " + this.closeConnection + "\n" + 
			   "The dataToRecieveFromClient is: " + this.dataToRecieveFromClient + "\n" + 
			   "The dataToSendToClient is: " + this.dataToSendToClient + "\n\n";
	}
	
}

package main;

import data.ClackData;
/**
 * Creates a Server class with data 
 * @author Matthew Frommeyer & Colin McDonough
 * 
 *
 */
public class ClackServer{
	/** private data for port, closeConnection, dataToReceiveFromClient,
	 * dataToSendToClient and DEFAULT_PORT_NUMBER
	 * 
	 * 
	 */
	private int port;
	private boolean closeConnection;
	private ClackClient dataToRecieveFromClient;
	private ClackData dataToSendToClient;
	
	private static final int DEFAULT_PORT_NUMBER = 7000;
	
	//constructor with port provided as input
	/**
	 * Creates ClackServer with given port
	 * @param port
	 */
	public ClackServer(int port) {
		this.port = port;
		this.closeConnection = true;
		this.dataToRecieveFromClient = null;
		this.dataToSendToClient = null;
	}
	//basic constructor for default values
	/**
	 * Creates ClackServer without a port
	 */
	public ClackServer() {
		this(DEFAULT_PORT_NUMBER);
		this.closeConnection = true;
		this.dataToRecieveFromClient = null;
		this.dataToSendToClient = null;
	}
	/**
	 * Next 3 methods do nothing at the moment
	 */
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
	/**
	 * returns port number
	 * @return
	 */
	public int getPort() {
		return port;
	}
	
	@Override
	//override hashcode
	/**
	 * Overrides hashcode
	 */
	public int hashCode() {
		int result = 5;
		result = (7*result) + port;
		result = (7*result) + (closeConnection ? 1 : 0);
		result = (7*result) + ((dataToRecieveFromClient == null) ? 0 : dataToRecieveFromClient.hashCode());
		result = (7*result) + ((dataToSendToClient == null) ? 0 : dataToSendToClient.hashCode());
		return result;
	}
	//override equals
	/**
	 * Overrides equals
	 */
	public boolean equals(Object other) {
		ClackServer otherClackServer = (ClackServer)other;
		return this.port == otherClackServer.port &&
		 this.closeConnection == otherClackServer.closeConnection &&
		 this.dataToRecieveFromClient == otherClackServer.dataToRecieveFromClient &&
		 this.dataToSendToClient == otherClackServer.dataToSendToClient;
			
	}
	//overrides toString
	/**
	 * Overrides toString
	 */
	public String toString() {
		return "The port number is: " + this.port + "\n" + 
			   "The closeConnection is: " + this.closeConnection + "\n" + 
			   "The dataToRecieveFromClient is: " + this.dataToRecieveFromClient + "\n" + 
			   "The dataToSendToClient is: " + this.dataToSendToClient + "\n\n";
	}
	
}

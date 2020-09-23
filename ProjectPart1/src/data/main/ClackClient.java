package main;

import data.ClackData;
import data.MessageClackData;

import java.util.Scanner;

import data.ClackData;
/**
 * Creates a client class with data 
 * @author Matthew Frommeyer & Colin McDonough
 * 
 *
 */
public class ClackClient{
	// data types
	/**
	 * Private data for username, hostname, port, closeConnection
	 * dataToSendToServer, dataToReceiveFromServer and DEFAULT_PORT_NUMBER
	 */
	private String userName;
	private String hostName;
	private int port;
	private boolean closeConnection;
	private ClackData dataToSendToServer;
	private ClackData dataToRecieveFromServer;
	
	private static final int DEFAULT_PORT_NUMBER = 7000;
	
	//Constructors
	/**
	 * creates new client with given userName, hostName and port
	 * @param userName
	 * @param hostName
	 * @param port
	 */
	public ClackClient(String userName, String hostName, int port) {
		this.userName = userName;
		this.hostName = hostName;
		this.port = port;
		this.closeConnection = true;
		this.dataToSendToServer = null;
		this.dataToRecieveFromServer = null;
	}
	/**
	 * creates new client with given userName and hostName
	 * @param userName
	 * @param hostName
	 * 
	 */
	public ClackClient(String userName, String hostName) {
		this(userName, hostName, DEFAULT_PORT_NUMBER);
		this.closeConnection = true;
		this.dataToSendToServer = null;
		this.dataToRecieveFromServer = null;
	}
	/**
	 * creates new client with given userName
	 * @param userName
	 * 
	 */
	public ClackClient(String userName) {
		this.userName = userName;
		this.hostName = "localhost";
		this.port = DEFAULT_PORT_NUMBER;
		this.closeConnection = true;
		this.dataToSendToServer = null;
		this.dataToRecieveFromServer = null;
	}
	/**
	 * creates new client with no given values
	 * 
	 */
	public ClackClient() {
		this("Anon", "localhost", DEFAULT_PORT_NUMBER);
		this.closeConnection = true;
		this.dataToSendToServer = null;
		this.dataToRecieveFromServer = null;
		
	}
	/**
	 * Following 5 methods do nothing for now
	 * 
	 */
	//does nothing for now
	public void start() {
		Scanner inFromStd = new Scanner(System.in);
	}
	//does nothing for now
	public void readClientData() {
		 String input = "";
		 if(input == "DONE") {
			 //close the connection
		 }else if(input == "SENDFILE") {
			 // send file
		 }else if(input == "LISTUSERS") {
			 //do nothing for now
		 }else {
			 //MessageClackData dataToSendToServer = new MessageClackData(2);
		 }
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
	/**
	 *  returns the userName string
	 * @return
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 *  returns the hostName string
	 * @return
	 */
	public String getHostName() {
		return hostName;
	}
	/**
	 *  returns the port number
	 * @return
	 */
	public int getPort() {
		return port;
	}
	
	@Override
	/**
	 * Overrides hashCode
	 */
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
	/**
	 * Overrides equals
	 */
	public boolean equals(Object other) {
		ClackClient otherClackClient = (ClackClient)other;
		return this.userName == otherClackClient.userName &&
				this.hostName == otherClackClient.hostName &&
				this.port == otherClackClient.port &&
				this.closeConnection == otherClackClient.closeConnection &&
				this.dataToSendToServer == otherClackClient.dataToSendToServer &&
				this.dataToRecieveFromServer == otherClackClient.dataToRecieveFromServer;
	}
	/**
	 * Overrides toString
	 */
	public String toString() {
		return "The userName is: " + this.userName + "\n" + 
				   "The hostName is: " + this.hostName + "\n" + 
				   "The port is: " + this.port + "\n" + 
				   "The closeConnection is: " + this.closeConnection + "\n" +
				   "The dataToSendToServer is: " + this.dataToSendToServer + "\n" + 
				   "The dataToRecieveFromServer is: " + this.dataToRecieveFromServer;
				   
	}
	
}
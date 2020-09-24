package main;
import data.ClackData;
import data.FileClackData;
import data.MessageClackData;

import java.io.IOException;
import java.util.Scanner;
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
	static Scanner inFromStd = new Scanner(System.in);
	
	
	private static final int DEFAULT_PORT_NUMBER = 7000;
	public static final int CONSTANT_SENDMESSAGE = 2;
	private static final int CONSTANT_SENDFILE = 3;
	private static final String KEY = "TIME";
	
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
		readClientData();
		printData();
	}
	//does nothing for now
	public void readClientData() {
		while (inFromStd.hasNext()) {
			 String input = inFromStd.nextLine();
			 if(input.equals("DONE")) {
				 break;
			 }else if(input.equals("SENDFILE")) {
				 inFromStd.useDelimiter("SENDFILE");
				 FileClackData dataToSendToServer = new FileClackData("userName", input, CONSTANT_SENDFILE);
				 try {
					((FileClackData) dataToSendToServer).readFileContents();
				} catch (IOException e) {
					System.err.println("File could not be read because I hate you");
					dataToSendToServer = new FileClackData();
				}
			 }else if(input.equals("LISTUSERS")) {
				 //do nothing for now
			 }else {
				// String einput = encrypt(input,KEY);
				 MessageClackData dataToSendToServer = new MessageClackData("userName", input, CONSTANT_SENDMESSAGE);
				 MessageClackData dataToRecieveFromServer = new MessageClackData("userName", input, CONSTANT_SENDMESSAGE);
				 System.out.println(dataToSendToServer);
				 System.out.println();
			 } 
		 }
		inFromStd.close();
	}
		 
	
	public void printData() {
		//System.out.println(dataToRecieveFromServer);
	}
	//does nothing for now
	public void sendData() {
		
	}
	//does nothing for now
	public void recieveData() {
		
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
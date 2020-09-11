package test;

import main.ClackClient;
/**
 * Tests the client class 
 * @author Matthew Frommeyer & Colin McDonough
 * 
 *
 */
public class TestClackClient {
	
public static void main(String[] args) {
		
	    System.out.println("These are the test for the four constructors. \n");
	    
	    System.out.println("This tests ClackClient(userName, hostName, port), each of the get methods and hashCode().");
		//test constructor(userName, hostName, port)
	    /**
	     * Creates clackclient1 given a username, hostname and port
	     * then prints out all the information using get methods
	     */
		ClackClient clackclient1 = new ClackClient("Lombax49", "Matt", 80);
		System.out.println("This is clackclient1");
		System.out.println(clackclient1);
		System.out.println("clackclient1's userName is: " + clackclient1.getUserName());
		System.out.println("clackclient1's hostName is: " + clackclient1.getHostName());
		System.out.println("clackclient1's port number is: " + clackclient1.getPort());
		System.out.println("clackclient1's hash code is: " + clackclient1.hashCode());
		
		System.out.println();
		
		System.out.println("This tests ClackClient(userName, hostName) and the get methods and hashCode().");
		//test second constructor(userName, hostName)
		 /**
	     * Creates clackclient2 given a username and hostname
	     * then prints out all the information using get methods
	     */
		ClackClient clackclient2 = new ClackClient("Lombax49", "Matt");
		System.out.println("This is clackclient2");
		System.out.println(clackclient2);
		System.out.println("clackclient2's userName is: " + clackclient2.getUserName());
		System.out.println("clackclient2's hostName is: " + clackclient2.getHostName());
		System.out.println("clackclient2's port number is: " + clackclient2.getPort());
		System.out.println("clackclient2's hash code is: " + clackclient2.hashCode());
		
		System.out.println();
		
		//test third constructor (userName)
		System.out.println("This tests ClackClient(userName) and the get methods and hashCode().");
		/**
	     * Creates clackclient3 given a username
	     * then prints out all the information using get methods
	     */
		ClackClient clackclient3 = new ClackClient("Lombax49");
		System.out.println("This is clackclient3");
		System.out.println(clackclient3);
		System.out.println("clackclient3's userName is: " + clackclient3.getUserName());
		System.out.println("clackclient3's hostName is: " + clackclient3.getHostName());
		System.out.println("clackclient3's port number is: " + clackclient3.getPort());
		System.out.println("clackclient3's hash code is: " + clackclient3.hashCode());
		
		System.out.println();
		
		//tests the 4th constructor
		System.out.println("This tests ClackClient() and the get methods and hashCode().");
		ClackClient clackclient4 = new ClackClient();
		/**
	     * Creates clackclient4 given no arguements
	     * then prints out all the information using get methods
	     */
		System.out.println("This is clackclient4");
		System.out.println(clackclient4);
		System.out.println("clackclient4's userName is: " + clackclient4.getUserName());
		System.out.println("clackclient4's hostName is: " + clackclient4.getHostName());
		System.out.println("clackclient4's port number is: " + clackclient4.getPort());
		System.out.println("clackclient4's hash code is: " + clackclient4.hashCode());
		
		System.out.println();
		
		//create new objects to test equals
		/**
		 * Creates new clients to test equals 
		 * all of which are testing the different constructors
		 */
		ClackClient clackclient5 = new ClackClient("Lombax49", "Matt", 80);
		ClackClient clackclient6 = new ClackClient("Lombax49", "Matt");
		ClackClient clackclient7 = new ClackClient("Lombax49");
		ClackClient clackclient8 = new ClackClient();
		
		//tests equals for all constructors
		/**
		 * Tests all the constructors 
		 */
		System.out.println("Test if clackclient1 is the same as clackclient5.");
		
		if(clackclient1.equals(clackclient5)) {
			System.out.println("They are the same!");
			}else {
				System.out.println("They are not the same!");
			}
		
		System.out.println("Test if clackclient2 is the same as clackclient6.");
		if(clackclient2.equals(clackclient6)) {
			System.out.println("They are the same!");
			}else {
				System.out.println("They are not the same!");
			}
		
		System.out.println("Test if clackclient3 is the same as clackclient7.");
		if(clackclient3.equals(clackclient7)) {
			System.out.println("They are the same!");
			}else {
				System.out.println("They are not the same!");
			}
		
		System.out.println("Test if clackclient4 is the same as clackclient8.");
		if(clackclient4.equals(clackclient8)) {
			System.out.println("They are the same!");
			}else {
				System.out.println("They are not the same!");
			}
		
		System.out.println("Test if clackclient1 is the same as clackclient8.");
		if(clackclient1.equals(clackclient8)) {
			System.out.println("They are the same!");
			}else {
				System.out.println("They are not the same!");
			}
		
		System.out.println();
		/**
		 * Tests what happens if you give a negative port number
		 * 
		 */
		//test what happens when I give a negaive port number
		System.out.println("See what happens when I give a negative port number. ");
		ClackClient clackclient9 = new ClackClient("Lombax49", "Matt", -80);
		System.out.println("This is clackclient9");
		System.out.println(clackclient9);
		System.out.println("clackclient9's userName is: " + clackclient9.getUserName());
		System.out.println("clackclient9's hostName is: " + clackclient9.getHostName());
		System.out.println("clackclient9's port number is: " + clackclient9.getPort());
		System.out.println("clackclient9's hash code is: " + clackclient9.hashCode());
		
		System.out.println();
		/**
		 * Tests what happens if you give a negative port and a null username
		 */
		//test what happens when I give a negaive port number and null username
		System.out.println("See what happens when I give a null username and hostName");
		ClackClient clackclient10 = new ClackClient(null, null, 80);
		System.out.println("This is clackclient10");
		System.out.println(clackclient10);
		System.out.println("clackclient10's userName is: " + clackclient10.getUserName());
		System.out.println("clackclient10's hostName is: " + clackclient10.getHostName());
		System.out.println("clackclient10's port number is: " + clackclient10.getPort());
		System.out.println("clackclient10's hash code is: " + clackclient10.hashCode());
		
	}
}

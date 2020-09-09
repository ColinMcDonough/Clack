package test;

import main.ClackClient;

public class TestClackClient {
	
public static void main(String[] args) {
	
	    System.out.println("These are the test for the four constructors. \n");
	    
	    System.out.println("This tests ClackClient(userName, hostName, port), each of the get methods and hashCode().");
		//test constructor(userName, hostName, port)
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
		System.out.println("This is clackclient4");
		System.out.println(clackclient4);
		System.out.println("clackclient4's userName is: " + clackclient4.getUserName());
		System.out.println("clackclient4's hostName is: " + clackclient4.getHostName());
		System.out.println("clackclient4's port number is: " + clackclient4.getPort());
		System.out.println("clackclient4's hash code is: " + clackclient4.hashCode());
		
		System.out.println();
		
		//create new objects to test equals
		ClackClient clackclient5 = new ClackClient("Lombax49", "Matt", 80);
		ClackClient clackclient6 = new ClackClient("Lombax49", "Matt");
		ClackClient clackclient7 = new ClackClient("Lombax49");
		ClackClient clackclient8 = new ClackClient();
		
		//tests equals for all constructors
		
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
		
	}

}

package test;

import main.ClackServer;
/**
 * Tests the server class 
 * @author Matthew Frommeyer & Colin McDonough
 * 
 *
 */
public class TestClackServer {	
	public static void main(String[] args) {
		/**
		 * Takes a port in and outputs all the saved data 
		 */
		//test constructor(port)
		ClackServer clackserver1 = new ClackServer(80);
		System.out.println("ClackServer1:");
		System.out.println(clackserver1);
		System.out.print("Port: ");
		System.out.println(clackserver1.getPort());
		System.out.print("HashCode: ");
		System.out.println(clackserver1.hashCode());
		System.out.print("ToString: ");
		System.out.println(clackserver1.toString());
		
		/**
		 * Takes in nothing and then outputs all the default data from the constructor
		 */
		//test second constructor()
		ClackServer clackserver2 = new ClackServer();
		System.out.println("ClackServer2:");
		System.out.println(clackserver2);
		System.out.print("Port: ");
		System.out.println(clackserver2.getPort());
		System.out.print("HashCode: ");
		System.out.println(clackserver2.hashCode());
		System.out.print("ToString: ");
		System.out.println(clackserver2.toString());
		//tests equals and hashCode()
		/**
		 * Calls equal to see if clackserver1 is equal to clackserver2
		 * 
		 */
		if(clackserver1.equals(clackserver2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println("They are not equal!");
		}
	
	}
	
}

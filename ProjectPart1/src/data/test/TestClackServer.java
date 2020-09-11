package test;

import main.ClackServer;

public class TestClackServer {	
	public static void main(String[] args) {
		
		//test constructor(port)
		ClackServer clackserver1 = new ClackServer(80);
		System.out.println(clackserver1);
		
		//test second constructor()
		ClackServer clackserver2 = new ClackServer();
		System.out.println(clackserver2);
		
		//tests equals and hashCode()
		if(clackserver1.equals(clackserver2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println("They are not equal!");
		}
	
	}
	
}

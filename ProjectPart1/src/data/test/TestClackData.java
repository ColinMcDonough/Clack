package test;

import java.io.IOException;

import data.ClackData;
import data.ClackData.*;
import data.FileClackData;
import data.MessageClackData;
/**
 * Test class for the ClackData class
 * @author Matthew Frommeyer + Colin Mcdonough
 *
 */
public class TestClackData {
	
	public static void main(String[] args) throws IOException {
		/**
		 * Creates a message with a username, message, and type
		 * then outputs the data
		 */
		ClackData mclackdata1 = new MessageClackData("Matt","Hello this is a test!", "DATE", 2);
		System.out.println("This is mclackdata1.");
		System.out.println(mclackdata1);
		System.out.println(mclackdata1.hashCode());
		System.out.println(mclackdata1.getData());
		System.out.println(mclackdata1.getData("DATE"));
		
		System.out.println();
		/**
		 * Creates a message with no given arguments
		 * then outputs the data
		 */
		ClackData mclackdata2 = new MessageClackData();
		System.out.println("This is mclackdata2.");
		System.out.println(mclackdata2);
		System.out.println(mclackdata2.hashCode());
		
		System.out.println();
		/**
		 * Creates a message with no given arguments
		 * then outputs the data
		 */
		ClackData mclackdata3 = new MessageClackData();
		System.out.println("This is mclackdata3.");
		System.out.println(mclackdata3);
		System.out.println(mclackdata3.hashCode());
		//readFileContents();
		System.out.println();
		
		System.out.println("Test if mclackdata2 is the same as mclackdata3");
		/**
		 * Tests to see if they are equal given both are created using default constructors
		 */
		if(mclackdata2.equals(mclackdata3)) {
			System.out.println("They are the same!");
		}else {
			System.out.println("They are not the same!");
		}
		
		System.out.println();
		
		System.out.println("Testing if mclackdata1 is the same as mclackdata2.");
		/**
		 * Tests to see if mclackdata1 is equal to mclackdata2 
		 */
		if(mclackdata1.equals(mclackdata2)) {
			System.out.println("They are the same!");
		}else {
			System.out.println("They are not the same!");
		}
		
		System.out.println();
		/**
		 *  Tests getdata 
		 */
		System.out.println("Test getData function on mclackdata1");
		//test getData
		System.out.println("getData() returns: " + mclackdata1.getData());
		
		System.out.println();
		/**
		 * Tests FileClackData with two using default constructors and the other one using the given arguments
		 */
		//test fileClackData
		ClackData fclackdata1 = new FileClackData("Matt", "Test2.txt", 2);
		System.out.println("This is fclackdata1.");
		System.out.println(fclackdata1);
		System.out.println(fclackdata1.hashCode());
	
		((FileClackData) fclackdata1).readFileContents();
		
		System.out.println("The fileContents are: " +fclackdata1.getData());
		
		((FileClackData) fclackdata1).readFileContents("TIME");
		
		//((FileClackData) fclackdata1).writeFileContents();
		
		((FileClackData) fclackdata1).writeFileContents("TIME");
		
		
		System.out.println();
		
		ClackData fclackdata2 = new FileClackData();
		System.out.println("This is fclackdata2.");
		System.out.println(fclackdata2);
		System.out.println(fclackdata2.hashCode());
		
		System.out.println();
		
		ClackData fclackdata3 = new FileClackData();
		System.out.println("This is fclackdata3.");
		System.out.println(fclackdata3);
		System.out.println(fclackdata3.hashCode());
		
		System.out.println();
		
		System.out.println("Test if fclackdata2 is the same as fclackdata3");
		/**
		 * Checks to see if both made with defaults are the same
		 */
		if(fclackdata2.equals(fclackdata3)) {
			System.out.println("They are the same!");
		}else {
			System.out.println("They are not the same!");
		}
		
		System.out.println();
		/**
		 * Renames fclackdata2's filename then checks if they are still the same as fclackdata3
		 */
		System.out.println("Renaming fclackdata2's fileName to hello.txt.");
		((FileClackData) fclackdata2).setFileName("hello.txt");
		System.out.println("fclackdata2's new fileName is: " + ((FileClackData) fclackdata2).getFileName());
		
		System.out.println();
		
		System.out.println("Testing if fclackdata2 is the same as fclackdata3 after the change.");
		
		if(fclackdata2.equals(fclackdata3)) {
			System.out.println("They are the same!");
		}else {
			System.out.println("They are not the same!");
		}
		
		System.out.println();
		/**
		 * Tests get data on fclackdata1
		 */
		System.out.println("Test getData function on fclackdata1");
		//test getData
		System.out.println("getData() returns: " + fclackdata1.getData());
		System.out.println("getData(key) " +fclackdata1.getData("TIME"));
	}

}
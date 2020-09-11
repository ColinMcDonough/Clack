package test;

import data.ClackData;
import data.FileClackData;
import data.MessageClackData;
/**
 * Test class for the ClackData class
 * @author Matthew Frommeyer & Colin Mcdonough
 *
 */
public class TestClackData {
	
	public static void main(String[] args) {
		
		ClackData mclackdata1 = new MessageClackData("Matt", "hello", 2);
		System.out.println("This is mclackdata1.");
		System.out.println(mclackdata1);
		System.out.println(mclackdata1.hashCode());
		
		System.out.println();
		
		ClackData mclackdata2 = new MessageClackData();
		System.out.println("This is mclackdata2.");
		System.out.println(mclackdata2);
		System.out.println(mclackdata2.hashCode());
		
		System.out.println();
		
		ClackData mclackdata3 = new MessageClackData();
		System.out.println("This is mclackdata3.");
		System.out.println(mclackdata3);
		System.out.println(mclackdata3.hashCode());
		
		System.out.println();
		
		System.out.println("Test if mclackdata2 is the same as mclackdata3");
		
		if(mclackdata2.equals(mclackdata3)) {
			System.out.println("They are the same!");
		}else {
			System.out.println("They are not the same!");
		}
		
		System.out.println();
		
		System.out.println("Testing if mclackdata1 is the same as mclackdata2.");
		
		if(mclackdata1.equals(mclackdata2)) {
			System.out.println("They are the same!");
		}else {
			System.out.println("They are not the same!");
		}
		
		System.out.println();
		
		System.out.println("Test getData function on mclackdata1");
		//test getData
		System.out.println("getData() returns: " + mclackdata1.getData());
		
		System.out.println();
		
		//test fileClackData
		ClackData fclackdata1 = new FileClackData("Matt", "hello.txt", 2);
		System.out.println("This is fclackdata1.");
		System.out.println(fclackdata1);
		System.out.println(fclackdata1.hashCode());
		
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
		
		if(fclackdata2.equals(fclackdata3)) {
			System.out.println("They are the same!");
		}else {
			System.out.println("They are not the same!");
		}
		
		System.out.println();
		
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
		
		System.out.println("Test getData function on fclackdata1");
		//test getData
		System.out.println("getData() returns: " + fclackdata1.getData());
	}

}

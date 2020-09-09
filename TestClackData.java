package test;

import data.ClackData;
import data.MessageClackData;

public class TestClackData {
	
	public static void main(String[] args) {
		
		ClackData mclackdata1 = new MessageClackData("Matt", "hello", 2020);
		System.out.println(mclackdata1);
		mclackdata1.getData();
		
		System.out.println(mclackdata1.hashCode());
		
		
	}

}

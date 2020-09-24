package test;

import java.io.IOException;
import java.util.Scanner;

import main.ClackClient;
import data.ClackData;
import data.FileClackData;
import data.MessageClackData;

public class TestFileClackData2 {
	
	private static final int DEFAULT_PORT_NUMBER = 7000;
	public static final int CONSTANT_SENDMESSAGE = 2;
	private static final int CONSTANT_SENDFILE = 3;
	private static final String KEY = "TIME";
	Scanner inFromStd = new Scanner(System.in);
	
	public static void main(String[] args)  {
		
		ClackClient.start();
	}
	
	
}

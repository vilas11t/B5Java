package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionPractice {
	
	static public File f;
	static public Scanner sc;
	
	public static void main(String[] args) throws FileNotFoundException {
		readFile();
	}
	
	
	
	static void readFile() throws FileNotFoundException {
		f=new File("C:\\Users\\Vilas\\DemoWorkSpace-5\\B5Java\\demo.txt");
		sc=new Scanner(f);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
	}

}

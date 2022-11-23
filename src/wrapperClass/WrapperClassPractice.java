package wrapperClass;

public class WrapperClassPractice {
	
	
	/*
	 1. string to int
	 2. int to string
	 3. char to int
	 4. int to char
	 */
	
	
   // HW- Write a program to print sun of digits in string.
	// ex String s=12Hello54   Output=12
	
	
	public static void main(String[] args) {
		StrintToInt();
		intToString();
		charToInt();
		intToChar();
	}
	
	//1. string to int
	static void StrintToInt() {
		
		String str="450";
		Integer i=Integer.parseInt(str);
		int d=i+i;
		System.out.println(d); // 900
		
		System.out.println(str+str); // 450450
		
	}
	
	
	// 2. int to string

	static void intToString() {
		Integer d=6890;
		String str=d.toString();
		
		System.out.println(str+str);
	}
	
	
	// 3. char to int
	static void charToInt() {
		char a='1'; 
		int d=Character.getNumericValue(a);
		System.out.println(d);
	}
	
	// int to char
	
	static void intToChar() {
		int a=5; // 0 to 9
		Character c=(char)(a+'0'); 
		System.out.println(c);
		
		// Ascii value of 0 is 48 (5+48=53 ~ 5)
	}
	
	
}

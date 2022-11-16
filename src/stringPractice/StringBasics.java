package stringPractice;

final public class StringBasics {

	/*
	 String:-  Sequence of chars 
	   ex-  Hello, 123Hello, #12School, Hi Hello.
	 
	 String is Class in Java.lang
	 String is final class
	 
	 Declaration;
	    1. String str1=new String("Hello");
	         : String will store in heap memory. 
	         : Separate memory will be allocated to each string.
	    
	    2. String str2="School"
	       :String will store in SCP(String constant pool)
	       :Separate memory will not be allocated to duplicate string.
	      String str3=Hello;
	      String str4="How are you";
	      String str5="Hello"
	    
	  String is immutable class
	    Once string is created it can not modified.
	    
	  StringBuffer and StringBuilder. 
	 
	 */
	
	public static void main(String[] args) {
		String str1="Hello";
		String str2="How are you";
		
		
		System.out.println(str1+" "+str2);
		
		System.out.println(str1.charAt(4));
		System.out.println(str1.concat("Kedar")); // HelloKedar
		
		System.out.println(str1);
		
		System.out.println(str1.concat(str2)); // HelloHow Are You
		
		System.out.println(str1.contains("He")); // true
		
		System.out.println(str1.equals(str2)); // false
		
		String[] strArray=str2.split(",");
		
		System.out.println(strArray[0]); //How 
		System.out.println(strArray[1]); // are
		

		
	}
	
	
}

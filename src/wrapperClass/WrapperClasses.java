package wrapperClass;

public class WrapperClasses {
	/*
	 8 primitive datatypes- byte , short, int, long, float, double, char, boolean.
	 
	 we have 8 wrapper classes in java to represent all primitive data types into object
	 
	 1. Byte
	 2. Short
	 3. Integer
	 4. Long
	 5. Character
	 6. FLoat
	 7. Double
	 8. Boolean
	 
	 Auto boxing- Converting primitive data type into Object
	 
	 Unboxing- Object into Primitive Data type
	 
	 */
	
	public static void main(String[] args) {
		int a=30;
		Integer c=Integer.valueOf(a);
		System.out.println(c); // c is object of Integer Class
		
		
		Integer i=50;
		Integer x=new Integer(40);
		
		int z=x;
		System.out.println(z);
		
	}

}

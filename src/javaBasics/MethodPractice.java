package javaBasics;

public class MethodPractice {
	
	/*
	 Method - It is a collection of code / block of code that performs a specific task.
	 
	 1. Method declaration / method defination
	 2. Method Body
	 3. Method calling
	 
	 
	  1. Method declaration / method defination
	    
	      access_modifier  Method_Keywords return_type_of_method  method_Name(dataTyep par1, DataType par2, ....., dataType Parn)
	      
	      access_modifier- public, default, private, protected (Optional)
	      Method Keywords- static, abstract, final etc (Optional)
	      return_type_of_method- data type that method return, if method return nothing then it should be void (compulsory)
	      method_Name- any relevant name for which method is written (compulsory) (method name always start with small letter) factrialOfNumber()
	      Parameters / Arguments- list of variables with data type ((Optional))
	      
	  2. Method Body
	  	
	  	 it is a code of method / group of statements.
	  	 
	  3. Method calling
	      to execute method, we call the method.
	      
	      method_Name(Parameters values);
	       
	 
	 
	 Types 
	 1. inbuilt methods
	 2. user defined methods
	 
	 
	 
	 
	 Combinations w r. t. return type and parameters
	 
	 1. method with return type and no parameters int additionOfTwoNumbers() 
	 2. method with return type and with parameters - int additionOfTwoNumbers(int a, int b), int +int =int
	 3. method without return type (void) and without parameters - void additionOfTwoNumbers()
	 4. method without return type (void) and with parameters  - void additionOfTwoNumbers(int a, int b)
	 
	 */
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		additionOfTwoNumbers1(10,20); // method calling
		System.out.println("Addition of two is:"+additionOfTwoNumbers2());
		System.out.println("Addition of two no:"+additionOfTwoNumbers3(100,200));
		additionOfTwoNumbers4();
		
		
	}
	
	// write a method for addition of two numbers
	//4. method without return type (void) and with parameters
	public static void additionOfTwoNumbers1(int a, int b) {  // method declaration / definition
		// method body
		int c;
		c=a+b;
		System.out.println("Addition of two numbers:"+c);
		
	}
	
	
	// 1. method with return type and no parameters int additionOfTwoNumbers() 
	public static int additionOfTwoNumbers2() {
		int a=50,b=60; 
		return a+b;
	}
	
	// 2. method with return type and with parameters - int additionOfTwoNumbers(int a, int b)
	public static int additionOfTwoNumbers3(int a,int b) {
		return a+b;
	}
	
	
	// 3. method without return type (void) and without parameters - void additionOfTwoNumbers()
	
	public static void additionOfTwoNumbers4() {
		int a=500,b=600;
		int c=a+b;
		System.out.println("Addition of two no:"+c);  // 
	}

}

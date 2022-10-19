package javaBasics;

public class VariableTypesPractice {
	/*
	 Variable Types
	 
	 1. Local variable
	 2. instance variable
	 3. static variable
	 
	 1. Local variable
	   1. these are declared inside method or block
	   2. scope and lifetime is within method or block where they declared
	   3. Memory is allocated when method is called and released when method execution done.
	   4. stored in stack memory.
	   5. no default value.
	   6. can not use static or access modifiers with local variables, can use
	   
	 2. Instance variables
	 	1. declared within class and outside of any method / block
	 	2. scope and lifetime depends on access modifiers.
	 	3. Memory is allocated while creating object of a class. Object per copy Object:- ClassName objectName=new ClassName():
	 	4. stored in heap memory
	    5. default value is 0, boolean = false, object- null.
	    
	  3. Static variables
	    1. declared within class and outside of any method / block with static keyword
	 	2. scope and lifetime depends on access modifiers.
	 	3. memory is allocated while loading the class.
	 	4. stored in heap memory
	 	5. class per copy.
	 	6. default value is 0, boolean = false, object- null.
 
	    
	 */
	
	boolean temp;
	int a;  // this is instance variable
    VariableTypesPractice obj;
    int b;
    
    static int c;
    
	
	public static void main(String[] args) {
		final int a=10;
	//	add();
		
		VariableTypesPractice obj1=new VariableTypesPractice();
		VariableTypesPractice obj2=new VariableTypesPractice();
		System.out.println(obj1.a); // 0
		
		
		
		obj1.c=100;
		obj1.a=500;
		System.out.println("C="+c); // 100
		System.out.println("a="+obj1.a); // 500
		
		
		obj2.c=200;
		
		System.out.println("C="+obj2.c); // 200
		System.out.println("a="+obj2.a); // 500
		
		VariableTypesPractice obj3=new VariableTypesPractice();
		
		System.out.println(obj3.c);
	}
	
	static void add() {
		VariableTypesPractice obj3=new VariableTypesPractice();
		
		
		obj3.a=100;
		
		int a=50; int c=100;
		
		System.out.println(a);
		System.out.println(c);
		
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		
		
		
	}

}

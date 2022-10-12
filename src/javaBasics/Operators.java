package javaBasics;

public class Operators {
	/*
	 Operators
	 1. Arithmetic
	 2. Assignment
	 3. Logical
	 4. Relational
	 5. Increment / Decrement
	 6. Conditional.
	 
	 Arithmetic- +, -, *, /, % (Remainder)
	 
	  2. Assignment.
	    =, +=, -=, *=,/=,%=
	    
	    a+=10;
	    a=a+10;
	 
	  3. Logical  
	      &&, ||, !
	      
	      cond1 && cond2 --> if all conditions are true then output will be true otherwise it is false
	      cond1 || cond2 --> if anyone of the condition is true then output will be true otherwise it is false.
	      !condition --> if condition true then output will be false and vicevarse 
	 
	  4 Relational 
	  	==, <, >, <=,>=, !=.
	  	
	  5 Conditional operator
	     condition?statement1:statement2;
	     
	 6. Increment / Decrement
	 
	    ++  , --
	    
	    a++ ---> a=a+1;
	    a-- --> a=a-1;
	    
	    pre and post
	    
	    pre 
	    ++a , --a
	    
	    post
	    a++, a--
	    
	    
	 
	 
	 
	 */
	
	public static void main(String[] args) {
		int a=20,b=7;  // 20/3= 6 with remainder 2,   20%3=2
		int c= a%b;
		//System.out.println(c);
		//assignment();
		//conditonalOperator();
		incrementDecrement();
		
	}
	
	static void assignment() {
		int b=20;
		int a=10;
		a+=b; //a=a+b
		
		System.out.println(a);
		
	}
	
	static void conditonalOperator() {
		int a=10, b=20;
		int c;
		// condition?statement1:statement2;
		c=b<a?b:a;
		System.out.println(c);
	}
	
	static void incrementDecrement() {
		int a=10,b=20;
		
		System.out.println(++a); // 11
		System.out.println(b++); //20
		
		System.out.println(++b);
		
	}

}

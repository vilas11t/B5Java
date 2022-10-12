package javaBasics;

public class LoopsPractice {
	/*
	 * Loops
	 * 
	 * For 
	 * while 
	 * do-- while
	 * 
	 * for each loops
	 * 
	 * for
	 * 
	 * syntax
	 * 
	 * loop variable 
	 * for(initialization; condition; increment/decrement){
	 * 
	 * loop body
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * while
	 * 
	 * while(condition){
	 * 
	 * body of loop
	 * 
	 * }
	 
	  
	  
	  
	  
	  do-- while
	  
	  do{
	  
	    body of loop
	  
	  }while(condition);
	  
	 */

	public static void main(String[] args) {
		int i = 0;
		for (i = 0; i <= 10; i++) {

			// System.out.println(i);
		}

		// allEvenNoUpTo100();
		//allEvenNoUpTo100UsingWhileLoop();
		allEvenNoUpTo100UsingDoWhileLoop();

	}

	static void allEvenNoUpTo100() {
		// to print all even no upto 100
		for (int i = 0; i <= 100; i = i + 2) {
			System.out.println(i);
		}
	}

	static void allEvenNoUpTo100UsingWhileLoop() {
		// to print all even no upto 100 using while loop
		
		int i=0;
		while(i<=100) {
			System.out.println(i);
			i=i+2;
		}

	}
	
	
	static void allEvenNoUpTo100UsingDoWhileLoop() {
		// to print all even no upto 100 using while loop
		
		int i=0;
		
		do {
			System.out.println(i);
			i+=2;
		}while(i<=100);
		

	}
	
	

}

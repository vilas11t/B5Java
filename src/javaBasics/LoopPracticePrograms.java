package javaBasics;

public class LoopPracticePrograms {

	public static void main(String[] args) {
		factorial();
	}

	// to print factorial of a number // 4=4*3*2*1=24,
	// n = n* (n-1)*(n-2)*...*1

	static void factorial() {
		int n=4, fact = 1;
		
		for (int i = n; i >= 1; i--) {
			fact = fact * i;  
			/*
			 * loop-1
			   i=4; 4>=1-->T
			   fact=1*4=4
			   
			   loop-2
			   i=3; 3>=1--.T
			   fact=4*3=12
			   
			   loop-3
			   i=2; 2>=1--.T
			   fact=12*2=24
			   
			   loop-4
			   i=1; 1>=1--.T
			   fact=24*1=24
			   
			   loop-5
			   i=0; i>=0--.F
			 */
			
			
		}
		
		System.out.println("Factorial is:"+fact);
	}

}

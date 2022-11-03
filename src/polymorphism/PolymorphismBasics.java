package polymorphism;

public class PolymorphismBasics {
   /*
	Polymorphism - Ability to take more forms.
	 
	 1. Static binding / compile time Polymorphism / method overloading
	 2. dynamic binding / run time Polymorphism / method overriding 
	 
	 1. method overloading
	    same class having more than one method with same name but different parameters.
	    (parameters are different means- either by number or data type)
	    ex.1. int add(int a,int b) , int add(int a, int b, int c).
	      2. int m1(char c),  void m1(int a)
	    method overloading does not look into return type.
	    - we can overload- static, private,abstract and final methods
	    
	*/
	
	
	public static void main(String[] args) {
		
		System.out.println(add(10,30));
		System.out.println(add(10,30,40));
		System.out.println(add(10,30,10,50));
		System.out.println(add(10,30.6f));
	}
	
	static int add(int a,int b) {
		return a+b;
	}
	
	
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	
	static int add(int a,int b,int c,int d) {
		return a+b+c;
	}
	
	static float add(int a,float b) {
		return a+b;
	}
	
	
	
	
	
}

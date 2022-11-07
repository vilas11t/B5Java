package inheritance;

public class C {
	
	public static void main(String[] args) {
		
		A a=new A(); // parent class object // only parent class methods can be accessed.
		a.m1();
		
		A a1=new B(); // Parent class can hold child class object // only parent class methods can be accessed if method overriding is not used
		a1.m1();
		
		B b=new B(); // child class object // it can access methods of parent and child class
		
		b.m1(); // Class A
		
		b.m2(); // Class B
		
		b.m3(); // Class B
		
		// B b=new A(); not bale to create
		
			
		
		
		
		
	}

}

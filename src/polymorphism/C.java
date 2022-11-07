package polymorphism;

public class C {
	
	public static void main(String[] args) {
		
		A a=new A(); // only parent class methods
		a.m2();
		
		B b=new B(); // parent and child class methods
		b.m2();
		
		A a1=new B();  // if parent class is holding child class object if we called overridden method then child class method will be executed.
		
		a1.m2();
		a1.m3();
		
		
		
		
		
	}

}

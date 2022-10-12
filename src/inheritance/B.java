package inheritance;

public class B extends A{
	
	public void m2() {
		m1(); // class A method
		System.out.println("this is class B m2 method");
	}
	
	public void m3() {
		System.out.println("this is class B m3 method");
	}

}

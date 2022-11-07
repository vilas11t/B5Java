package polymorphism;

public class A {
	
	 X m1() {
		System.out.println("this is m1 in class Parent class A ");
		return new X();
	}
	 
	void m2() {
		System.out.println("m2 in class A");
	}
	
	void m3() {
		System.out.println("m3 in class A not override");
	}

}

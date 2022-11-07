package polymorphism;

public class B extends A {

	 Y m1() {
		System.out.println("This is method m1 in child class B");
		return new Y();
	}
	 
	 void m2() {
			System.out.println("m2 in class B");
		}
		
		void m4() {
			System.out.println("m4 in class B not overide");
		}
}

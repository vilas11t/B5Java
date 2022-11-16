package abstraction;

public abstract class Bike {
	
	Bike(){
		System.out.println("This is bike abstract class constructor");
	}
	
	abstract void speed();
	
	static void tyres() {
		System.out.println("All bikes has 2 tyres");
	}
	
	final void m1() {
		System.out.println("Final method in Abstarct class");
	}
	
}

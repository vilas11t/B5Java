package abstraction;

public class Circle implements Shape {

	
	public void draw() {
		
		System.out.println("Draw Circle");
	}
	
	void m1() {
		System.out.println("m1 method of circle class");
	}
	
	public static void main(String[] args) {
		Circle c=new Circle();
		c.draw();
		c.m1();
	}

}

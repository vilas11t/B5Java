package javaBasics;

public class AccessModifiers {
	/*
	  Access modifiers
	  4 types
	  
	                  within Class      Within Package      outside of Package    
	  public            yes                   yes                  yes
	  protected         yes                   yes                  yes(with inheritance concept)
	  default           yes                   yes                  NO
	  private           Yes                   NO                   NO
	 */
	
	int a=50;
	private int b=100;
	protected int c=500;
	public int d=100;
	
	public void method1() {
		System.out.println("This is public method of class-AccessModifiers ");
	}
	
	protected void method2() {
		System.out.println("This is protected method of class-AccessModifiers ");
	}
	
    void method3() {
		System.out.println("This is default method of class-AccessModifiers ");
	}
	
	private void method4() {
		System.out.println("This is private method of class-AccessModifiers ");
	}
	
	
	
	public static void main(String[] args) {
		
	}

}

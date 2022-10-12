package javaBasics;

public class ConstructorPractice {
	
	/*
	 Constructor
	 
	 1. it is a blueprint of method having same name as of class name
	 2. no return type.
	 3. Constructor executed while creating object of class.
	 4. it used to assign value to the instance variables.
	 5. can not use static, final, abstract but we can use - public, private, protected, default 
	 
	 types
	 1. default 
	 2. user defined
	    a. parameterized
	    b. non parameterized
	 
	 1. default 
	    when object is created default constructor will execute.
	
	 
	 2. user defined
	    a. parameterized
	    b. non parameterized
	 
	 
	 
	 Constructor chaining
	  - calling of one Constructor into another constructor 
	  - it implemented using this keyword
	  - this keyword should be first line in Constructor.
	 */
	
	int a;
	int b;
	
	 public static void main(String[] args) {
		 ConstructorPractice obj1=new ConstructorPractice();
		 System.out.println(obj1.a);
		 
		 ConstructorPractice obj2=new ConstructorPractice(100);
		 System.out.println(obj2.a);
		 
		 ConstructorPractice obj3=new ConstructorPractice(500,600);
		 System.out.println(obj3.a);
		 System.out.println(obj3.b);
	}
	 
	 
	 ConstructorPractice(){
		 this(700);
		 System.out.println("This is non parameterized constructor");
	 }
	 
	 
	 ConstructorPractice(int a){
		 this.a=a;  // this- it is used to refer object of current class.
	 }
	 
	 
	 ConstructorPractice(int a,int b){
		 this.a=a;
		 this.b=b;
		 
	 }
	 

}

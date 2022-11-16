package abstraction;

public class AbstractionBasic {
	/*
	 Abstraction :-  hiding implementation details and showing only functionality
	 
	 1.Abstract Class (0-100% abstraction)
	 2.Interface (100% abstraction)

	1.Abstract Class (0-100% abstraction)
	 - it is a class declared with abstract keyword 
	 - it contains Abstract as well as non Abstract methods
	 - Abstract methods- which has only declaration but not body ex. int add(int a, int b); void print();
	 -it can not be instantiated (can not create abstract class object) if A is abstract class than can not create object -- A a=new A();
	 -It can have constructors and static methods. (when abstract class-- child class object is created constructed from abstract class will be executed)
	 -It has final methods.
	
	
	2.Interface (100% abstraction)
	
	- it is blueprint of class having only abstract methods and final variables.
	- by default methods in interface are public, abstract and variables are static and final weather we declared or not.
	- declaration Interface Interface_Name
	- it can not be instantiated
	- we need implementing class for interface.(implements)
	- not having constructors
	- one class can implements more than one interface. Class A implements interface1,interface2.., 
	- one interface can extends another interface. Interface A extends InterfaceB  ,  Class X implements A
	  
	  
	  H.W.
	   implement:- one class can implements more than one interface. 
	   implement: one interface can extends another interface. Interface A extends InterfaceB  ,  Class X implements A
	

	 */
	
	public static void main(String[] args) {
		
	}

}

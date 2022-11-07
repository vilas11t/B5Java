package polymorphism;

public class MethodOverriding {
	/*
	 Method Overriding:
	 
	    - Same method present in parent class and child class.
	    - Same method means- same return type, same name, same parameters.
	    -can not override private, static and final methods.
	    - Access modifiers-
	      Parent class method       child class method
	       public                     public
	       private                    can not override private method
	       protected                  protected, public
	       default                    default,protected,public
	       
	       - in method overriding we can increase visibility but can not decrease.
	       
	     -can we change method return type in method overriding.
	         -> yes we can change return type but it should be covariant.
	            if method m1 in parent class returns B then method m1 in child class
	            should return B or child of B.
	      
	       - How to handle exception in method overriding.
	 
	 */

}

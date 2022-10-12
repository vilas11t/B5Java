package javaBasics;

public class BlocksPractice {
	
	/*
	 Blocks
	 
	 1. instance block
	 2. static block
	 
	 
	 1. instance block
	 	it will execute while create object
	  
	  {
	    code for block
	  
	  }
	  
	 2. static block
	    it will execute while loading class
	    
	   
	    static{
	        code for static block;
	    }
	   
	 
	 */
	
	public static void main(String[] args) {
		BlocksPractice obj1=new BlocksPractice();
		BlocksPractice obj2=new BlocksPractice();
		
	}
	
	
	// instance block
	{
		System.out.println("Instance block");
	
	}
	
	
	static {
		System.out.println("This is static block");
	
	}
	
	

}

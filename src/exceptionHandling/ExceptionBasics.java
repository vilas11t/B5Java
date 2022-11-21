package exceptionHandling;

public class ExceptionBasics {
	/*
	 Exception:- It is a event when occur that disturbs normal flow of program execution.
	 
	 Reasons
	  1. Opening of  on existing file
	  2. index used out of range
	  3. End user input mistake
	  4. network connection problem
	  etc
	  
	  Types
	    1. checked exception / compile time
	    2. unchecked exception / run time time exception
	    3. errors
	    
	    1. checked exception / compile time
	         checked by compiler at compile time.
	       ex.- IOException, CLassNotFoundExsception, FileNotFoundException, etc
	       
	    2.unchecked exception / run time exception
	      it is not checked by compiler
	      ex. ArithmeticException, ArrayIndexOutOfBoundException,NumberForamtException, etc 
	      
	    3. errors
	         it is also called unchecked exception.
	         
	            
	     How to handle exception
	      - using Try-- catch block
	      - Throw keyword
	      
	      Try-- catch block
	      
	      try{
	      
	        code where possibility of exception
	      
	      }
	      catch(Exception e ){
	         e.getMessage()- print only description of exception
	         e.toString() - type and description
	         printstacktrace() - type, description and class with line no. where exception came.
	         
	      }
	      
	      finally{
	        // it will always execute weather exception or not.
	         
	         when finally block will not execute
	         1. when program terminates before reaching to try block
	         2. when we user System.exit(0).
	         
	      }
	 
	 */
	
	public static void main(String[] args) {
		
		int a=10, b=2;
		int c = 0;
		
		try {
		c=a/b;
		}
		
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		catch( Exception e) {
			
		}
		
		finally {
			System.out.println("This is finally block code");
			}
		
		
		
		System.out.println("Rest of code");
		
		System.out.println(c);
		
	}

}

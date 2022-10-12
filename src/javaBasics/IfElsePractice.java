package javaBasics;

public class IfElsePractice {
	
	/*
	 Selection Statement
	 
	 if
	 
	 If-- else
	 
	 nested if--- else
	 
	 if--elseif-- else
	 
	 
	 
	 
	 if
	
	 syntax---.
	 if(condition){
	    stat1
	    stat2
	    .
	    .
	    statn
	 }
	 
	 next code
	 
	
	
	 If-- else
	 
	 if(condition){
	    stat1
	    stat2
	    .
	    .
	    statn
	 }
	 
	 else{
	    stat1
	    stat2
	    .
	    .
	    statn
	 
	 
	 }
	 
	 rest of the code
	 
	 
	 
	 
	 nested if-- else
	 
	 if(Condition){
	   if()
	   else
	   
	   if()
	   else
	   
	 
	 }
	 
	 else{
	    if()
	    else
	    
	    if()
	 
	 
	 }
	 
	 
	 
	 
	  if--elseif-- else
	  
	  if(condition){
	  stat1
	  stat2
	  ..
	  }
	  
	  elseif(condition){
	   stat1
	  stat2
	  ..
	  }
	  
	  elseif(condition){
	   stat1
	  stat2
	  ..
	  }
	  
	  
	  else {
	   stat1
	  stat2
	  ..
	  
	  }
	  
	
	 */
	
	
	public static void main(String[] args) {
		int age=15;
		
		if(age>=18) 
			System.out.println("Eligible for voting");
		
		else
			System.out.println("Not eligible for voting");
		
		
		System.out.println("Rest of the code");
		
		nestedIfElse();
		
		grades();
	}
	
	
	static void nestedIfElse() {
		int a=500,b=70,c=3000;
		
		if(a>b) {
			if(a>c) 
				System.out.println("Greatest no a:"+a);
			else
				System.out.println("Greatest no c:"+c);
				
			}
		else
		{
			if(b>c)
				System.out.println("Greates no b:"+b);
			else
				System.out.println("Greatest no c:"+c);
		
		}
		
	}
	
	static void grades() {
		// below 60--> B  , 60-80 ---> A , Above 80--> A++
		float marks=90;
		
		if(marks>=35 && marks<=60 )
			System.out.println("Grade B");
		
		else if(marks>60 && marks<=80 )
			System.out.println("Grade A");
		
		else if(marks>80 && marks<=100 )
			System.out.println("Grade A++");
		else
			System.out.println("Invalid marks");
		
		
		
	}
	
	
	

}

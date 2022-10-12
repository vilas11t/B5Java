package javaBasics;

public class BasicLoopsPrograms {
	
	public static void main(String[] args) {
		//fibonacciSeries();
		
		if(checkPalindromeNumber(1222221))
			System.out.println("No. is palindrome");
		else
			System.out.println("No is not palindrome");
		
		if(checkPrimeNumber(123457))
			System.out.println("Prime no");
		else
			System.out.println("Not prime no.");
		
	}
	
	// Write a method to print fibonaci series -n
	/*
	 Theory-
	   0,1,1,2,3,5,8,13,.....,(n-2)+(n-1),n
	   
	   0,1,1,
	 */
	
	static void fibonacciSeries() {
		int n=20, n1=0,n2=1,nextterm;
		
		System.out.println(n1+"\n"+n2);
		
		for(int i=1;i<=n-2;i++) {
			nextterm=n1+n2;
			System.out.println(nextterm);
			n1=n2;
			n2=nextterm;
		}
	}
	
	
	// Palindrome no. - ex 121-->121.
	// n
	// 1. to find reverse of n lets it is- k
	// check if k==n then n is a palindrome no.
	// 123- 3*100 + 2*10 +1= 300 + 20 +1=321
	 // 1 . 3--> 123%10=3 
	//  2. 12-->  2
	// k=k*10+rem;
	
	// 
	
	static boolean checkPalindromeNumber(int n) {
		int k=0,rem;
		int n1=n;
		
		while(n1>0) {
		 	rem=n1%10;
		 	k=k*10+rem;
		 	n1=n1/10;
		}
		/*
		 1. n1=123
		    n1>0 --- 123>0--.true
		    rem=123%10 =3
		    k=k*10+rem  : 0*10+3= 3
		    k=3
		    n1=n1/10  123/10=12
		    
		 2.
		   n1=12
		   12>0--True
		   rem=12%10=2
		   k=3*10+2=32
		   n1=12/10=1
		   
		 3.
		   n1=1
		   1>0  true
		   rem=1%10=1
		   k=32*10+1=321
		   n1=1/10=0.1=0
		   
		 4. n1=0
		 0>0--False
		   
		 */
		
		if(n==k)
			return true;
		else
			return false;
	}
	
	// To check prime no.
	// 2,3,5,7,11,13
	//n--> if it is not divisible by any number between 2 to n-1.
	// for(i=2;i<=n-1;i++) --> if(n%i==0) then break loop
	
	static boolean checkPrimeNumber(int n) {
		int temp=0;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				temp=1;
				break;
			}
		}
		
		if(temp==1)
			return false;
		else
			return true;
		
	}
	
	// lCM and GCD
	//  12, 16  --> GCD=4 , lcm- 48
	// 10,20---> gcd=10,  lcm=20.
	// 11,13  gcd=1 lcm=11*13=143.
	//lcm= (n1*n2)/gcd; 
	
	// Leap year
	// 1. if year is divisible by 4 then it is leap year
	// 2. if year is divisible by 4 and it is divisible by 100 then it should be divisible by 400 then it is leap year. else not leap year

	// amstrong  no.
	// 153- 1*1*1 + 5*5*5 + 3*3*3= 153
	
}

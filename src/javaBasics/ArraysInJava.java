package javaBasics;

public class ArraysInJava {
	/*
	 Array: - it is collection of elements having same data type and stored in continuous memory location;
	          indexes are used to access array elements. index of first element=0 and index of last element=size-1.
	          arrays are fixed in size.
	          
	          Single dimensional
	          multi-dimensional
	          
	          Single dimensional
	          declaration :int [10]a; int[] a; int a[]; 
	          
	          multi-dimensional;
	           declaration :- float[3][3] a;  char [][]b;  long c[][];
	 */

	 
	public static void main(String[] args) {
		int a[]= {10,30,50,15}; // size=4, index of first element=0, index of last element=3 , memory=16 byte
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println(sumOfArray(a));
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}

	
	// sum of array element
	
	static int sumOfArray(int a[]) {
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		return sum;
	}
	
	
	void arrayPreactice1() {
		int a[]=new int[500];
		int b[][]=new int[3][3];
		
		
		
	}
	
	// avg of arraylelemnts
	// array sorting
	// search element in array
	// find largest / smallest no. in array
	
}

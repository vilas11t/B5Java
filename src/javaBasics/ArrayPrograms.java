package javaBasics;

public class ArrayPrograms {
	
	
	/*
	 a=20, b=50;
	 temp=a; temp=20;
	 a=b;  a=50
	 b=temp; b=20
	 
	 */
	
	public static void main(String[] args) {
		int a[]= {100,50,10,70,40,50}; 
		//System.out.println("Average of array elements:"+avgOfArray(a));
		
		//sortAsc(a);
		//searchNumberInArray(a);
		searchNumberAtMultipleindexInArray(a);
		
	}
	
	// Average of array
	static float avgOfArray(int a[]) {
		float avg;
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		avg=sum/a.length;
		return avg;
	}
	
	
	// Sorting of array
	
	static void sortAsc(int a[]) {
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length-1; j++) {  
				if(a[j] > a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	
	// Search element in array
	
	static void searchNumberInArray(int a[]) {
		
		int key=4000,index=0,i;
		
		for (i = 0; i < a.length; i++) {
			if(key==a[i]) {
				index=i;
				break;
			}
		}
		// i==lengh of array.
		if(i==a.length)
			System.out.println("not found");
		else
			System.out.println("Found at index:"+index);
		
	}
	
	
static void searchNumberAtMultipleindexInArray(int a[]) {
		
		int key=50000,i,j=0;
		int index[]=new int[a.length];
	
		for (i = 0; i < a.length; i++) {
			if(key==a[i]) {
				index[j]=i;
				j++;
			}
		}
		
		// i==lengh of array.
		if(index==null)
			System.out.println("not found");
		
		else {
			System.out.println("Element found at index/es:");
			for (int j2 = 0; j2 < index.length; j2++) {
				System.out.print(index[j2]+",");
			}
		}
			
	}
	
}


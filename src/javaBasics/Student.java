package javaBasics;

public class Student {
	
	int roll_no;
	float marks;
	
	Student(int roll_no, float marks){
		this.roll_no=roll_no;
		this.marks=marks;
	}
	
	void getData() {
		System.out.println("\n\nStudent Data: \nRoll No:"+this.roll_no+"\nMarks:"+marks);
	}
	
	public static void main(String[] args) {
		Student s1=new Student(1, 75.10f);
		Student s2=new Student(2, 80.50f);
		Student s3=new Student(3, 50.50f);
		Student s4=new Student(4, 85.50f);
		s1.getData();
		s2.getData();
		s3.getData();
		s4.getData();
	}

}

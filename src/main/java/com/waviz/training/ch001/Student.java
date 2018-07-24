package com.waviz.training.ch001;

public class Student {
	int sum=0;
	public void sumOperation(int x, int y) {
		sum=x+y;
	}
	public void display() {
		System.out.println("Sum of Two No. is="+sum);
	}

	public static void main(String[] args) {
		Student s=new Student();
		s.sumOperation(20, 30);
		s.display();
		

	}

}

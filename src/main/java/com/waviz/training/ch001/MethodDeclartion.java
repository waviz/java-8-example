package com.waviz.training.ch001;

public class MethodDeclartion {
	public static void getName() {
		System.out.println("My Name is Krishna Mohan");
	}
	public void show() {
		System.out.println("I am in Show Method");
	}
	public void getResult() {
		System.out.println("You are passed in Exam");
	}
	public void showStatus() {
		System.out.println("Your status is updating........");
	}

	public static void main(String[] args) {
		MethodDeclartion method = new MethodDeclartion();
		MethodDeclartion.getName();
		method.show();
		method.getResult();
		method.showStatus();
		

	}

}

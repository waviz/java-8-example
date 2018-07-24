package com.waviz.training.ch002;

class Test {
	Test(){
		
	}
	public Test(String s) {
		System.out.print("B");
	}
}

public class ControctorTest extends Test {
	public ControctorTest(String s) {
		super(s);
		System.out.print("D");
	}

	public static void main(String[] args) {
		new ControctorTest("A");
		System.out.println(" ");

	}

}

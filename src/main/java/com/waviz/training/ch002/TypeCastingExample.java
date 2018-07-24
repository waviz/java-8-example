package com.waviz.training.ch002;

class A {
	public void do1() {
		System.out.println("A class");
	}
}

class B extends A {
	public void do2() {
		System.out.println("B class");
	}
}

public class TypeCastingExample {

	public static void main(String[] args) {
		A x1 = new A();
		A a1 = new B();
		B b = new B();
		b.do2();
	//(B)a1.do2();
		((B)a1).do2();
		

	}

}

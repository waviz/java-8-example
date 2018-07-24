package com.waviz.training.ch001;

interface X1 {
	public void show();
}

interface Y extends X1 {
	public void display();
}

public class ExtendsInterface implements Y {
	public void show() {
		System.out.println("this method from Interface X");
	}

	public void display() {
		System.out.println("this method from Interface Y");
	}

	public static void main(String arg[]) {
		ExtendsInterface inter = new ExtendsInterface();
		inter.show();
		inter.display();
	}

}

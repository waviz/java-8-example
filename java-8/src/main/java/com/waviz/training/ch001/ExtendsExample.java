package com.waviz.training.ch001;

class X {
	int x = 20;

	public void show() {
		System.out.println("Supper Class ");
	}
}

public class ExtendsExample extends X {
	int y = 30, sum = 0;

	public void sumOperation() {
		sum = x + y;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendsExample exten = new ExtendsExample();
		exten.show();
		exten.sumOperation();

	}

}

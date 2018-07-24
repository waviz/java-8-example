package com.ChapterOne;



public class JunitTestExample {
	int sum=0;
	
	public void sumExample(int x, int y) {
	 sum=x+y;
	}
	public void show() {
		System.out.println("The sum of Two number is="+sum);
	}

	public static void main(String[] args) {
		JunitTestExample jtest=new JunitTestExample()
;
		jtest.sumExample(20, 30);
		jtest.show();
	}

}

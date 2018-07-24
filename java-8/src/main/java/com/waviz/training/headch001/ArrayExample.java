package com.waviz.training.headch001;

public class ArrayExample {

	public static void main(String[] args) {
		int[] arr = {10,20,30};
		for(int x=0;x<arr.length;x=x+1) {
			arr[x] = arr[x]+1;
		}
			for(Number number : arr ) {
				System.out.println(number);
			}
				

	}

}

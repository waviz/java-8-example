package com.ChapterOne;

public class QuestionNo8 {
	public enum Days{
		MON,TUE,WED,THU,FRI,SAT,SUN
	};

	public static void main(String[] args) {
		for(Days day : Days.values()) {
			System.out.print(" "+day);
		}
		System.out.println();
		
		Days [] d2 = Days.values();
		System.out.println("=================");
		System.out.println(d2[2]);

	}

}
